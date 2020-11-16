/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.penjualan.barang;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class ProjectPenjualanBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String jawab;
        int bayar = 0, total=0;
        boolean ulangi = true;
      
        Scanner input = new Scanner (System.in);
        System.out.println("<< SELAMAT DATANG DI TOKO KAMI >>");
        System.out.print("Nama : ");
        String nama = input.nextLine();
        while(ulangi){
        System.out.println("Pilihan Barang :");
        String [] barang = {"Bahan pokok","Snack","Sabun wajah","Mie instan","Minuman dingin"};
        for (int a=0; a<barang.length; a++)
         System.out.println(a+"."+barang[a]);
         System.out.println("Barang yang dibeli :");
        int pilihan = input.nextInt();
        //percabangan barang
        switch(pilihan){
            case 0 :
            //pilihan bahan pokok
             System.out.println(" Bahan Pokok :");
             String [] bahanpokok = {"Beras","Gula","Minyak goreng","Daging sapi","Telur ayam","Susu"};
             String [] deskripsi = {"Beras merupakan bahan pokok yang sangat dibutuhkan, beras adalah bagian bulir padi yang telah dipisah dari sekam","Gula adalah suatu karbohidrat sederhana yang menjadi sumber energi","Minyak goreng adalah minyak yang berasal dari pemurnian bagian tumbuhan, hewan atau sintetik","Daging sapi adalah daging yang diperoleh dari sapi dan digunakan untuk keperluan konsumsi makanan","Telur adalah salah satu bahan makanan hewani yang dikonsumsi selain daging, ikan dan susu","Susu adalah minuman bergizi yang biasanya berasal dari hewan mamalia seperti sapi"};
             int[] harga = {250000,12000,24000,100000,20000,14000};
             for(int i=0; i<bahanpokok.length; i++){
             System.out.println(i+"."+bahanpokok[i]+" => "+deskripsi[i]+" : "+" Rp"+harga[i]);}
             System.out.print("Pilihan anda : ");
             int pilihan0 = input.nextInt();
             System.out.println("barang adalah :"+bahanpokok[pilihan0]+" = "+harga[pilihan0]);
             System.out.println("Total harga :"+harga[pilihan0]);
             total += harga[pilihan0];
             break;
            case 1 :
             //pilihan  snack
             System.out.println(" Snack :");   
             String [] snack = {"Kusuka","Chitato","Cheetos","Lays","Qtela","Kitkat","Pocky","Choco pie"};
             String [] deskripsi1 = {"Kusuka adalah keripik singkong yang enak dan berkualitas","Chitato adalah makanan ringan dari kentang asli","Cheetos adalah snack jagung","lays adalah makanan ringan yang terbuat dari kentang dan memiliki aroma rumput laut","Qtela yaitu keripik yang terbuat dari singkong","Kitkat yaitu sebuah manisan coklat","Pocky adalah stik biskuit yang berlapis coklat","Choco pie adalah softcake yang terdiri dari 2 lapis dengan isian marshmallow dan coklat"};
             int [] harga1 = {5000,6000,4500,5500,6500,8000,7000,2000};
             for(int a=0; a<snack.length; a++){
             System.out.println(a+"."+snack[a]+" => "+deskripsi1[a]+" : "+" Rp"+harga1[a]);}
             System.out.print("Pilihan anda : ");
             int pilihan1 = input.nextInt();
             System.out.println("barang adalah :"+snack[pilihan1]+" = "+harga1[pilihan1]);
             System.out.println("Total harga :"+harga1[pilihan1]);
             total += harga1[pilihan1];
             break;
            case 2 :
            //pilihan sabun wajah
             System.out.println(" Sabun wajah :"); 
             String [] sabunwajah = {"Clean & Clear","Acnes Creamy wash","Emina face wash","Pon's pure white","Senka Perfect whip"};
             String [] deskripsi2 = {"Clean & clear adalah sabun wajah yang cocok untuk kulit remaja dan membuat kulit wajah terasa segar an mengurangi minyak yang berlebihan","Acnes creamy wash adalah pembersih wajah berbentuk cream yang mengandung anti bakteri","Emina face wash adalah pembersih wajah yang cocok untuk semua jenis kulit, setelah menggunakannya wajah akan terlihat bersih dan lembab ","Pon's adalah sabun wajah yang memiliki kandungan antipolusi","senka Perfect whip adalah sabun wajah yang sangat lembut dengan kombinasi double Hyaluronic Acid dan White Cocoon Essence"};
             int [] harga2 = {13500,22000,14000,35000,42000};
             for(int b=0; b<sabunwajah.length; b++){
             System.out.println(b+"."+sabunwajah[b]+" => "+deskripsi2[b]+" : "+" Rp"+harga2[b]);}
             System.out.print("Pilihan anda : ");
             int pilihan2 = input.nextInt();
             System.out.println("barang adalah :"+sabunwajah[pilihan2]+" = "+harga2[pilihan2]);
             System.out.println("Total  barang :"+harga2[pilihan2]);
              total += harga2[pilihan2];
             break;
            case 3 :
            //pilihan mie instan
             System.out.println(" Mie Instan :");  
             String [] mieinstan = {"Indomie","Mie Sedap","Supermie","Sarimi","Mie ABC"};
             String [] deskripsi3 = {"Indomie adalah mie instan yang paling populer saat ini dengan harga yang relatif murah dengan rasa yang enak","Mie Sedap adalah mie instan yang memiliki beragai jenis varian rasa dan memiliki kualitas mie yang kenyal","Supermie adalah mie instan yang pertama kali muncul di Indonesia dengan kualitas mie yang lembut","sarimie adaalah mie yang terkenal keempat di Indonesia yang memiliki berbagai varian rasa","Mie ABC adalah mie instan yang terkenal dengan rasa pedasnya"};
             int [] harga3 = {2000,2500,1500,3000,5000};
             for(int c=0; c<mieinstan.length; c++){
             System.out.println(c+"."+mieinstan[c]+" => "+deskripsi3[c]+" : "+" Rp"+harga3[c]);}
             System.out.print("Pilihan anda : ");
             int pilihan3 = input.nextInt();
             System.out.println("barang adalah :"+mieinstan[pilihan3]+" = "+harga3[pilihan3]);
             System.out.println("Total barang :"+harga3[pilihan3]);
              total += harga3[pilihan3];
            break;
            case 4 :
            //pilihan inuman dingin
             System.out.println(" Minuman dingin :"); 
             String [] minuman = {"Aqua","Teh pucuk harum","Minute maid","Pocari sweat","Fruit tea"};
             String [] deskripsi4 = {"Aqua adalah air mineral yang yang sangat laris di Indonesia","Teh pucuk harum adalah minuman yang dibuat dari pucuk daun teh pilihan","Minute maid adalah minuman segar dari sari jeruk ditambah bulir - bulir jeruk asli","Pocari sweat adalah minuman pengganti ion dan minuman olahraga terpopuler","Fruit tea adalah minuman teh rasa buah pertama di Indonesia"};
             int [] harga4 = {5000,4000,5500,7000,6000};
             for(int d=0; d<minuman.length; d++){
             System.out.println(d+"."+minuman[d]+" => "+deskripsi4[d]+" : "+" Rp"+harga4[d]);}
             System.out.print("Pilihan anda : ");
             int pilihan4 = input.nextInt();
             System.out.println("barang adalah :"+minuman[pilihan4]+" = "+harga4[pilihan4]);
             System.out.println("Total barang :"+harga4[pilihan4]);
              total += harga4[pilihan4];
             break;
            default :
             System.out.println("Pilihan yang anda masukkan salah"); 
             break;}
            //menambah barang
        input = new Scanner (System.in);
        System.out.println("Apakah anda ingin meenambah barang ?");
        System.out.println("Y/T");
        System.out.print("jawab :");
        jawab = input.nextLine();
         // perulangan barang
         ulangi = jawab.equalsIgnoreCase("Y");}
         //total belanja
         System.out.println("Total harga :"+total);
         System.out.println("Silakan melakukan pembayaran ");
          System.out.print("Jumlah uang : ");
         bayar = input.nextInt();
         if(bayar > total){
        System.out.println("uang kembalian :"+( bayar - total));}
        else if ( bayar < total){System.out.println("Uang anda kurang :"+(total - bayar));
        }
        else if (bayar == total){System.out.println("Tidak ada kembalian");}
        System.out.println(" << TERIMAKASIH ATAS KUNJUNGAN ANDA >>");
      
       
      
         
 
   
       
     
           
          }
   
          
              
             
              
    }


    





    
            
        
        
    
    

