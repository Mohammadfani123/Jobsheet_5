/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet5_handlingrev;

/**
 *
 * @author Windows 10
 */
public class RuntimeException {
    public static void main(String[] args) { 
        int a = 35; 
        int b = 5; 
        try { // blok try atau blok pengujian
            int x = a / b;
            System.out.println("Hasil: " + x); // tampilan keluaran nilai hasil
            int[] angka = {1, 2, 3, 4, 5}; // array dengan 5 elemen
            angka[4] = 72; // mengakses indeks ke 24
            
            
        }catch (Exception e) {
            System.out.println("Salah");
            System.out.println(e); //blok jika terjadi kesalahan
        }
        System.out.println("Selesai");
    }

}
