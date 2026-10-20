package org.example;

import org.example.enums.Renkler;

public class Sayi {
    public Renkler renk;
    public boolean ciftmi;
    public int deger;

    public Sayi(Renkler renk, int deger) {
        this.renk = renk;
        this.deger = deger;
        this.ciftmi = this.deger % 2 == 0;
    }

    public Sayi(int deger) {
        this.deger = deger;
        this.ciftmi = this.deger % 2 == 0;
        if (deger == 0) {
            this.renk = Renkler.YESIL;
        } else if (this.ciftmi) {
            this.renk = Renkler.KIRMIZI;
        } else {
            this.renk = Renkler.SIYAH;
        }
        System.out.println("Sayi Oluştu :" + deger + "," + ciftmi + "," + renk );
    }

    @Override
    public String toString() {
        return "Sayi{" +
                "renk=" + renk +
                ", ciftmi=" + ciftmi +
                ", deger=" + deger +
                '}';
    }
}
