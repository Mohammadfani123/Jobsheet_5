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
import java.util.Scanner;
public class ArithmeticExeption {
    public static void main(String[] args){
        //int a=100;
        System.out.println("Enter value for b");
        Scanner console = new Scanner(System.in);
        int b = console.nextInt();
        
        System.out.println("Enter value of c");
        int c = console.nextInt();
        int res = 10/(b-c);
        System.out.println("The Result is "+res);
    }
}
