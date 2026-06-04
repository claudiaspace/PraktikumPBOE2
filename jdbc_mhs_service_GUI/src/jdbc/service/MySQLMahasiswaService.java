/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;
/**
 *
 * @author Claudia
 */
public class MySQLMahasiswaService {
    Connection koneksi = null;
    
    public MySQLMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }
    
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }
    
    public void add(Mahasiswa mhs) {
        try {
            String query = "INSERT INTO mahasiswa (nama) VALUES (?)";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            ps.executeUpdate();
            System.out.println("Berhasil Insert");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void update(Mahasiswa mhs) {
        try {
            String query = "UPDATE mahasiswa SET nama=? WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
            System.out.println("Berhasil Update");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void delete(int id) {
        try {
            String query = "DELETE FROM mahasiswa WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Berhasil Delete");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;

        try {
            String query = "SELECT * FROM mahasiswa WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mhs = new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mhs;
    }
    
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMhs = new ArrayList<>();

        try {
            String query = "SELECT * FROM mahasiswa";
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                listMhs.add(new Mahasiswa(rs.getInt("id"), rs.getString("nama")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listMhs;
    }
    
    public boolean isEmpty() {
        boolean kosong = true;

        try {
            String query = "SELECT COUNT(*) AS jumlah FROM mahasiswa";
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                kosong = rs.getInt("jumlah") == 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kosong;
    }

    public void indexReset() {
        try {
            if (!isEmpty()) {
                System.out.println("Tabel belum kosong, index tidak direset");
                return;
            }

            String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
            Statement st = koneksi.createStatement();
            st.executeUpdate(query);

            System.out.println("Indeks berhasil direset");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void closeConnection() {
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
                System.out.println("Koneksi ditutup");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
