/* NIM : 240601241440188
 * Nama : Claudia Meitania Putri
 * Tanggal : 24 April 2026
 */
public class CivitasAkademika {
    protected String nama;

    public CivitasAkademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return "";
    }
}

class Dosen extends CivitasAkademika {
    private String NIP;

    public Dosen(String nama, String NIP) {
        super(nama);
        this.NIP = NIP;
    }

    @Override
    public String getNomor() {
        return NIP;
    }

    public void printDosen() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + NIP);
    }
}

class Mahasiswa extends CivitasAkademika {
    private String NIM;
    private Dosen dosenWali;

    public Mahasiswa(String nama, String NIM, Dosen dosenWali) {
        super(nama);
        this.NIM = NIM;
        this.dosenWali = dosenWali;
    }

    @Override
    public String getNomor() {
        return NIM;
    }

    public void tampilDataMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Dosen Wali: " + dosenWali.getNama());
    }
}

class Seminar {
    private CivitasAkademika[] pesertas;
    private int banyakPeserta;

    public Seminar() {
        this.pesertas = new CivitasAkademika[100];
        this.banyakPeserta = 0;
    }

    public int countPeserta() {
        return banyakPeserta;
    }

    public void registrasi(CivitasAkademika CA) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = CA;
            banyakPeserta++;
        } else {
            System.out.println("Peserta sudah 100 orang");
        }
    }

    public void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println("Nama: " + pesertas[i].getNama());
            System.out.println("Nomor: " + pesertas[i].getNomor());
        }
    }

    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}