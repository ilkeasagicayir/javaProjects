package deneme;

import java.util.Scanner;

public class ders30 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n1, n2;
		System.out.print("İlk sayı : ");
		n1 = inp.nextInt();
		System.out.print("İkinci sayı : ");
		n2 = inp.nextInt();
		int ebob = 0;
		
		System.out.println("====EBOB=====");
		for (int i = 1; i <= n1; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				ebob = i;
			}
		}
		System.out.println(ebob);
		
		System.out.println("===============");
		
		for(int k = n1; k>=1; k--) {
			if (n1 % k == 0 && n2 % k == 0) {
				ebob =k;
				break;
			}
		}System.out.println(ebob);
		
		System.out.println("====EKOK=====");
		
		for(int i =1; i<=(n1*n2); i++) {
			if (i % n1 == 0 && i % n2 == 0) {
				System.out.println(i);
				break;
			}
		}

	}
}
