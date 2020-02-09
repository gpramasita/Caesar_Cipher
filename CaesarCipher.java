/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigmentcleancode;

import java.util.Scanner;

/**
 *
 * @author gpramasita
 */
public class CaesarCipher {
    public static void main(String[] args) {
		StringBuilder pesanEnkripsi = new StringBuilder();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan pesan yang ingin di Enkripsi: ");
		String pesan = input.next();
		System.out.print("Masukkan Pergeseran Jumlah Pergeseran Huruf: ");
		int geserHuruf = input.nextInt();
		char charPesan = 0;
		for (int i = 0; i < pesan.length(); i++) {
			charPesan = pesan.charAt(i);
			if (geserHuruf > 26) {
				System.out.println("Maaf pergeseran huruf lebih dari 26 karakter");

			} else if (geserHuruf <= 26) {
				geserHuruf = geserHuruf % 26;
			}

			int temp = charPesan + geserHuruf;
			char pesanBaru = (char) temp;
                        pesanEnkripsi.append(pesanBaru);			
		}
                System.out.println("Pesan Enkripsi: " +pesanEnkripsi);
	}  
}
