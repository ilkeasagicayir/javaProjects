package deneme;

import java.util.Scanner;

public class ders_2 {
	public static void main(String[] args) {
		double tutar ;
		Scanner inp = new Scanner(System.in);
		System.out.print("Ücret tutarını gir : ");
		tutar = inp.nextDouble();

		double kdvOran = (tutar >= 0 && tutar<=1000) ? 0.18 : 0.08;
		double kdvTutar = tutar*kdvOran ; 
		
		double kdvsiz = tutar , kdvli= (kdvTutar+tutar);
		System.out.println("KDV ORANI: "+kdvOran);
		System.out.println("KDV TUTAR: "+kdvTutar);
		System.out.println("KDVSIZ FIYAT : "+kdvsiz);
		System.out.println("KDVLİ FIYAT : "+kdvli);
		}

}
