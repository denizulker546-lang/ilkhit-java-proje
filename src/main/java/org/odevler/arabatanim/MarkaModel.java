package org.odevler.arabatanim;

import org.odevler.arabatanim.enums.Marka;
import org.odevler.arabatanim.enums.Model;

public class MarkaModel {
    private Marka marka;
    private Model model;
    private int uretimYili;

    public MarkaModel(Marka marka,Model model,int uretimYili){
        this.marka=marka;
        this.model=model;
        this.uretimYili=uretimYili;
    }
    public String yazdirmaBilgisi(){
        return "üretim yılı: " + this.uretimYili + " ,model: " + this.model + " ,Marka: " + this.marka;

    }
}
