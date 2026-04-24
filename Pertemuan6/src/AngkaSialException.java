/**
 * File : AngkaSialException.java
 * deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 * nama : Claudia Meitania Putri/24060124140188
 * tanggal : 27 Maret 2026
 */
public class AngkaSialException extends Exception{
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
