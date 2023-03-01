package deneme;

import java.util.Scanner;

public class ders20 {
	public static void main(String[] args) { 
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Sayı giriniz : ");
		int num = inp.nextInt();
		int count = 0, total = 0;
		
		for(int i = 1; i<=num;i++) {
			if(i % 3 ==0 || i % 4 ==0) {
				count++;
				total += i;
				//System.out.print("i:" +i+" total:"+total+" count: "+count+" . ");
			}
		}
		double avg = total/count;
		System.out.println("\n"+avg);
	}

}
