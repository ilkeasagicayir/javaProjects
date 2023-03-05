package deneme;

import java.util.Scanner;

public class ders41 {
	
	static int uslu(int a, int b) { //a^b
		
		//2^4 = (2^3) * 2
		
		if(b==0) return 1;
		if(b==1) return a;
		return uslu(a,(b-1)) * uslu(a,1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Taban değeri giriniz : ");
		int a = scan.nextInt();
		System.out.print("Üs değeri giriniz : ");
		int b = scan.nextInt();
		
		System.out.println(uslu(a,b));
	}

}
