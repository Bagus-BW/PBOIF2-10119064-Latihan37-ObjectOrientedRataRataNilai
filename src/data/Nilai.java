/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menghitung rata-rata nilai
 */
public class Nilai {
    private int jmlMahasiswa;
    private double nilai;

    public void setJmlMahasiswa(int jmlMahasiswa) {
        this.jmlMahasiswa = jmlMahasiswa;
    }
    
    public int getJmlMahasiswa() {
        return jmlMahasiswa;
    }

    public void setNilai(double nilai) {
        this.nilai = this.nilai + nilai;
    }
      
    public double rataNilai(){       
        return nilai/jmlMahasiswa;
    }
}
