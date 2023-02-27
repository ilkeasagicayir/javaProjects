package deneme;

import java.util.Scanner;

public class ders5 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int r;
		double pi = 3.14, aci;
		
		System.out.println("Dairenin yarıçapı : ");
		r = inp.nextInt();
		System.out.println("Merkez açı ölçüsü : ");
		aci = inp.nextDouble();
		
		double alan = pi*r*r;
		System.out.println("Dairenin alanı : "+alan);
		double cevre = pi*r*2;
		System.out.println("Dairenin alanı : "+cevre);
		double alan2 = pi*r*r*aci/360;
		System.out.println("Merkez açı ölçüsü "+aci+" olan dairenin alanı : "+alan2);
		
	}
}
