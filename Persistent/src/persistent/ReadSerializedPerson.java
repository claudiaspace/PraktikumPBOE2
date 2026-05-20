/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistent;

/**
 *
 * @author Claudia
 * File : ReadSerializedPerson.java
 * Deskripsi : Program untuk serialisasi objek Person
 */
import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null; 
        try {
            // Membuka file
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            
            // Membaca bita dan melakukan casting ke tipe Person
            person = (Person) s.readObject();
            s.close();
            
            // Menampilkan data objek yang berhasil dipulihkan 
            System.out.println("serialized person name: " + person.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
