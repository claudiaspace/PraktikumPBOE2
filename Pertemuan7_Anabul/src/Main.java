/* NIM : 240601241440188
 * Nama : Claudia Meitania Putri
 * Tanggal : 24 April 2026
 */
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("rocky");
        Anjing anjing = new Anjing("ryland");
        Burung burung = new Burung("grace");

        kucing.gerak();
        kucing.bersuara();
        anjing.gerak();
        anjing.bersuara();
        burung.gerak();
        burung.bersuara();

    }
}
