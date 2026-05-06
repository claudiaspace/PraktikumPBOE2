package Generik;
import Anabul.Kucing;
import Anabul.Datum; 

// Nama File    : OperatorGenerik.java
// NIM          : 24060124140188
// Nama         : Claudia Meitania Putri
// Tanggal      : 30 April

public class OperatorGenerik {
    public <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public <T extends Kucing> double Bobot2(T kcg1, T kcg2) {
        return kcg1.getBobot() + kcg2.getBobot();
    }
}
