/*
 * File : Lingkaran.java
 * deskripsi : Class Lingkaran
 * nama : Claudia Meitania Putri/240601240188
 * tanggal : 18 Maret 2026
 */

public class Lingkaran extends BangunDatar implements IResize
{
    private double jari;

    public Lingkaran()
    {
        super();
        setJmlSisi(0); // Lingkaran direpresentasikan memiliki 0 sisi lurus
    }

    public Lingkaran(double diameter, String warna, String border)
    {
        super(0, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari()
    {
        return jari;
    }

    public void setJari(double jari)
    {
        this.jari = jari;
    }

    public double getLuas()
    {
        return Math.PI * jari * jari;
    }

    public double getKeliling()
    {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }

    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari = jari * percent/100;
    }
}
