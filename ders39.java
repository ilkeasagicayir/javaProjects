package deneme;

public class ders39 {
	
	//1 1 2 3 5 8 13 21 34
	//recursive //f(n) = f(n-1) + f(n-2);
	static int Fibonacci(int n) {
		
		if(n==1 || n==2) {
			return 1;
		}
		
		return Fibonacci(n-1) + Fibonacci(n-2);
		
	}
	public static void main(String[] args) {
		System.out.println(Fibonacci(6));
	}
}
