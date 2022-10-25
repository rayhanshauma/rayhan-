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
public class LINGKARAN {

    
     public static void main(String[] args) {
       Scanner masukan = new Scanner(System.in);

        double k, l, r , phi= 3.14;
        System.out.print("Masukkan alas  A : ");
        r = masukan.nextInt();
        
         System.out.println("Variabel yang terdapat dalam program : ");
         System.out.println("jari jari  = " +r);
         
         //menampilkan luas wilayah
         l = phi * r * r;
         k = 2 * phi * r;
         System.out.println("Maka Luas segitiga = " +l);
         System.out.println("Maka keliling segitiga = " +k);
         
        }
}


