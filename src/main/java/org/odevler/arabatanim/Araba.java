package org.odevler.arabatanim;

import org.odevler.arabatanim.enums.Renk;

public class Araba {
    private Motor motor;
    private MarkaModel markaModel;
    private Sanziman sanziman;
    private Tekerlek tekerlek;
    private Renk renk;
    private boolean sifirmi;
    private FrenMekanizmasi frenMekanizmasi;

    public Araba(
            Motor motor,
            MarkaModel markaModel,
            Sanziman sanziman,
            Tekerlek tekerlek,
            Renk renk,
            boolean sifirmi,
            FrenMekanizmasi frenMekanizmasi) {
        this.motor = motor;
        this.markaModel = markaModel;
        this.sanziman = sanziman;
        this.tekerlek = tekerlek;
        this.renk = renk;
        this.sifirmi = sifirmi;
        this.frenMekanizmasi = frenMekanizmasi;
    }

    public void yazdir() {
        System.out.println("Araba Bilgileri");
        System.out.println("Motor: " + this.motor.yazdirmaBilgisi());
        System.out.println("Marka/Model: " + this.markaModel.yazdirmaBilgisi());
        System.out.println("Sanzıman: " + this.sanziman.yazdirmaBilgisi());
        System.out.println("tekeler: " + this.tekerlek.yazdirmaBilgisi());
        System.out.println("renk bilgisi: " + this.renk);
        System.out.println("sıfırmı:" + this.sifirmi);
        System.out.println("fren mekanizması: " + this.frenMekanizmasi.yazdirmaBilgisi());
    }

    public void durumGoster(){
        System.out.println("");

        System.out.println("el freni durumu: "+frenMekanizmasi.isElFreniDurumu());
        System.out.println("vites durumu: " + sanziman.getVitesDurumu());
        System.out.println("motor durumu: " + motor.isCalisiormu());



    }


    public void arabaCalistir() {
        System.out.println("");
        if (!this.sanziman.vitesBosdami()) {
            this.sanziman.vitesiBosaAl();
        } else {
            System.out.println("Vites Zaten Boşta");
        }
        this.motor.calistir();
        this.frenMekanizmasi.elFreniIndir();
        this.sanziman.vitesTak(1);
        System.out.println("Araba Calisti");
        System.out.println("");
    }

    public void arabayiDurdur() {
        System.out.println("");
        this.frenMekanizmasi.elFirenininCek();
        System.out.println("arabanın tekerlekleri sıkıştı");
        if (!this.sanziman.vitesBosdami()) {
            this.sanziman.vitesiBosaAl();
        } else {
            System.out.println("vites zaten boşta");
        }
        this.motor.durdur();
        System.out.println("araba baarıyla durduruldu");
        System.out.println("");

    }
}
