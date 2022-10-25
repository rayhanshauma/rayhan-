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
public class PERSEGI_PANJANG {
     public static void main(String[] args) {
       Scanner masukan = new Scanner(System.in);
        int P;
        int L;
        
        System.out.print("Masukkan panjang : ");
        P = masukan.nextInt();
        System.out.print("Masukkan lebar: ");
        L= masukan.nextInt();
        
         
         System.out.println("hasilnya : ");
         System.out.println("alas panjang  = " +P);
         System.out.println("alas lebar  = " +L);
         
         //menampilkan luas wilayah
         int luas = P * L;
         int keliling = 2*P+2*L;
         System.out.println("Maka Luas segitiga = " +luas);
         System.out.println("Maka keliling segitiga = " +keliling);
         
        }
}


