/* Nama File : MataKuliah.java
Deskripsi    : berisi atribut dan method dalam class MataKuliah
Pembuat      : Claudia Meitania Putri 24060124140188 
Tanggal      : 05/03/2026 */

public class MataKuliah {
    /*****************ATRIBUT*****************/
    private String idMatkul;
    private String nama;
    private int sks;

    /*****************METHOD*****************/
    //konstruktor tanpa parameter
    public MataKuliah() {
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    //konstruktor dengan parameter idMatkul, nama, dan sks
    public MataKuliah (String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    //selektor idMatkul
    public String getIdMatkul() {
        return idMatkul;
    }

    //selektor nama
    public String getNama() {
        return nama;
    }

    //selektor sks
    public int getSks() {
        return sks;
    }

    //mutator idMatkul
    void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    //mutator nama
    void setNama(String nama) {
        this.nama = nama;
    }

    //mutator sks
    void setSks(int sks) {
        this.sks = sks;
    }
}
