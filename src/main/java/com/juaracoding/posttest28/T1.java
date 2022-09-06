package com.juaracoding.posttest28;

public class T1 {

	public static void main(String[] args) {

		String Hasil;
		for (int Angka = 1; Angka <= 100; Angka++) {
			if (Angka % 3 == 0) {
				System.out.print("BIZZ,");
			}
			if (Angka % 5 == 0) {
				System.out.print("BUZZ,");
			}
			if (Angka % 3 == 0 || Angka % 5 == 0) {
				System.out.print("BIZZBUZZ,");
			} else {
				System.out.print(Angka + ",");
			}
		}

	}

}
