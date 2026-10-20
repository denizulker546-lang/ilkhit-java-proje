package org.example;

public class RuletMasasi {

    private Cuzdan kasaCuzdan;
    private Sayi[] sayilar;

    public RuletMasasi(int kasaBakiye) {

        this.kasaCuzdan=new Cuzdan(kasaBakiye);
        this.sayilar = new Sayi[37];
        for (int i = 0; i < 37; i++) {
            sayilar[i] = new Sayi(i);
        }

    }

    public Cuzdan getKasaCuzdan(){
        return this.kasaCuzdan;
    }

    public Sayi oynat() {
        int sayi = (int) (Math.random() * 37);
        return this.sayilar[sayi];
    }





}
