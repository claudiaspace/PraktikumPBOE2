/* Nama File : Dosen.java
Deskripsi    : berisi atribut dan method dalam class Dosen
Pembuat      : Claudia Meitania Putri 24060124140188 
Tanggal      : 05/03/2026 */

public class Dosen {
    /*****************ATRIBUT*****************/
    private String nip;
    private String nama;
    private String prodi;

    /*****************METHOD*****************/
    //konstruktor tanpa parameter
    public Dosen () {
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    //konstruktor dengan parameter nip, nama, dan prodi
    public Dosen (String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //selektor nip
    public String getNIP() {
        return nip;
    }

    //selektor nama
    public String getNama() {
        return nama;
    }

    //selektor prodi
    public String getProdi() {
        return prodi;
    }

    //mutator nip
    void setNIP(String nip) {
        this.nip = nip;
    }

    //mutator nama
    void setNama(String nama) {
        this.nama = nama;
    }

    //mutator prodi
    void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
