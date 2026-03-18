/*
 * File : Pegawai.java
 * deskripsi : Class induk pegawai
 * nama : Claudia Meitania Putri
 * tanggal : 18 Maret 2025
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.Period;

public abstract class Pegawai {
    protected String NIP;
    protected String Nama;
    protected LocalDate tanggalLahir;
    protected LocalDate TMT;
    protected double gajiPokok;

    //Konstruktor berparameter
    public Pegawai(String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    //Getter & Setter
    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public LocalDate gettanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public LocalDate getTMT() {
        return TMT;
    }

    public void setTMT(LocalDate TMT) {
        this.TMT = TMT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    //Memformat tanggal menjadi: 5 Mei 1990
    public String formatTanggal(LocalDate tgl)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return tgl.format(formatter);
    }

    //masa kerja
    public String getMasaKerja() {
        Period p = Period.between(this.TMT, LocalDate.now());
        return p.getYears() + " tahun " + p.getMonths() + " bulan";
    }

    public abstract int getBUP();

    public abstract double getTunjangan();


    //print
    public void printInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + Nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Terhitung Mulai Tanggal Bekerja: " + TMT);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Masa Kerja: " + getMasaKerja());
    }
}
