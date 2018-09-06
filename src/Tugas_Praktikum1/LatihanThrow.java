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
import java.util.Scanner;
public class LatihanThrow {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int bebek;
        System.out.println("Fani Tolong Bawakan 2 Ekor Bebek Dikandang");
        try{
            System.out.print("Jumlah Bebek Yang Ingin Dibawa: ");
            bebek = input.nextInt(); 
            if(bebek > 2){
               
                throw new Exception("Kebanyakan ");
            }else{
                System.out.println("Aman-Aman Saja");
            }
        }catch(Exception e){
            
            e.printStackTrace();
        }
    }
}
