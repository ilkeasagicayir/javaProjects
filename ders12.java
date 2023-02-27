package deneme;

import java.util.Scanner;

public class ders12 {
	public static void main(String[] args) {
		int mat, fzk, kimya, tr, counter = 0;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Matematik notunuz : ");
		mat = inp.nextInt();
		if(mat<=100 && mat>=0) {
			counter++;
		} else {
			mat = 0;
		}
		System.out.print("Fizik notunuz : ");
		fzk = inp.nextInt();
		if(fzk<=100 && fzk>=0) {
			counter++;
		} else {
			fzk = 0;
		}
		System.out.print("Kimya notunuz : ");
		kimya = inp.nextInt();
		if(kimya<=100 && kimya>=0) {
			counter++;
		} else {
			kimya = 0;
		}
		System.out.print("Türkçe notunuz : ");
		tr = inp.nextInt();
		if(tr<=100 && tr>=0) {
			counter++;
		} else {
			tr = 0;
		}
		
		double average = (mat+fzk+kimya+tr) / counter;
		System.out.print("Ortalama notunuz : "+average+"\n");
		
		String sonuc = (average>=50) ? "Geçti" : "Kaldı";
		System.out.print("Öğrenci sınıfı "+sonuc+".");
	}

}
