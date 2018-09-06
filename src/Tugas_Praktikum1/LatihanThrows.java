/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Praktikum1;

/**
 *
 * @author Windows 10
 */
public class LatihanThrows {
    static void apaanNi() throws ClassNotFoundException{
        System.out.println("Ada Yang Error Ni!");
        throw new ClassNotFoundException("Udah Saya Tangkap");
    }
}
