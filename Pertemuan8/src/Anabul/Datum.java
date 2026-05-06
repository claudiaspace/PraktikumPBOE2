package Anabul;

// Nama File    : Datum.java
// NIM          : 24060124140188
// Nama         : Claudia Meitania Putri
// Tanggal      : 30 April

// T extends Kucing artinya T hanya boleh Kucing atau anak-anaknya
public class Datum<T> {
    private T isi;

    public void setIsi(T isibaru) { 
        this.isi = isibaru; 
    }

    public T getIsi() { 
        return this.isi; 
    }
}
