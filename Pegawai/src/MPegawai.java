/*
 * File : MPegawai.java
 * deskripsi : Main dari class pegawai beserta class anak-anaknya
 * nama : Claudia Meitania Putri
 * tanggal : 18 Maret 2025
 */

import java.time.LocalDate;
public class MPegawai {
    public static void main(String[] args) {
        // Dosen Tetap
        DosenTetap dt = new DosenTetap("12345", "dr. Linda", LocalDate.of(1985, 5, 5), LocalDate.of(2015, 1, 1), 6000000, "Kedokteran", "NIDN123");
        
        // Dosen Tamu (Kontrak berakhir 2027)
        DosenTamu dtm = new DosenTamu("54321", "Agus M.Kom", LocalDate.of(1990, 5, 5), LocalDate.of(2023, 1, 1), 4500000, "Sains dan Matematika", "NIDK987", LocalDate.of(2027, 12, 31));
        
        // Tendik
        Tendik td = new Tendik("67890", "Lana K.", LocalDate.of(1995, 8, 15), LocalDate.of(2019, 10, 1), 3500000, "Sumber Daya");

        dt.printInfo();
        System.out.println();
        dtm.printInfo();
        System.out.println();
        td.printInfo();
    }
}
