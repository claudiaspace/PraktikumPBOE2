/*
 * File : Tendik.java
 * deskripsi : Class anak Tendik dari induk Pegawai
 * nama : Claudia Meitania Putri
 * tanggal : 18 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai{
    private String bidang;
    private static int BUP = 55;

    //konstruktor berparameter
    public Tendik(String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String bidang) {
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    //getter & setter
    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    //BUP
    @Override
    public int getBUP() {
        return BUP;
    }

    //tunjangan
    @Override
    public double getTunjangan() {
        int masaKerja = Period.between(this.TMT, LocalDate.now()).getYears();
        return 0.01 * masaKerja * gajiPokok;
    }

    //tanggal pensiun
    public String getTglPensiun() {
        LocalDate tglPensiun = tanggalLahir.plusYears(BUP).withDayOfMonth(1).plusYears(1);
        return formatTanggal(tglPensiun);
    }

    //print
    @Override 
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan: Tendik");
        System.out.println("Bidang: " + bidang);
        System.out.println("Tanggal Pensiun: " + getTglPensiun());
        System.out.println("Tunjangan: " + getTunjangan());
    }


}
