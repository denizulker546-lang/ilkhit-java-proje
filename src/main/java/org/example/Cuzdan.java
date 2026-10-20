package org.example;

public class Cuzdan {
    private int bakiye;

    public Cuzdan(int bakiye) {
        this.bakiye = bakiye;

    }

    public void paraTransferEt(Cuzdan hedefCuzdan, int miktar) {
        int cekilenMiktar = this.paraCek(miktar);
        hedefCuzdan.paraYatir(cekilenMiktar);
    }

    public int paraCek(int miktar) {
        if (bakiye < miktar) {
            int odenecekMiktar = bakiye;
            bakiye = 0;
            return odenecekMiktar;
        }
        bakiye = bakiye - miktar;
        return miktar;

    }

    public void paraYatir(int miktar) {
        bakiye = bakiye + miktar;

    }

    public boolean paranVarmi() {
        return bakiye > 0;

    }
}
