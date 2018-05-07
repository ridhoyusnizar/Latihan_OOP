package com.example.ridho.belajaroop.Main;

import com.example.ridho.belajaroop.Hewan.Ayam;
import com.example.ridho.belajaroop.Hewan.Ikan;
import com.example.ridho.belajaroop.Hewan.Kucing;

public class Main {
    public static void main(String[] args) {
        Kucing k = new Kucing (4,"Kucing");
        Ikan i = new Ikan( 0, "Ikan");
        Ayam a = new Ayam(2, "Ayam");

        k.setAlat_nafas("Paru - paru");
        k.info();

        i.setKaki(0);
        i.setAlat_nafas("Insang");
        i.setHabitat("Air tawar");
        i.info();

        a.setAlat_nafas("Paru - paru");
        a.info();

    }

}
