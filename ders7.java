package deneme;

import java.util.Scanner;

public class ders7 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		double k1,k2,k3,k4,k5;
		double a=2.14, e=3.67, d=1.11, m=0.95, p=5.00;
		System.out.print("Armut Kaç Kilo ? : ");
		k1 = inp.nextDouble();
		System.out.print("Elma Kaç Kilo ? : ");
		k2 = inp.nextDouble();
		System.out.print("Domates Kaç Kilo ? : ");
		k3 = inp.nextDouble();
		System.out.print("Muz Kaç Kilo ? : ");
		k4 = inp.nextDouble();
		System.out.print("Patlıcan Kaç Kilo ? : ");
		k5 = inp.nextDouble();
		
		double toplam = (k1*a)+(k2*e)+(k3*d)+(k4*m)+(k5*p);
		System.out.println("Toplam Tutar : "+toplam+" TL");
		
	}

}
