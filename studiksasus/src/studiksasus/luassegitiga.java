/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studiksasus;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class luassegitiga {
    double alas;
    double tinggi;
    double luas;
    
    void input(){
     Scanner input = new Scanner(System.in);
     System.out.print("Masukkan alas segitiga = ");
     alas = input.nextInt();
     System.out.print("Masukkan tinggi segitiga = ");
     tinggi = input.nextInt();
    }
    void hitung(){
     System.out.print("Luas segitiga = ");
    luas =(alas*tinggi)/2;
   
  
    }
    double hasil(){
        return luas;
    }
}



    

    

