package deneme;

import java.util.Scanner;

public class ders23 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("1. Sayı : ");
		int n1 = inp.nextInt();
		System.out.print("2. Sayı : ");
		int n2 = inp.nextInt();
		
		/*int total = 1;
		for(int i = 1; i<=n; i++) {
			total *= i;
		}
		System.out.println("Faktoriyel : "+total);*/
		
		int total1 =1, total2 = 1, total3 = 1;
		for(int i = 1; i<=n1; i++) {
			total1 *= i;
		}
		for(int i = 1; i<=n2; i++) {
			total2 *= i;
		}
		for(int i = 1; i<=(n1-n2); i++) {
			total3 *= i;
		}
		double combination = total1 / (total2 * total3);
		System.out.println("KOMBİNASYON : "+combination);
		
	}

}
