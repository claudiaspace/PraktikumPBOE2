package Anabul;

// Nama File    : Kembangtelon.java
// NIM          : 24060124140188
// Nama         : Claudia Meitania Putri
// Tanggal      : 30 April

public class Kembangtelon extends Kucing {
    public Kembangtelon(String nama, double bobot) { 
        super(nama, bobot); 
    }

    @Override 
    public String toString() { 
        return "Kembangtelon: " + nama + " (" + bobot + " kg)"; 
    }
}

