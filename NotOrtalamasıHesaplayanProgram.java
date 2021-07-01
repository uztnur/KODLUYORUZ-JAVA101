package patika;

import java.util.Scanner;

public class NotOrtalamasıHesaplayanProgram {

	public static void main(String[] args) {
		int mat,fizik,kimya,turkce,muzik;
		Scanner input =new Scanner(System.in);
		System.out.println("Matematik sınav notunu giriniz: ");
		mat=input.nextInt();
		System.out.println("Fizik sınav notunu giriniz: ");
		fizik=input.nextInt();
		System.out.println("Kimya sınav notunu giriniz: ");
		kimya=input.nextInt();
		System.out.println("Türkçe sınav notunu giriniz: ");
		turkce=input.nextInt();
		System.out.println("Müzik sınav notunu giriniz: ");
		muzik=input.nextInt();
		double ort=(mat+fizik+kimya+turkce+muzik)/5.0;
		System.out.print("Ortalamanız: " + ort);
	}

}
