/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan37.objectorientedrataratanilai;

import data.Nilai;
import java.util.Scanner;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menghitung rata-rata nilai
 */
public class PBOIF210119064Latihan37ObjectOrientedRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inisialisasi objek scanner
        Scanner keyboard = new Scanner(System.in);
        
        //inisialisasi objek nilai
        Nilai n = new Nilai();
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n.setJmlMahasiswa(keyboard.nextInt());
        
        for (int i = 1; i <= n.getJmlMahasiswa(); i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            n.setNilai(keyboard.nextDouble());
        }
        
        System.out.println("\nMaka, Rata-rata Nilainya adalah " + n.rataNilai());
        System.out.println("Developed by : Bagus Budi Wibowo");

        
    }
    
}
