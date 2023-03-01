package deneme;

import java.util.Scanner;

public class ders31 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kaç tane sayı gireceksiniz: ");
		int n = scan.nextInt();
		int number;
		int i = 1;
		int buyuk=0, kucuk=0;
		
		do {
			System.out.println(i+". Sayıyı giriniz: ");
			number = scan.nextInt();
			
			if(number>buyuk) buyuk = number;
			if(number<kucuk) kucuk = number;
			
			i++;
		} while(i<=n);
		
		System.out.println("En büyük sayı : "+buyuk);
		System.out.println("En küçük sayı : "+kucuk);
	}

}
