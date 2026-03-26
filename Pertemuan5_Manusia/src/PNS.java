/*
 * File : PNS.java
 * deskripsi : Class PNS yang merupakan anak class Manusia dan mengimplementasikan interface Pajak
 * nama : Claudia Meitania Putri/240601240188
 * tanggal : 26 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    //atribut
    private String nip;
    private static int counterPNS = 0;

    //konstruktor
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) 
    {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    //selektor
    public String getNip() 
    {
        return nip;
    }

    public static int getCounterPNS() 
    {
        return counterPNS;
    }

    //mutator
    public void setNip(String nip) 
    {
        this.nip = nip;
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
        return pendapatan * 0.1;
    }

    //cetakInfo
    @Override
    public void cetakInfo()
    {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }

}
