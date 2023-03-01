package deneme;

import java.util.Scanner;

public class ders35 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bir sayı gir:");
		int n = input.nextInt();
		int result=0;
		
		for(int i = 1; i<=10;i++) {
			result = n*i;
			System.out.println(n+" x "+i+" = "+result);
		}
	}
}
