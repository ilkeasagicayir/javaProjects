package deneme;

import java.util.Scanner;

public class ders10 {
	public static void main(String[] args) {
		int n1, n2, secim;
		Scanner input = new Scanner(System.in);
		System.out.print("İlk sayıyı giriniz : ");
		n1 = input.nextInt();
		System.out.print("İkinci sayıyı giriniz : ");
		n2 = input.nextInt();
		System.out.println("Hangi işlemi yapmak istiyorsunuz?\n1)Toplama\n2)Çıkarma\n3)Çarpma\n4)Bölme");
		secim = input.nextInt();
		
		switch(secim) {
		case 1:
			System.out.println(n1+n2);
			break;
		case 2:
			System.out.println(n1-n2);
			break;
		case 3:
			System.out.println(n1*n2);
			break;
		case 4:
			if(n2!=0) System.out.println(n1/n2);
			else System.out.println("Sayı 0'a bölünmez.");
			break;
		default:
			System.out.println("Geçersiz işlem.");
		}
		System.out.println("Bitti.");
	}

}
