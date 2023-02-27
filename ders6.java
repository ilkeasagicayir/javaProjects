package deneme;

import java.util.Scanner;

public class ders6 {
	public static void main(String[] args) {
		double boy, kilo, kitle;
		Scanner inp = new Scanner (System.in);
		
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		boy = inp.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz : ");
		kilo = inp.nextDouble();
		
		kitle = (kilo)/(boy*boy);
		
		System.out.println("Vücut Kitle İndeksiniz : "+kitle);
		
	}
	

}
