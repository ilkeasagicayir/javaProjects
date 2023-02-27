package deneme;

import java.util.Scanner;

public class ders4 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Mesafeyi KM değerinden gir : ");
		int km = inp.nextInt();
		
		double ucret, perKM = 2.20, total = 10;
		
		ucret = 10+ km * perKM ;
		String s=Double.toString(ucret);
		
		String str = (ucret<20) ? "20" :s;
		System.out.println("Ücretiniz : "+ str);
		
	}
}
