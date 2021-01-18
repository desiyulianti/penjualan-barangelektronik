/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus2;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class trapesium {
    double alas1;
    double alas2;
    double tinggi;
    double luas;
    
    void masukan(){
     Scanner input = new Scanner(System.in);
     System.out.print("Masukkan alas atas trapesium = ");
     alas1 = input.nextInt();
     System.out.print("Masukkan alas bawah trapesium = ");
    alas2= input.nextInt();
     System.out.print("Masukkan tinggi trapesium = ");
     tinggi = input.nextInt();
    
    }
    void hitung(){
     System.out.print("Luas trapesium = ");
    luas =((alas1+alas2)*tinggi)/2;
   
  
    }
    double hasil(){
        return luas;
}

}