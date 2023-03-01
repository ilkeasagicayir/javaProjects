package deneme;

import java.util.Scanner;

public class ders24 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Sayı : ");
		int n1 = inp.nextInt();
		System.out.print("Sayının üssü : ");
		int n2 = inp.nextInt();
		
		int total =1 ;
		
		for(int i=1; i<=n2; i++) {
			total *= n1;
		}
		System.out.println(n1+" üssü "+n2+" : "+total);
	}
}
