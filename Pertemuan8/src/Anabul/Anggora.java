package Anabul;

// Nama File    : Anggora.java
// NIM          : 24060124140188
// Nama         : Claudia Meitania Putri
// Tanggal      : 30 April

public class Anggora extends Kucing {
    public Anggora(String nama, double bobot) { 
        super(nama, bobot); 
    }

    @Override 
    public String toString() { 
        return "Anggora: " + nama + " (" + bobot + " kg)"; 
    }
}

