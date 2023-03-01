package deneme;

import java.util.Scanner;

public class ders37 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			
			int total =1 ;
			int sum = a;
			
			for(int j=0; j<= c-1 ; j++) {
				sum = sum + (total*b);
				total *= 2;
				System.out.print(Integer.toString(sum)  + ' ');
			}
			System.out.print('\n');
			
		}
	}
}

