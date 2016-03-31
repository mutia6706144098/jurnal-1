/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal1;
import java.util.Scanner;
/**
 *
 * @author Praktikum
 */
public class Jurnal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.print("Input:");
         Scanner input = new Scanner(System.in);
         int panjang = input.nextInt();
         for(int i=1;i<=panjang;i++){
             System.out.print(fibo(i) + " ");
         }
    }
     
    public static long fibo(int n) {
        if (n <= 1) {
            return n;
        }
        else {
            return fibo(n-1) + fibo(n-2);
        }    
    }


}
