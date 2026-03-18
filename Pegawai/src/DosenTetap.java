/*
 * File : DosenTetap.java
 * deskripsi : Class anak DosenTetap dari induk Dosen
 * nama : Claudia Meitania Putri
 * tanggal : 18 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {
    private String NIDN;
    private static int BUP = 65;

    //konstruktor berparameter
    public DosenTetap(String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String Fakultas, String NIDN) {
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok, Fakultas);
        this.NIDN = NIDN;
    }

    //getter & setter
    public String getNIDN() {
        return NIDN;
    }

    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    //BUP
    @Override
    public int getBUP() {
        return BUP;
    }

    //Tunjangan
    @Override
    public double getTunjangan() {
        int masaKerja = Period.between(this.TMT, LocalDate.now()).getYears();
        return 0.02 * masaKerja * gajiPokok;
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
        System.out.println("NIDN: " + NIDN);
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Tanggal Pensiun: " + getTglPensiun());
        System.out.println("Tunjangan: " + getTunjangan());
    }
}
