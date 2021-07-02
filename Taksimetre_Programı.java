package patika;

import java.util.Scanner;

public class Taksimetre_Programı {

	public static void main(String[] args) {
		int mesafe, acilis_ucreti = 10;
		double taksimetre, birim_fiyat = 2.20;
		Scanner input = new Scanner(System.in);
		System.out.print("Toplam mesafeyi giriniz : ");
		mesafe = input.nextInt();

		if (mesafe < 10 / 2.20) {
			taksimetre = 20;
		} else
			taksimetre = acilis_ucreti + (mesafe * birim_fiyat);
		System.out.print("Toplam tutar : " + taksimetre + " TL");

	}

}
