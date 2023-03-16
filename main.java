/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo;

//supaya dapat memasukkan inputan yang diinputkan oleh user
import java.util.Scanner;
/**
 *
 * @author MSI MODERN
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pilih;
        
        do{
            System.out.println("====================================================");
            System.out.println("                         Menu                       ");
            System.out.println("====================================================");
            System.out.println("1. Menghitung Perhitungan Persegi Panjang dan Balok");
            System.out.println("2. Menghitung Perhitungan Lingkaran dan Tabung");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            
            switch (pilih){
                //switch case untuk menentukan pilihan menu
                case 1:
                    //menu 1 untuk menentukan perhitungan persegi panjang dan  balok
                    //inputan panjang,tinggi, dan lebarnya 
                    System.out.println("===========================================");
                    System.out.print("Masukkan Panjangnya\t\t: ");
                    double panjang = input.nextDouble();
                    System.out.print("Masukkan Lebarnya\t\t: ");
                    double lebar = input.nextDouble();
                    System.out.print("Masukkan Tingginya\t\t: ");
                    double tinggi = input.nextDouble();
                    
                    System.out.println("Hasil sebagai berikut :");
                    //Hasil perhitungan dari inputan panjang,tinggi,dan lebar diatas
                    persegipanjang pmenu = new persegipanjang(panjang, lebar);
                    System.out.println("Luas Persegi Panjang \t\t: " + pmenu.MenghitungLuas());
                    System.out.println("Keliling Persegi Panjang \t\t: " + pmenu.MenghitungKeliling());
                    
                    balok bmenu = new balok(panjang, lebar, tinggi);
                    System.out.println("Volume Balok \t\t\t: " + bmenu.menghitungvolume());
                    System.out.println("Luas Permukaan Balok \t\t: " + bmenu.menghitungluaspermukaan());
                    System.out.println("===========================================");
                    break;
                    
                case 2:
                    //Menu 2 untuk menentukan perhitungan lingkaran dan tabung
                    //inputan jari jari dan tingginya
                    System.out.println("==============================================");
                    System.out.println();
                    System.out.print("Masukkan Jari-Jarinya\t\t: ");
                    double Jari2 = input.nextDouble();
                    System.out.print("Masukkan Tingginya\t\t: ");
                    double TinggiTbg = input.nextDouble();
                    
                    System.out.println("Hasil sebagai berikut :");
                    //Hasil perhitungan dari inputan jari-jari dan tinggi diatas
                    lingkaran lingkrn = new lingkaran(Jari2);
                    System.out.println("Luas Lingkaran\t\t\t: " + lingkrn.MenghitungLuas());
                    System.out.println("Keliling Lingkaran\t\t: " + lingkrn.MenghitungKeliling());
                    
                    tabung tbg = new tabung(Jari2, TinggiTbg);
                    System.out.println("Volume Tabung\t\t\t: " + tbg.menghitungvolume());
                    System.out.println("Luas Permukaan Tabung\t\t: " + tbg.menghitungluaspermukaan());
                    System.out.println("==============================================");
                    break;
                    
                case 3:
                    //Menu 3 untuk keluar dari program
                    System.out.println("===========================================");
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    System.out.println("===========================================");
                    break;
                    
                default:
                    System.out.println("=======================================================================");
                    System.out.println("Pilihan yang anda masukan tidak valid. Silakan pilih lagi dengan benar.");
                    System.out.println("=======================================================================");
                    break;
            }
            System.out.println();
        } while (pilih != 3);   
    }
}
    

