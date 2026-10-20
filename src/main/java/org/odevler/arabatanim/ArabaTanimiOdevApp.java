package org.odevler.arabatanim;


import org.odevler.arabatanim.enums.*;

public class ArabaTanimiOdevApp {


    public static void main(String[] args) {
        Motor motor=new Motor(2,180,false);
        MarkaModel markaModel=new MarkaModel(Marka.AUIDI, Model.A6,2026);
        Sanziman sanziman=new Sanziman(5, SanzimanTipi.TAM_OTOMATIK);
        Tekerlek tekerlek=new Tekerlek(LastikTuru.DORT_MEVSIM,19);
        FrenMekanizmasi frenMekanizmasi=new FrenMekanizmasi(true,false,false);
        Araba araba = new Araba(motor,markaModel,sanziman,tekerlek, Renk.KIRIMIZI,true,frenMekanizmasi);

        araba.yazdir();

        araba.arabaCalistir();

        araba.durumGoster();

        araba.arabayiDurdur();

        araba.durumGoster();
    }
}
    /*
    1)
    Olabildiğince detaylı bir araba sınıfı yazılacak:
    Araba
        Motor
        Şanzıman
    Her sınıf için Constructor oluşturulacak. (new Araba())
    Constructor da ilgili tüm parametreler alınacak.
    Gerekli olan enumlar tanımlanacak.


    2) Araba sınıfı için basit bir uygulama yazılacak (hayalgücün)
     */
