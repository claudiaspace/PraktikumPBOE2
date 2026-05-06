package Generik;
import Anabul.*;
// Nama File    : Main.java
// NIM          : 24060124140188
// Nama         : Claudia Meitania Putri
// Tanggal      : 30 April

public class Main {
    public static void main(String[] args) {
        OperatorGenerik og = new OperatorGenerik();
    
        Datum<Integer> angka1 = new Datum<>();
        angka1.setIsi(3);
        Datum<Integer> angka2 = new Datum<>();
        angka2.setIsi(6);
        System.out.println("angka1: " + angka1.getIsi() + ", angka2: " + angka2.getIsi());
        og.Tukar(angka1, angka2);
        System.out.println("angka1: " + angka1.getIsi() + ", angka2: " + angka2.getIsi());

        Datum<String> string1 = new Datum<>();
        string1.setIsi("claudia");
        Datum<String> string2 = new Datum<>();
        string2.setIsi("meitania");
        System.out.println("string1: " + string1.getIsi() + ", string2: " + string2.getIsi());
        og.Tukar(string1, string2);
        System.out.println("string1: " + string1.getIsi() + ", string2: " + string2.getIsi());

        Datum<Kucing> kucing1 = new Datum<>();
        kucing1.setIsi(new Anggora("rocky", 1.2));
        Datum<Kucing> kucing2 = new Datum<>();
        kucing2.setIsi(new Kembangtelon("grace", 2.3));
        System.out.println("kucing1: " + kucing1.getIsi().toString());
        System.out.println("kucing2: " + kucing2.getIsi().toString());
        og.Tukar(kucing1, kucing2);
        System.out.println("kucing1: " + kucing1.getIsi().toString());
        System.out.println("kucing2: " + kucing2.getIsi().toString());

        Kucing kucing3 = kucing1.getIsi();
        Kucing kucing4 = kucing2.getIsi();
        double totalBobot = og.Bobot2(kucing3, kucing4);
        System.out.println("Total Bobot: " + totalBobot + " kg");
    }
}
