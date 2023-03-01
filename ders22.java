package deneme;

import java.util.Scanner;

public class ders22 {
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Sayı gir : ");
		int num= inp.nextInt();
		
		/*
		for(int i = 1; i<=num; i*=2) {
			System.out.println(i);
		}
		*/
		for(int i = 1, k = 1; i<=num && k<=num; i*=4, k*=5) {
			System.out.println(i+" "+k);
		}
		
		
	}

}
