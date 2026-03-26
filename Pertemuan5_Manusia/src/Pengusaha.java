/*
 * File : Penguasaha.java
 * deskripsi : Class Pengusaha yang merupakan anak class Manusia dan mengimplementasikan interface Pajak
 * nama : Claudia Meitania Putri/240601240188
 * tanggal : 26 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak{
    //atribut
    private String npwp;
    private static int counterPengusaha;

    //konstruktor
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) 
    {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    //selektor
    public String getNpwp() 
    {
        return npwp;
    }

    public static int getCounterPengusaha()
    {
        return counterPengusaha;
    }

    //mutator
    public void setNpwp(String npwp) 
    {
        this.npwp = npwp;
    }

    //hitungMasaKerja
    @Override
    public int hitungMasaKerja() 
    {
        LocalDate now = LocalDate.now();
        Period selisih = Period.between(tgl_mulai_kerja, now);
        int tahun = selisih.getYears();
        return tahun + 8;
    }

    //hitungPajak
    @Override
    public double hitungPajak()
    {
        return pendapatan * 0.15;
    }

    //cetakInfo
    @Override
    public void cetakInfo()
    {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}
