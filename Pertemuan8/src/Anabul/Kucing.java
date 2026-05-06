package Anabul;

// Nama File    : Kucing.java
// NIM          : 24060124140188
// Nama         : Claudia Meitania Putri
// Tanggal      : 30 April

public class Kucing extends Anabul {
    protected double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() { 
        return bobot; 
    }
}