/*
 * File : Dosen.java
 * deskripsi : Class anak Dosen dari induk Pegawai
 * nama : Claudia Meitania Putri
 * tanggal : 18 Maret 2025
 */

import java.time.LocalDate;

public abstract class Dosen extends Pegawai{
    protected String Fakultas;

    //konstruktor berparameter
    public Dosen(String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String Fakultas) {
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok);
        this.Fakultas = Fakultas;
    }

    //Getter & Setter
    public String getFakultas() {
        return Fakultas;
    }

    public void setFakultas(String Fakultas) {
        this.Fakultas = Fakultas;
    }

    //print
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas: " + Fakultas);
    }
}
