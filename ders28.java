package deneme;

import java.util.Scanner;

public class ders28 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    System.out.print("Sayı Giriniz :");
	    int number = input.nextInt();
	    int a = number;
	    
	    for (int i = 1; i<=number; i++) {
	    	for(int j = 1; j<=(6-i); j++) {
	    		System.out.print(" ");
	    	}
	    	for(int k = 1; k<=(2*i)-1; k++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	    
	    for (int i = number-1; i>=1; i--) {
	    	for(int j = 1; j<=(6-i); j++) {
	    		System.out.print(" ");
	    	}
	    	for(int k = 1; k<=(2*i)-1; k++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	    
}
}
