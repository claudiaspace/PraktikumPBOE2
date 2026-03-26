/*
 * File : Petani.java
 * deskripsi : Class Petani yang merupakan anak class Manusia dan mengimplementasikan interface Pajak
 * nama : Claudia Meitania Putri/240601240188
 * tanggal : 26 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{
    //atribut
    private String asal_kota;
    private static int counterPetani = 0;

    //konstruktor
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota)
    {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    //selektor
    public String getAsalKota()
    {
        return asal_kota;
    }

    public static int getCounterPetani()
    {
        return counterPetani;
    }

    //mutator
    public void setAsalKota(String asal_kota) 
    {
        this.asal_kota = asal_kota;
    }

    //hitungMasaKerja
    @Override
    public int hitungMasaKerja() 
    {
        LocalDate now = LocalDate.now();
        Period selisih = Period.between(tgl_mulai_kerja, now);
        int tahun = selisih.getYears();
        return tahun + 1;
    }

    //hitungPajak
    @Override
    public double hitungPajak()
    {
        return 0;
    }

    //cetakInfo
    @Override
    public void cetakInfo()
    {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
    }
}
