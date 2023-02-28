package deneme;

import java.util.Scanner;

public class ders16 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int mesafe, yas, tip;
		System.out.println("Mesafeyi km türünden giriniz : ");
		mesafe = inp.nextInt();
		System.out.println("Yaşınızı giriniz : ");
		yas = inp.nextInt();
		System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
		tip = inp.nextInt();
		
		double tutar = mesafe * 0.10;
		
		if(mesafe>0 && yas>0) {
			
			switch(tip) {
			case 1:
				if(yas < 12) {
					tutar = tutar/2;
					System.out.println("Toplam tutar : "+tutar);
				}
				else if(yas>=12 && yas<=24) {
					tutar = tutar - (tutar * 0.1);
					System.out.println("Toplam tutar : "+tutar);
				}
				else if (yas >=65) {
					tutar = tutar - (tutar * 0.3);
					System.out.println("Toplam tutar : "+tutar);
				}
				else {
					System.out.println("Toplam tutar : "+tutar);
				}
				break;
			case 2:
				tutar = tutar - (tutar * 0.2);
				if(yas < 12) {
					tutar = tutar/2;
					System.out.println("Toplam tutar : "+2*tutar);
				}
				else if(yas>=12 && yas<=24) {
					tutar = tutar - (tutar * 0.1);
					System.out.println("Toplam tutar : "+2*tutar);
				}
				else if (yas >=65) {
					tutar = tutar - (tutar * 0.3);
					System.out.println("Toplam tutar : "+2*tutar);
				}
				else {
					System.out.println("Toplam tutar : "+2*tutar);
				}
				break;
			default:
				System.out.println("Hatalı Veri Girdiniz !");
			}
			
		}
		else {
			System.out.println("Hatalı Veri Girdiniz !");
		}
		
	}

}
