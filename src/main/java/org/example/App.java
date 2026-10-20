package org.example;

import org.example.enums.Renkler;
import org.example.tahmin.RenkTahmini;
import org.example.tahmin.SayiTahmini;
import org.example.tahmin.TekciftTahmini;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        RuletMasasi ruletMasasi = new RuletMasasi(50000);
        Oyuncu oyuncu1 = new Oyuncu("ali", 10000);
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("lütfen tahmin tipinizi seçiniz");
            System.out.println("[1] Renk Tahmini");
            System.out.println("[2] Sayi Tahmini");
            System.out.println("[3] Tek-Çift Tahmini");

            RenkTahmini renkTahmini = null;
            SayiTahmini sayiTahmini = null;
            TekciftTahmini tekciftTahmini = null;

            int miktar = 0;
            int secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("rengi giriniz");
                    String renk = scanner.next();
                    System.out.println("bahis miktarı giriniz");
                    miktar = scanner.nextInt();
                    renkTahmini = new RenkTahmini(miktar, Renkler.valueOf(renk));
                    break;
                case 2:
                    System.out.println("sayı giriniz");
                    int sayi = scanner.nextInt();
                    System.out.println("bahis miktarı giriniz");
                    miktar = scanner.nextInt();
                    sayiTahmini = new SayiTahmini(miktar, sayi);
                    break;
                case 3:
                    System.out.println("tek veya çift olacağını seçiniz (0,1)");
                    boolean ciftmi = scanner.nextInt() % 2 == 0;
                    System.out.println("bahis miktarı giriniz");
                    miktar = scanner.nextInt();
                    tekciftTahmini = new TekciftTahmini(miktar, ciftmi);
                    break;
            }

            Sayi secilenSayi = ruletMasasi.oynat();

            System.out.println("Seçilen Sayı " + secilenSayi.toString());
            if (renkTahmini != null) {
                if (renkTahmini.renk == secilenSayi.renk) {
                    System.out.println("Tebrikler Kazandınız !");
                    ruletMasasi.getKasaCuzdan().paraTransferEt(oyuncu1.getCuzdan(), renkTahmini.bakiye);
                } else {
                    System.out.println("Kaybettiniz !!!!");
                    oyuncu1.getCuzdan().paraTransferEt(ruletMasasi.getKasaCuzdan(), renkTahmini.bakiye);
                }
            }
            if (tekciftTahmini != null) {
                if (tekciftTahmini.ciftmi == secilenSayi.ciftmi) {
                    System.out.println(" tebrikler kazandınız");
                    ruletMasasi.getKasaCuzdan().paraTransferEt(oyuncu1.getCuzdan(), tekciftTahmini.bakiye);

                } else {
                    System.out.println("kaybettiniz");
                    oyuncu1.getCuzdan().paraTransferEt(ruletMasasi.getKasaCuzdan(), tekciftTahmini.bakiye);
                }
            }
            if (sayiTahmini != null) {
                if (sayiTahmini.deger == secilenSayi.deger) {
                    System.out.println("tebrikler kazandınız");
                    ruletMasasi.getKasaCuzdan().paraTransferEt(oyuncu1.getCuzdan(), sayiTahmini.bakiye * 35);

                } else {
                    System.out.println("kaybettiniz");
                    oyuncu1.getCuzdan().paraTransferEt(ruletMasasi.getKasaCuzdan(), sayiTahmini.bakiye);
                }

            }

            System.out.println(oyuncu1.toString());
            System.out.println(ruletMasasi.toString());
        } while (oyuncu1.getCuzdan().paranVarmi());

    }
}
