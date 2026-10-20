package org.example;

public class Oyuncu {
    public String ad;
    private Cuzdan cuzdan;

    public Oyuncu(String ad, int bakiye) {
        this.ad = ad;
        this.cuzdan = new Cuzdan(bakiye);
    }

    public Cuzdan getCuzdan() {
        return this.cuzdan;
    }


}
