package patika;

import java.util.Scanner;

public class Yarıçap_R_Merkez_Açısısının_Olcusu_A_Olan_Daire_Diliminin_Alanı_Bulan_Program {

	public static void main(String[] args) {

		double pi = 3.14, dairenin_alani, merkez_aci, r, dilimin_olcusu, daire_diliminin_alani;
		Scanner input = new Scanner(System.in);
		System.out.println("Alanı hesaplanacak daire diliminin merkez açısını giriniz : ");
		merkez_aci = input.nextDouble();
		System.out.println("Alanı hesaplanacak daire diliminin yarıçapını giriniz : ");
		r = input.nextDouble();
		dairenin_alani = (pi * Math.pow(r, 2));
		dilimin_olcusu = merkez_aci / 360;
		daire_diliminin_alani = dairenin_alani * dilimin_olcusu;
		System.out.println("Daire diliminin alanı :  " + daire_diliminin_alani);

	}

}
