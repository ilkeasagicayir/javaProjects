package deneme;

import java.util.Scanner;

public class ders15 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int month, day;
		
		System.out.print("Hangi ay ? ");
		month = inp.nextInt();
		System.out.print("Hangi gün ? ");
		day = inp.nextInt();
		
		
		switch(month) {
		case 1:
			if(day>0 && day <= 31) {
				if(day <= 21 ) System.out.println("Oğlak burcusunuz.");
				else System.out.println("Kova burcusunuz");
			} else {
				System.out.println("Hatalı gün girdin.");
			}
			break;
		case 2:
			if(day>0 && day <= 28) {
				if(day <= 21 ) System.out.println("Kova burcusunuz.");
				else System.out.println("Balık burcusunuz");
			} else {
				System.out.println("Hatalı gün girdin.");
			}
			break;
		case 3:
			if(day>0 && day <= 31) {
				if(day <= 21 ) System.out.println("Balık burcusunuz.");
				else System.out.println("Koç burcusunuz");
			} else {
				System.out.println("Hatalı gün girdin.");
			}
			break;
		case 4:
			if(day>0 && day <= 31) {
				if(day <= 21 ) System.out.println("Koç burcusunuz.");
				else System.out.println("Boğa burcusunuz");
			} else {
				System.out.println("Hatalı gün girdin.");
			}
			break;
			
		case 5:
			if(day>0 && day <= 30) {
				if(day <= 21 ) System.out.println("Boğa burcusunuz.");
				else System.out.println("İkizler burcusunuz");
			} else {
				System.out.println("Hatalı gün girdin.");
			}
			break;
		case 6:
			if(day>0 && day <= 31) {
				if(day <= 21 ) System.out.println("İkizler burcusunuz.");
				else System.out.println("Yengeç burcusunuz");
			} else {
				System.out.println("Hatalı gün girdin.");
			}
			break;
		case 7:
			if(day>0 && day <= 31) {
				if(day <= 21 ) System.out.println("Yengeç burcusunuz.");
				else System.out.println("Aslan burcusunuz");
			} else {
				System.out.println("Hatalı gün girdin.");
			}
			break;
		case 8:
			if(day>0 && day <= 31) {
				if(day <= 21 ) System.out.println("Aslan burcusunuz.");
				else System.out.println("Başak burcusunuz");
			} else {
				System.out.println("Hatalı gün girdin.");
			}
			break;
		case 9:
			if(day>0 && day <= 30) {
				if(day <= 21 ) System.out.println("Başak burcusunuz.");
				else System.out.println("Terazi burcusunuz");
			} else {
				System.out.println("Hatalı gün girdin.");
			}
			break;
		case 10:
			if(day>0 && day <= 31) {
				if(day <= 21 ) System.out.println("Terazi burcusunuz.");
				else System.out.println("Akrep burcusunuz");
			} else {
				System.out.println("Hatalı gün girdin.");
			}
			break;
		case 11:
			if(day>0 && day <= 31) {
				if(day <= 21 ) System.out.println("Akrep burcusunuz.");
				else System.out.println("Yay burcusunuz");
			} else {
				System.out.println("Hatalı gün girdin.");
			}
			break;
		case 12:
			if(day>0 && day <= 31) {
				if(day <= 21 ) System.out.println("Yay burcusunuz.");
				else System.out.println("Oğlak burcusunuz");
			} else {
				System.out.println("Hatalı gün girdin.");
			}
			break;
		default:
			System.out.println("Öyle bir ay yok.");
			
		}
		
	}
}
