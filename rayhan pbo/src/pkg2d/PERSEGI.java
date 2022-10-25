/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2d;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PERSEGI {
     public static void main(String[] args) {
       Scanner masukan = new Scanner(System.in);
        int s;
        
        System.out.print("Masukkan alas  A : ");
        s = masukan.nextInt();
        
         
         System.out.println("hasilnya : ");
         System.out.println("SISI  = " +s);
        
         //menampilkan luas wilayah
         int luas = s * s;
         int keliling = s + s + + s + s;
         System.out.println("Maka Luas persegi = " +luas);
         System.out.println("Maka keliling persegi = " +keliling);
         
        }
}


