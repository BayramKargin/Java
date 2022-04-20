/**
 *
 * Bayram Kargin bayram.kargin@ogr.sakarya.edu.tr 30.03.2022
 * <p>
 * Grup : 1/C
 */
package deneme;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindClass {

	// args kullanmak i�in olu�turulacak.
	// komut sat�r�ndan bilgi almak i�in constructor olu�turup al�yorum
	String metin;

	FindClass(String metin) {
		this.metin = metin;
	}

	int Find(int begin, int last) throws IOException {
		//C:\Users\BAYRAM\eclipse-workspace\deneme\dist2
		// lexical javan�n dosya yolunu verdim
		String fileLine = "Lexical.java";
		String deneme;
		deneme = metin;
		int sayac = 0;
		String operator;
		String sub2 = "";
		String sub1 = "";
		int j = 0;
		// lexical dosyas�n� okumak gereken i�lemleri yazd�m
		FileReader fileReader = new FileReader(fileLine);
		BufferedReader br = new BufferedReader(fileReader);
		// lexical dosyas�n� sat�r sat�r okumak i�in while d�ng�s� kurdum
		while ((operator = br.readLine()) != null) {
			j++;
			// hangi sat�rlardaki operatorlerin okunaca��n� belirtmek i�in if ile ay�rd�m
			if (j < last && j > begin) {
				if (operator.length() > 3) {
					continue;
				}
				// deneme dosyas�n� okumak i�in gereken i�lemleri yazd�m
				FileReader fileReaderdeneme = new FileReader(deneme);
				String linedeneme;
				BufferedReader brdeneme = new BufferedReader(fileReaderdeneme);
				// sat�r sat�r okumak i�in gereken while d�ng�s�
				while ((linedeneme = brdeneme.readLine()) != null) {
					// sat�r olarak okudu�um k�sm� stringe at�p karakter karakter okuma yapmak i�in
					// for d�ng�s� kurdum
					for (int i = 0; i < linedeneme.length() - 1; i++) {
						String linehead;
						// sub string ile tek tek yada �ift �ift almak i�in
						sub2 = linedeneme.substring(i, i + 2);
						sub1 = linedeneme.substring(i, i + 1);
						String subsonraki = linedeneme.substring(i + 1, i + 2);

						if (linedeneme.length() < 3)
							continue;
						linehead = linedeneme.substring(1, 2);
						// sat�r�n yorum sat�r� oldu�unu kontrol etmek i�in sat�r ba��ndaki karakteri
						// kontrol ettim
						if (linehead.equalsIgnoreCase("/") || linehead.equalsIgnoreCase("*")
								|| sub2.equalsIgnoreCase("//")) {
							continue;
						}

						// �ift karakterler i�in
						if (operator.length() == 2) {
							if (sub2.equalsIgnoreCase(operator)) {
								sayac++;
							}
						}
						// tek karakterler i�in
						else if (operator.length() == 1) {
							if(subsonraki.equalsIgnoreCase("=")) {
							i++;
							continue;
							}
							// �ift karakter ile tek karakterlerin kar��mams� i�in if ile kontrol ettim
							if (sub1.equalsIgnoreCase(operator)) {
								if (subsonraki.equalsIgnoreCase(operator)) {
									i++;
									continue;
								}
								sayac = sayac + 1;
							}
						}
					}

				}

				brdeneme.close();

			}
		}
		// say�lan operator say�s� d�nd�rmek i�in
		return sayac;

	}
}
