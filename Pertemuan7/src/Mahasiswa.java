/* NIM : 240601241440188
 * Nama : Claudia Meitania Putri
 * Tanggal : 24 April 2026
 */
public class Mahasiswa {
    private String nim, nama, programStudi;

    // 2c. Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim = "-999";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    // 2d. Konstruktor dengan 3 parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = prodi;
    }

    // 2e. Konstruktor Kloning 
    public Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    // 2. Overloading Method setProgramStudi
    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    public void setProgramStudi(String prodi) {
        this.programStudi = prodi;
    }

    public void setProgramStudi(Mahasiswa m) {
        this.programStudi = m.programStudi;
    }

    public void tampilData() {
        System.out.println(nim + " | " + nama + " | " + programStudi);
    }
}
