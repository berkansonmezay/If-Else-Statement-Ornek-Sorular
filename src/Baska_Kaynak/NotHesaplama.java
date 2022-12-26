package Baska_Kaynak;

import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        /*
        1.Kullan?c?ya    "Vize s?nav sonucunuzu giriniz :"
        2.vize notu double de?erinde girilecek.

        3. Kullan?c?ya  "Vize s?nav? y?zdesini giriniz". ->> double olmal? ->> 0,40 etkiliyor   
        !!Y?zde ka? etkiledi?ini Sisteme siz giriyorsunuz.!!

        4.Kullan?c?ya    "Final s?nav sonucunuzu giriniz.

        5. final notu double de?erinde olmal?. (?rn: 65,5)

        6.Kullan?c?ya    "Final s?nav? y?zdesini giriniz"-->> double olmal? ->> 0,60 etkiliyor.

        7. Vize final ortalamas?n? bulmak i?in, vize nin y?zde40 ?, finalin y?zde60 ? al?nmal? ve ??kan sonu?lar toplanmal?d?r.

        8. ??kan sonucu (dersin not ortalamas?n?)   double toplam  ' a e?itleyebilirsiniz.

        todo  :  Ko?ul k?sm?
 			e?er ortalamas? 90(90 dahil) 'dan b?y?k ise, harf notu olarak 
 			AA, 80(80dahil)   ile 90 aras?nda ise  
 			BA, 70(70 dahil)   ile 80 aras?nda ise 
 			BB, 60(60dahil) ile 70 aras?nda ise 
 			CB, 50(50 dahil) ile 60 aras?nda ise 
 			CC, 40(40 dahil) ile 50 aras?nda ise 
 			DC, 30(30 dahil) ile 40 aras?nda ise 
 			DD, 30 'dan d???k ise FF  gelmeli.
 			
         */
    	System.out.println("Vize s?nav sonucunuzu giriniz: ");
    	Scanner scan=new Scanner(System.in);
    	double vizeNotu=scan.nextDouble();
    	System.out.println("Vize s?nav?n?n y?zdesini giriniz: ");
    	double vizeYuzde=scan.nextDouble();
    	double vize=(vizeNotu/100)*vizeYuzde;
    	System.out.println("Final s?nav?n? giriniz: ");
    	double finalNotu=scan.nextDouble();
    	
    	//System.out.println("Final s?nav?n?n y?zdesini giriniz: ");
    	//double finalYuzde=scan.nextDouble();
    	double fnl =(finalNotu/100)*(100-vizeYuzde);
    	double gecmeNotu=vize+fnl;
    	System.out.println(gecmeNotu);
    	
    	if (gecmeNotu>=90 && gecmeNotu<=100) {
    		System.out.println("AA");
			
		} else if(gecmeNotu>=80 && gecmeNotu<=90) {
			System.out.println("BA");

		}else if(gecmeNotu>=70 && gecmeNotu<=80) {
			System.out.println("BB");

		}else if(gecmeNotu>=60 && gecmeNotu<=70) {
			System.out.println("CB");

		}else if(gecmeNotu>=50 && gecmeNotu<=60) {
			System.out.println("CC");

		}else if(gecmeNotu>=40 && gecmeNotu<=50) {
			System.out.println("DC");

		}else if(gecmeNotu>=30 && gecmeNotu<=0) {
			System.out.println("FF");

		}
    	
    	
    	
    	
    	
    	
    	
    	

    }
}
