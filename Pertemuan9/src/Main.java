// Nama File    : Main.java
// NIM          : 24060124140188
// Nama         : Claudia Meitania Putri
// Tanggal      : 7 Mei
public class Main {
    public static void main(String[] args) {
        Teman teman = new Teman();

        teman.addNama("Claudia");
        teman.addNama("Blip");
        teman.addNama("Blap");
        teman.addNama("Blup");

        System.out.println("NbElm: " + teman.getNbelm());

        System.out.println("Nama indeks ke-2: " + teman.getNama(0));

        teman.showTeman();
        teman.setNama(1, "Blep");
        System.out.println("Setelah setNama indeks 1 menjadi Blep:");
        teman.showTeman();

        System.out.println("IsMember Blip: " + teman.isMember("Blip"));

        System.out.println("Ganti nama Blop menjadi Blap");
        teman.gantiNama("Blop", "Blap");
        teman.showTeman();

        System.out.println("Jumlah 'Claudia' dalam daftar: " + teman.countNama("Claudia"));

        teman.delNama("Claudia");
        System.out.println("Setelah hapus 'Claudia':");
        teman.showTeman();
        System.out.println("NbElm setelah delNama: " + teman.getNbelm());
    }
}
