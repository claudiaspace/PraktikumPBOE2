/* Nama File : Kendaraan.java
Deskripsi    : berisi atribut dan method dalam class Kendaraan
Pembuat      : Claudia Meitania Putri 24060124140188 
Tanggal      : 05/03/2026 */

public class Kendaraan {
    /*****************ATRIBUT*****************/
    private String noPlat;
    private String jenis; //motor atau mobil

    /*****************METHOD*****************/
    //konstruktor tanpa parameter
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    //konstruktor dengan parameter noPlat dan jenis
    public Kendaraan (String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //selektor noPlat
    public String getNoPlat() {
        return noPlat;
    }

    //selektor jenis
    public String getJenis() {
        return jenis;
    }

    //mutator noPlat
    void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    //mutator jenis
    void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
