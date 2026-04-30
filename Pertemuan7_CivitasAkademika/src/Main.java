/* NIM : 240601241440188
 * Nama : Claudia Meitania Putri
 * Tanggal : 24 April 2026
 */
public class Main {
    public static void main(String[] args) {
        Dosen D1 = new Dosen("Budi", "123456789");
        Dosen D2 = new Dosen("Rita", "987654321");

        Mahasiswa M1 = new Mahasiswa("Claudia", "24060124140188", D1);
        Mahasiswa M2 = new Mahasiswa("Lala", "24060124140177", D1);
        Mahasiswa M3 = new Mahasiswa("Kevin", "24060124140200", D1);
        Mahasiswa M4 = new Mahasiswa("Andi", "24060124140097", D2);
        Mahasiswa M5 = new Mahasiswa("Putri", "24060124140067", D2);

        Seminar S = new Seminar();

        S.registrasi(D1);
        S.registrasi(D2);
        S.registrasi(M1);
        S.registrasi(M2);
        S.registrasi(M3);
        S.registrasi(M4);
        S.registrasi(M5);

        System.out.println("Nama Peserta: ");
        S.tampilPeserta();
        System.out.println("Jumlah Peserta: " + S.countPeserta());
        System.out.println("Jumlah Peserta Mahasiswa: " + S.countMahasiswa());

        System.out.println("Data Mahasiswa: ");
        M1.tampilDataMahasiswa();
        M2.tampilDataMahasiswa();
        M3.tampilDataMahasiswa();
        M4.tampilDataMahasiswa();
        M5.tampilDataMahasiswa();

    }
}
