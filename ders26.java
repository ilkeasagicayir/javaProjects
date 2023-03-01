package deneme;

import java.util.Scanner;

public class ders26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int a , result=0;
        
        while(number !=0) {
        	a = number % 10 ;
        	result += a;
        	number /= 10;
        }
        System.out.println(result);
        
	}
}
