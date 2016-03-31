/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal1;
import java.util.Scanner;
import java.util.ArrayList;
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
         ArrayList<Integer> elements = new ArrayList<>();
         for(int i=1;i<=panjang;i++){
             elements.add(fibo(i));
         }
         for(int j=elements.size()-1;j>=0;j--){
             System.out.print(elements.get(j));
         }
    }
     
    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        else {
            return fibo(n-1) + fibo(n-2);
        }    
    }


}
