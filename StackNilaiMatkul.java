/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANDIKA
 */
public class StackNilaiMatkul {
    private String nim;
    private String nama;
    private double nilai;
    
    StackNilaiMatkul() {
        
    }
    void setNim(String nim) {
        this.nim = nim;
        
    }
    String getNim() {
        return nim;
    }
    void setNama(String nama) {
        this.nama = nama;
        
    }
     String getNama() {
        return nama;
    }
     void setNilai(double nilai) {
        this.nilai = nilai;
        
    }
     double getNilai() {
        return nilai;
    }
}
