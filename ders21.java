package deneme;

import java.util.Scanner;

public class ders21 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println();
		int deger, total = 0;
		
		do{
			System.out.println("Değer giriniz : ");
			deger = inp.nextInt();
			if(deger % 4 ==0) {
				total += deger;
			}
		} while(deger > 0);
		

		System.out.println(total);
	}

}
