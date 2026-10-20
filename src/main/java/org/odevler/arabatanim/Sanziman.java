package org.odevler.arabatanim;

import org.odevler.arabatanim.enums.SanzimanTipi;

public class Sanziman {
    private int vitesSayisi;
    private int vitesDurumu;
    private SanzimanTipi sanzimanTipi;

    public Sanziman(int vitesSayisi, SanzimanTipi sanzimanTipi) {
        this.vitesSayisi = vitesSayisi;
        this.sanzimanTipi = sanzimanTipi;
        this.vitesDurumu = 0;
    }

    public String yazdirmaBilgisi() {
        return "Sanzimanın tipi: " + this.sanzimanTipi + " ,Vites sayisi: " + this.vitesSayisi +" ,Vites durumu: "+ vitesDurumu;
    }

    public void vitesiBosaAl() {
        this.vitesDurumu = 0;
        System.out.println("vites boşda");
    }

    public boolean vitesBosdami(){
       return vitesDurumu==0;
    }

    public void vitesTak(int vites) {
        if (vites <= this.vitesSayisi && vites > 0) {
            this.vitesDurumu = vites;
            System.out.println("vites değişti:" + this.vitesDurumu);
        } else {
            System.err.println("hata vites değişemedi");
        }
    }

    public void geriVitesTak(){
        this.vitesDurumu=-1;
        System.out.println("vites geride");

    }

    public int getVitesDurumu() {
        return vitesDurumu;
    }
}
