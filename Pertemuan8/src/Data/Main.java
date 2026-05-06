package Data;

import Anabul.Anggora;
import Anabul.Kembangtelon;
import Anabul.Kucing;

// Nama File    : Data.java
// NIM          : 24060124140188
// Nama         : Claudia Meitania Putri
// Tanggal      : 30 April

public class Main {
    public static void main(String[] args) {
        Data<Kucing> d = new Data<>();

        d.setIsi(0, new Kucing("miaw", 3.0));
        d.setIsi(1, new Anggora("meong", 4.5));
        d.setIsi(2, new Kembangtelon("meow", 3.2));

        for (int i = 0; i < d.getSize(); i++) {
            System.out.println("Data ke-" + i);
            System.out.println(d.getIsi(i).toString());
        }
    }
}
