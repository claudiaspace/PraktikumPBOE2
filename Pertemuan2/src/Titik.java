/* Nama File : Titik.java
Deskripsi    : berisi atribut dan method dalam class Titik
Pembuat      : Claudia Meitania Putri 24060124140188 
Tanggal      : 19/02/2026 */
public class Titik {
    /*****************ATRIBUT*****************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /*****************METHOD*****************/
    //konstruktor untuk membuat titik (0,0)
    Titik () {
        this(0,0);
    }

    // konstruktor untuk membuat titik dengan nilai absis dan ordinat tertentu
    Titik (double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    //mengembalikan nilai absis 
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //mencari kuadran
    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        }
        else if (absis > 0 && ordinat < 0) {
            return 2;
        }
        else if (absis < 0 && ordinat < 0) {
            return 3;
        }
        else if (absis < 0 && ordinat > 0) {
            return 4;
        }
        else {
            return 0;
        }
    }

    //mencari jarak titik ke titik pusat (0,0)
    double getJarakPusat() {
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    //mencari jarak 2 titik
    double getJarak(Titik T2) {
        return Math.sqrt(Math.pow((absis - T2.getAbsis()), 2) + Math.pow((ordinat - T2.getOrdinat()), 2));
    }

    //refleksi terhadap sumbu x
    void refleksiX() {
        ordinat = -ordinat;
    }

    //refleksi terhadap sumbu y
    void refleksiY() {
        absis = -absis;
    }

    //menghasilkan titik baru yang merupakan hasil refleksi terhadap sumbu x
    Titik getrefleksiX() {
        return new Titik(absis, -ordinat);
    }

    //menghasilkan titik baru yang merupakan hasil refleksi terhadap sumbu y
    Titik getrefleksiY() {
        return new Titik(-absis, ordinat);
    }


} //end class Titik

