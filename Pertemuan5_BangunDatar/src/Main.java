/*
 * File : Main.java
 * deskripsi : Main dari class BangunDatar beserta class anak=anaknya
 * nama : Claudia Meitania Putri/240601240188
 * tanggal : 18 Maret 2026
 */

public class Main {
    public static void main(String[] args)
    {
        BangunDatar P1 = new Persegi(10, "hitam", "2");
        Persegi P2 = new Persegi(5, "hitam", "2");
        BangunDatar L1 = new Lingkaran(7, "hitam", "2");
        Lingkaran L2 = new Lingkaran (14, "hitam", "2");
        P1.printInfo();
        P2.printInfo();
        L1.printInfo();
        L2.printInfo();
        System.out.println("IsEqualKeliling: " + P1.isEqualKeliling(P2));
        System.out.println("IsEqualLuas: " + P1.isEqualLuas(P2));
        P2.zoomIn();
        P2.printInfo();
        P2.zoomOut();
        P2.printInfo();
        P2.zoom(20);
        P2.printInfo();
    }
}
