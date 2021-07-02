package patika;

import java.util.Scanner;

public class Manav_Kasa_Programi {

	public static void main(String[] args) {
		double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, kilo_kac, toplam_tutar;
		Scanner input = new Scanner(System.in);
		System.out.println("KAÇ KİLO ARMUT ALACAKSINIZ? : ");
		kilo_kac = input.nextDouble();
		System.out.println(armut * kilo_kac + " TL");
		System.out.println("KAÇ KİLO ELMA ALACAKSINIZ? : ");
		kilo_kac = input.nextDouble();
		System.out.println(elma * kilo_kac + " TL");
		System.out.println("KAÇ KİLO DOMATES ALACAKSINIZ? : ");
		kilo_kac = input.nextDouble();
		System.out.println(domates * kilo_kac + " TL");
		System.out.println("KAÇ KİLO MUZ ALACAKSINIZ? : ");
		kilo_kac = input.nextDouble();
		System.out.println(muz * kilo_kac + " TL");
		System.out.println("KAÇ KİLO PATLICAN ALACAKSINIZ? : ");
		kilo_kac = input.nextDouble();
		System.out.println(patlican * kilo_kac + " TL");
		toplam_tutar = patlican * kilo_kac + armut * kilo_kac + elma * kilo_kac + domates * kilo_kac + muz * kilo_kac;
		System.out.println("TOPLAM TUTAR :  " + toplam_tutar + " TL");

	}

}
