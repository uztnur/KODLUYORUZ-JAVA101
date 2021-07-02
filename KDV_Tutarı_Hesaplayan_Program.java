package patika;

import java.util.Scanner;

public class KDV_Tutarı_Hesaplayan_Program {

	public static void main(String[] args) {
		double toplam_tutar, tutar, kdv;
		double kkdv = 0.18;
		double bkdv = 0.8;
		Scanner input = new Scanner(System.in);
		System.out.println("Ürün tutarını giriniz: ");
		tutar = input.nextDouble();
		if (tutar > 1000) {
			kdv = bkdv * tutar;
		} else {
			kdv = kkdv * tutar;
		}

		toplam_tutar = (kdv + tutar);
		System.out.println("Ürünün KDV'li fiyatı : " + toplam_tutar);
		System.out.println("Ürünün KDV tutarı : " + kdv);

	}

}
