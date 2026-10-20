package org.odevler.arabatanim;

public class Motor {
    private int hacim;
    private int beygirGucu;
    private boolean calisiormu;


    public Motor(int hacim, int beygirGucu, boolean calisiyormu) {
        this.hacim = hacim;
        this.beygirGucu = beygirGucu;
        this.calisiormu = calisiyormu;
    }

    public String yazdirmaBilgisi() {
        return "hacim: " + this.hacim + " ,Beygir gücü: " + this.beygirGucu + " ,calisiyorMu " + this.calisiormu;
    }


    public void calistir() {
        if (!calisiormu) {
            calisiormu = true;
            System.out.println("Motor Çalıştırıldı");
        } else {
            System.out.println("Motor Zaten Calisiyor");
        }
    }

    public void durdur() {
        if (calisiormu) {
            calisiormu = false;
            System.out.println("Motor Durdu.");
        } else {
            System.out.println("Motor Zaten Durmus.");
        }

    }

    public boolean isCalisiormu() {
        return calisiormu;
    }
}
