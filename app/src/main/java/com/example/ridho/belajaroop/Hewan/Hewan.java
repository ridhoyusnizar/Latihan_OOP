package com.example.ridho.belajaroop.Hewan;

import java.sql.SQLOutput;

public class Hewan {
    protected int kaki;
    protected String nama;

    public void setKaki(int kaki){
    if(kaki == 0){
        System.out.println("Ikan tidak mempunyai kaki");
    }else {
        this.kaki = kaki;
    }
    }
    public void setNama(){
        this.nama = nama;
    }
    public void info(){
        System.out.println("Nama Hewan  : " + nama);
        System.out.println("Jumlah kaki : " + kaki);
    }
}
