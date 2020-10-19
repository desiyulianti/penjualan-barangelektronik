/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadiahkonversisuhu;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Hadiahkonversisuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double suhu = 0, Celcius;
        int pilih;
         Scanner input = new Scanner (System.in);
         System.out.println("Konversi Suhu");
         System.out.println("1. Farenheit");
         System.out.println("2. Reamur");
         System.out.println("3. Kelvin");
         System.out.println("masukkan pilihan anda :");
         pilih = input.nextInt();
         System.out.println("Masukkan suhu dengan satuan C :");
         Celcius = input.nextInt();
        //percabangan
        switch (pilih){
        case 1 :
        System.out.println("dikonversikan ke Farenheit");
        suhu = Celcius * 9/5 + 32;
        break;
        case 2 :
        System.out.println("dikonversikan ke Reamur");
        suhu = Celcius * 4/5;
        break;
        case 3 :
        System.out.println("dikonversikan ke Kelvin");
        suhu = Celcius + 273;
        break;
        default :
        System.out.println("kode yang anda masukkan salah");
        break;
    }
        System.out.println("Hasil konversinya = "+suhu);
    
}
}
 
