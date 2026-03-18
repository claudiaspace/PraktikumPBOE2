/*
 * File : DosenTamu.java
 * deskripsi : Class anak DosenTamu dari induk Dosen
 * nama : Claudia Meitania Putri
 * tanggal : 18 Maret 2025
 */

import java.time.LocalDate;

public class DosenTamu extends Dosen{
    private String NIDK;
    private LocalDate tglBerakhirKontrak;

    //konstruktor berparameter
    public DosenTamu(String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String Fakultas, String NIDK, LocalDate tglBerakhirKontrak) {
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.tglBerakhirKontrak = tglBerakhirKontrak;
    }

    //getter & setter
    public String getNIDK() {
        return NIDK;
    }

    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    public LocalDate getTglBerakhirKontrak() {
        return tglBerakhirKontrak;
    }

    public void setTglBerakhirKontak(LocalDate tglBerakhirKontrak) {
        this.tglBerakhirKontrak = tglBerakhirKontrak;
    }

    //BUP
    @Override 
    public int getBUP() {
        return 0;
    }

    //tunjangan
    @Override 
    public double getTunjangan() {
        return 0.025 * gajiPokok;
    }

    //print
    @Override 
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK: " + NIDK);
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("Tanggal Berakhir Kontrak: " + tglBerakhirKontrak);
        System.out.println("Tunjangan: " + getTunjangan());
    }

    
}
