/* Nama File : MTitik.java
Deskripsi    : Main class untuk menjalankan class Titik
Pembuat      : Claudia Meitania Putri 24060124140188 
Tanggal      : 22/02/2026 */
public class MTitik {
    public static void main(String [] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        Titik T2 = new Titik(3, 5); //Membuat objek titik T2
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); //mencetak koordinat T1 ke layar
        T1.geser(3,4); //menggeser T1 sejauh (3,4)
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser
        T2.printTitik(); //menampilkan koordinat T2
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik()); //menampilkan jumlah titik yang telah dibuat
        System.out.println("Kuadran T1 = " + T2.getKuadran()); //menampilkan kuadran titik T2
        System.out.println("Jarak ke titik pusat = " + T2.getJarakPusat()); //menampilkan jarak titik T2 ke titik pusat (0,0)
        System.out.println("Jarak 2 titik = " + T2.getJarak(T1)); //menampilkan jarak titik T2 ke titik T1
        T1.refleksiX(); //merefleksikan titik T1 terhadap sumbu X
        T1.printTitik(); //menampilkan titik T1 setelah direfleksikan terhadap sumbu X
        T1.refleksiY(); //merefleksikan titik T1 terhadap sumbu Y
        T1.printTitik(); //menampilkan titik T1 setelah direfleksikan terhadap sumbu Y
        Titik T3 = T1.getrefleksiX(); //menghasilkan titik baru yang merupakan refleksi titik T1 terhadap sumbu X
        T3.printTitik(); //menampilkan T3
        Titik T4 = T1.getrefleksiY(); //menghasilkan titik baru yang merupakan refleksi titik T1 terhadap sumbu Y
        T4.printTitik(); //menampilkan T4

    }
}