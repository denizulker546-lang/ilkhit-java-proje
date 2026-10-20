package org.odevler.arabatanim;

import org.odevler.arabatanim.enums.LastikTuru;

public class Tekerlek {
   private LastikTuru lastikTuru;
   private int incBilgisi;

   public Tekerlek(LastikTuru lastikTuru,int incBilgisi){
       this.lastikTuru=lastikTuru;
       this.incBilgisi=incBilgisi;
   }
    public String yazdirmaBilgisi(){
        return "inc bilgisi: " + this.incBilgisi + " ,Lastik türü: " + this.lastikTuru;
    }
}
