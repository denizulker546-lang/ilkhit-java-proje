package org.odevler.arabatanim;

public class FrenMekanizmasi {
    private boolean elFreniDurumu;
    private boolean absDevredemi;
    private boolean espDevredemi;

    public FrenMekanizmasi(boolean elFreniDurumu,boolean absDevredemi,boolean espDevredemi){
        this.elFreniDurumu=elFreniDurumu;
        this.absDevredemi=absDevredemi;
        this.espDevredemi=espDevredemi;

    }

    public String yazdirmaBilgisi(){
        return "esp durumu: " + this.espDevredemi + " ,Abs durumu: " + this.absDevredemi+ " ,el freni: "+elFreniDurumu;
    }

    public void elFreniIndir(){
        this.elFreniDurumu=false;
        System.out.println("el freni indirilidi");

    }
    public void elFirenininCek(){
        this.elFreniDurumu=true;
        System.out.println("el freni çekildi");

    }

    public boolean isElFreniDurumu() {
        return elFreniDurumu;
    }
}
