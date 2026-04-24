/**
 * File : Asersi1.java
 * deskripsi : Progam untuk menunjukkan asersi
 * nama : Claudia Meitania Putri/24060124140188
 * tanggal : 27 Maret 2026
 */
public class Asersi1 {
    public static void main(String[] args){
        int x=0;
        if(x>0){
            System.out.println("x bilangan positif");
        }else{
            assert(x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}