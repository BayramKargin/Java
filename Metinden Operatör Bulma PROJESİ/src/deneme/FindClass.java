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

	// args kullanmak için oluþturulacak.
	// komut satýrýndan bilgi almak için constructor oluþturup alýyorum
	String metin;

	FindClass(String metin) {
		this.metin = metin;
	}

	int Find(int begin, int last) throws IOException {
		//C:\Users\BAYRAM\eclipse-workspace\deneme\dist2
		// lexical javanýn dosya yolunu verdim
		String fileLine = "Lexical.java";
		String deneme;
		deneme = metin;
		int sayac = 0;
		String operator;
		String sub2 = "";
		String sub1 = "";
		int j = 0;
		// lexical dosyasýný okumak gereken iþlemleri yazdým
		FileReader fileReader = new FileReader(fileLine);
		BufferedReader br = new BufferedReader(fileReader);
		// lexical dosyasýný satýr satýr okumak için while döngüsü kurdum
		while ((operator = br.readLine()) != null) {
			j++;
			// hangi satýrlardaki operatorlerin okunacaðýný belirtmek için if ile ayýrdým
			if (j < last && j > begin) {
				if (operator.length() > 3) {
					continue;
				}
				// deneme dosyasýný okumak için gereken iþlemleri yazdým
				FileReader fileReaderdeneme = new FileReader(deneme);
				String linedeneme;
				BufferedReader brdeneme = new BufferedReader(fileReaderdeneme);
				// satýr satýr okumak için gereken while döngüsü
				while ((linedeneme = brdeneme.readLine()) != null) {
					// satýr olarak okuduðum kýsmý stringe atýp karakter karakter okuma yapmak için
					// for döngüsü kurdum
					for (int i = 0; i < linedeneme.length() - 1; i++) {
						String linehead;
						// sub string ile tek tek yada çift çift almak için
						sub2 = linedeneme.substring(i, i + 2);
						sub1 = linedeneme.substring(i, i + 1);
						String subsonraki = linedeneme.substring(i + 1, i + 2);

						if (linedeneme.length() < 3)
							continue;
						linehead = linedeneme.substring(1, 2);
						// satýrýn yorum satýrý olduðunu kontrol etmek için satýr baþýndaki karakteri
						// kontrol ettim
						if (linehead.equalsIgnoreCase("/") || linehead.equalsIgnoreCase("*")
								|| sub2.equalsIgnoreCase("//")) {
							continue;
						}

						// çift karakterler için
						if (operator.length() == 2) {
							if (sub2.equalsIgnoreCase(operator)) {
								sayac++;
							}
						}
						// tek karakterler için
						else if (operator.length() == 1) {
							if(subsonraki.equalsIgnoreCase("=")) {
							i++;
							continue;
							}
							// çift karakter ile tek karakterlerin karýþmamsý için if ile kontrol ettim
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
		// sayýlan operator sayýsý döndürmek için
		return sayac;

	}
}
