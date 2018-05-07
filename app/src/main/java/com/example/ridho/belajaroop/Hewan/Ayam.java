package com.example.ridho.belajaroop.Hewan;

public class Ayam extends Hewan {
    private String alat_nafas;

    public Ayam(int kaki,String nama){
    super.kaki = kaki;
    super.nama = nama;
    }

    public String getAlat_nafas() {
        return alat_nafas;
    }

    public void setAlat_nafas(String alat_nafas) {
        this.alat_nafas = alat_nafas;
    }

    public void info(){
        super.info();
        System.out.println("Alat nafas : " + alat_nafas );
        System.out.println();
    }
}
