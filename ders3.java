package deneme;

import java.util.Scanner;

public class ders3 {
	public static void main(String[] args) {
		int a,b ;
		double c ;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("1. kenar a : ");
		a = inp.nextInt();
		System.out.print("2. kenar b : ");
		b = inp.nextInt();
		
		c = Math.sqrt((a*a)+(b*b));
		System.out.println("Hipotenüs uzunluğu : "+c);
		
		double cevre, alan;
		double u = (a+b+c) / 2;
		cevre = 2*u;
		alan = Math.sqrt(u * (u-a)* (u-b) * (u-c));
		System.out.println("Üçgenin çevre: "+cevre);
		System.out.println("Üçgenin alan: "+alan);
	}

}
