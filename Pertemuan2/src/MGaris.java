/* Nama File    : MTitik.java
 * Deskripsi    : Main class untuk menjalankan class Titik
 * Pembuat      : Claudia Meitania Putri / 24060124140188
 * Tanggal      : 26 Februari 2026
 */

public class MGaris {
    public static void main(String[] args) {
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);
        Garis G1 = new Garis(t1, t2);

        System.out.println("Panjang Garis: " + G1.getPanjang());
        System.out.println("Gradien Garis: " + G1.getGradien());
        System.out.println("Persamaan Garis: " + G1.getPersamaanGaris());
        Titik t3 = G1.getTitikTengah();
        System.out.println("Titik Tengah: ");
        t3.printTitik();
        Titik t4 = new Titik(1, 1);
        Garis G2 = new Garis(t3, t4);
        System.out.println("Is Sejajar: " + G1.isSejajar(G2));
        System.out.println("Is Tegak Lurus: " + G1.isTegakLurus(G2));
        G1.printGaris();
    }
}