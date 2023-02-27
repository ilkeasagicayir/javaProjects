package deneme;

import java.util.Scanner;

public class ders11 {
	public static void main(String[] args) {
		String username, password, yeniSifre = "";

		Scanner input = new Scanner(System.in);

		System.out.print("Kullanıcı adınız : ");
		username = input.nextLine();
		System.out.print("Şifreniz : ");
		password = input.nextLine();
		

		if (username.equals("ilke") && password.equals("123456")) {
			System.out.println("Başarılı!");

		} else {
			System.out.println("Başarısız.\nŞifreyi sıfırlamak ister misiniz? evet veya hayır yazınız.");
			String cevap = input.nextLine();
			if (cevap.equals("evet")) {
				System.out.println("Yeni şifreniz : ");
				yeniSifre = input.nextLine();
				if(yeniSifre.equals("123456")) {
					System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
				} else {
					System.out.println("Şifre oluşturuldu");
				}
			}
		}

	}
}
