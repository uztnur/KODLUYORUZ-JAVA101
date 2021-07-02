package patika;

import java.util.Scanner;

public class Uc_Kenar_Uzunlugunu_Kullanıcıdan_Aldıgınız_Ucgenin_Alanını_Hesaplayan_Program {

	public static void main(String[] args) {
		int kenar1, kenar2, kenar3, u;
		double a;
		Scanner giris = new Scanner(System.in);
		System.out.print("Alanını hesaplamak istediğiniz üçgenin 1. kenarını giriniz :  ");
		kenar1 = giris.nextInt();
		System.out.print("Alanını hesaplamak istediğiniz üçgenin 2. kenarını giriniz :  ");
		kenar2 = giris.nextInt();
		System.out.print("Alanını hesaplamak istediğiniz üçgenin 3. kenarını giriniz :  ");
		kenar3 = giris.nextInt();
		u = (kenar1 + kenar2 + kenar3) / 2;
		a = (u * (u - kenar1) * (u - kenar2) * (u - kenar3));

		System.out.print("Alanı :  " + Math.sqrt(a));

	}

}
