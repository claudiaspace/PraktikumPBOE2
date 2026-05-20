/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistent;
import java.sql.*;
/**
 *
 * @author Claudia
 * File : MySQLPersonDAO.java
 * Deskripsi : implementasi PersonDAO untuk MYSQL
 */
public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        
        // 2. Load Driver (Sudah benar menggunakan .cj untuk versi 9.x)
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // 3. Gunakan URL yang lengkap agar tidak error timezone/SSL
        String url = "jdbc:mysql://127.0.0.1:3306/pbo?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        
        // 4. Deklarasikan koneksi CUKUP SATU KALI
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo", "root", "Odi221"); 
        
        // 5. Eksekusi query INSERT
        String query = "INSERT INTO person (name) VALUES ('" + name + "')"; 
        System.out.println(query);
        
        Statement s = con.createStatement(); 
        s.executeUpdate(query); 
        
        // 6. Tutup koneksi
        s.close();
        con.close(); 
    }
}
