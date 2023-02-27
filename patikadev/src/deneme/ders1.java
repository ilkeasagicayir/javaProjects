package deneme;

import java.util.Scanner;

public class ders1 {
	public static void main(String[] args) {
		
		int mat, fzk, kimya, tr;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Matematik notunuz : ");
		mat = inp.nextInt();
		System.out.print("Fizik notunuz : ");
		fzk = inp.nextInt();
		System.out.print("Kimya notunuz : ");
		kimya = inp.nextInt();
		System.out.print("Türkçe notunuz : ");
		tr = inp.nextInt();
		
		double average = (mat+fzk+kimya+tr) / 4;
		System.out.print("Ortalama notunuz : "+average+"\n");
		
		String sonuc = (average>=50) ? "Geçti" : "Kaldı";
		System.out.print("Öğrenci sınıfı "+sonuc+".");
		}

}
