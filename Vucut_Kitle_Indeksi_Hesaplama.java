package patika;

import java.util.Scanner;

public class Vucut_Kitle_Indeksi_Hesaplama {

	public static void main(String[] args) {
		double kilo, boy, vucut_kitle_endeksi;
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen kilonuzu kg cinsinden giriniz: ");
		boy = input.nextDouble();
		System.out.println("Lütfen boyunuzu m cinsinden virgüllü  giriniz: ");
		kilo = input.nextDouble();
		vucut_kitle_endeksi = (kilo * (Math.pow(boy, 2)));
		System.out.println("Vücut Kitle İndeksiniz : " + vucut_kitle_endeksi);

	}

}
