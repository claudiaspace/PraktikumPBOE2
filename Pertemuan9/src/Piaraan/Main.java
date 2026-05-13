package Piaraan;

// Nama File    : Anabul.java
// NIM          : 24060124140188
// Nama         : Claudia Meitania Putri
// Tanggal      : 7 Mei

public class Main {
    public static void main(String[] args) {
        Piaraan piaraan = new Piaraan();

        Kucing k1 = new Kucing("Meong", 4.5);
        Kucing k2 = new Kucing("Miaw", 3.2);
        Anabul a1 = new Anabul("Fluff", 2.8);
        Anabul a2 = new Anabul("Lilo", 3.5);

        piaraan.enqueueAnabul(k1);
        piaraan.enqueueAnabul(k2);
        piaraan.enqueueAnabul(a1);
        piaraan.enqueueAnabul(a2);

        System.out.println("NbElm: " + piaraan.getNbelm());

        System.out.println("Daftar semua anabul:");
        piaraan.showAnabul();

        System.out.println("IsMember Mochi? " + piaraan.isMember(k1));

        System.out.println("Data pertama: " + piaraan.getanabul().getNama());

        System.out.println("Jenis semua anabul:");
        piaraan.showJenisAnabul();

        System.out.println("Jumlah kucing: " + piaraan.countKucing());
        System.out.println("Total bobot kucing: " + piaraan.bobotKucing() + " kg");

        System.out.println("Dequeue anabul: " + piaraan.dequeueAnabul().getNama());
        System.out.println("NbElm setelah dequeue: " + piaraan.getNbelm());
    }
}
