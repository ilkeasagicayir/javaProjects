package deneme;

public class ders38 {
	static boolean isPalindrom(int number) {
		int temp = number, reverseNumber = 0, lastNumber;
		while (temp != 0) {
			lastNumber = temp % 10;
			reverseNumber = (reverseNumber * 10) + lastNumber;
			temp /= 10;
		}

		if (number == reverseNumber)
			return true;
		else
			return false;
	}

	public static void main(String args[]) {
		System.out.println(isPalindrom(412));
		System.out.println(isPalindrom(989));
		System.out.println(isPalindrom(7));
	}
}
