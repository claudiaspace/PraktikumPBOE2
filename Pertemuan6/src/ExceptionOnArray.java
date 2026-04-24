/**
 * File : ExceptionOnArray.java
 * deskripsi : Progam penggunaan eksepsi menggunakan class library Java
 * nama : Claudia Meitania Putri/24060124140188
 * tanggal : 27 Maret 2026
 */
public class ExceptionOnArray {
    public static void main(String[] args) {
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}
