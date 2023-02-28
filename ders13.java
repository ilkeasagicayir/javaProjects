package deneme;

import java.util.Scanner;

public class ders13 {
	public static void main(String[] args) {
		
		int heat;
		Scanner input = new Scanner(System.in);
		System.out.print("Hava kaç derece?");
		heat = input.nextInt();
		
		if(heat <5) {
			System.out.println("Kayak yapabilirsin.");
		} else if(heat < 25) {
			if(heat<=15) System.out.println("Sinemaya gidebilirsin.");
			if ( heat >= 10) System.out.println("Pikniğe gidebilirsin.");
		} else {
			System.out.println("Yüzmeye gidebilirsin.");
		}
	}

}
