/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodpenjualan;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Methodpenjualan { //inialisasi variabel
    String nama;
    String alamat;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // method main
        
       barangelektronik(); // pemanggilan method
    }
    
    
  static void barangelektronik(){ // method void
        Methodpenjualan elektro = new Methodpenjualan();
        Scanner input = new Scanner (System.in); // membuat scanner baru
        String [] barang = {"Televisi","Mesin cuci","Kipas angin","Rice cooker","Kulkas" };
        int[] harga = {1200000,1400000,500000,350000,2500000};
        System.out.println("SELAMAT DATANG DI TOKO KAMI");
        System.out.print("Masukkan nama pembeli :");
        elektro.nama = input.nextLine();
        System.out.print("Masukkan alamat pembeli :");
        elektro.alamat = input.nextLine();
        System.out.println("Barang yang tersedia :");
        for (int i = 0; i < harga.length; i++)
        {System.out.println(i+"."+barang[i]+" => "+harga[i]);}
        // menu yang dipilih
        System.out.println("barang yang dipilih :");
         //output
        int pilihan = input.nextInt();
        System.out.println("barang adalah :"+barang[pilihan]);
        System.out.println("Silakan melakukan pembayaran");
        int bayar = input.nextInt();
        if(bayar > harga[pilihan]){
        System.out.println("uang kembalian :"+( bayar - harga[pilihan]));}
        else if ( bayar < harga[pilihan]){System.out.println("Uang anda kurang :"+(harga[pilihan] - bayar));
        }
        else if (bayar == harga[pilihan]){System.out.println("Tidak ada kembalian");}
    }
    
}
