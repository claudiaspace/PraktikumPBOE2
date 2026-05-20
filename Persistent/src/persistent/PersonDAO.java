/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistent;

/**
 *
 * @author Claudia
 * File : PersonDAO.java
 * Deskripsi : interface untuk person access object
 */
public interface PersonDAO {
    public void savePerson(Person p) throws Exception;
}
