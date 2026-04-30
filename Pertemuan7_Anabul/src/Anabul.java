/* NIM : 240601241440188
 * Nama : Claudia Meitania Putri
 * Tanggal : 24 April 2026
 */
public class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public void gerak(){}
    public void bersuara(){}
}

class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("kucing bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println("kucing berbunyi meong");
    }
}

class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("anjing bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println("anjing bersuara guk-guk");
    }
}

class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("burung bergerak dengan terbang");
    }

    @Override
    public void bersuara() {
        System.out.println("burung berbunyi cuit");
    }
}
