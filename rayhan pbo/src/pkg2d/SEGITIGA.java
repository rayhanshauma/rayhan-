/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2d;

import java.util.Scanner;

/**
 *
 *@author Administrator
 */
public class SEGITIGA {
    public static void main(String[] args) {
       Scanner masukan = new Scanner(System.in);
        int a;
        int t;
        int b;
        int c;
        System.out.print("Masukkan alas  A : ");
        a = masukan.nextInt();
        System.out.print("Masukkan alas  B : ");
        b = masukan.nextInt();
        System.out.print("Masukkan alas  C : ");
        c = masukan.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = masukan.nextInt();
         
         System.out.println("hasilnya : ");
         System.out.println("alas A  = " +a);
         System.out.println("alas B  = " +b);
         System.out.println("alas C  = " +c);
         System.out.println("tinggi = " +t);
         //menampilkan luas wilayah
         int luas = a * t;
         int keliling = a + b + c;
         System.out.println("Maka Luas segitiga = " +luas);
         System.out.println("Maka keliling segitiga = " +keliling);
         
        }
}


