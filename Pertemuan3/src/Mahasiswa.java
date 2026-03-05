/* Nama File : Mahasiswa.java
Deskripsi    : berisi atribut dan method dalam class Mahasiswa
Pembuat      : Claudia Meitania Putri 24060124140188 
Tanggal      : 05/03/2026 */

import java.util.ArrayList;
public class Mahasiswa {
    /*****************ATRIBUT*****************/
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /*****************METHOD*****************/
    //konstruktor untuk membuat mahasiswa tanpa parameter
    public Mahasiswa () {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
        this.listMatKul = new ArrayList<>(); //Inisialisasi ArrayList kosong
    }

    //konstruktor untuk membuat mahasiswa dengan parameter nim, nama, dan prodi
    public Mahasiswa (String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>(); //Inisialisasi ArrayList kosong
    }

    //selektor nim
    public String getNim() {
        return nim;

    }

    //selektor nama
    public String getNama() {
        return nama;
    }
    
    //selektor prodi
    public String getProdi() {
        return prodi;
    }

    //selektor dosen wali
    public Dosen getDosenWali() {
        return dosenWali;
    }

    //selektor kendaraan
    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    //selektor list mata kuliah
    public ArrayList<MataKuliah> getListMatKul() {
        return listMatKul;
    }

    //mutator nim
    public void setNim(String nim) {
        this.nim = nim;

    }

    //mutator nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    //mutator prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    //mutator dosen wali
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    //mutator kendaraan
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    //menambahkan matkul
    public void addMatkul(MataKuliah newMatKul) {
        listMatKul.add(newMatKul);
    }

    //jumlah matkul
    public int getJumlahMatkul() {
        return this.getListMatKul().size();
    }

    //jumlah sks
    public int getJumlahSKS() {
        //kamus lokal
        int totalSKS, i;
        //algoritma
        totalSKS = 0;
        ArrayList<MataKuliah> listMatkul = this.getListMatKul();
        for (i=0; i<this.getJumlahMatkul(); i++) {
            totalSKS += listMatkul.get(i).getSks();
        }
        return totalSKS;
    }
    
    //menampilkan detail mahasiswa
    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        int i;
        for(i=0; i<listMatKul.size(); i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1) + " yang diambil : " + listMatKul.get(i).getNama());
        }
    }

    //menampilkan mahasiswa
    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

}
