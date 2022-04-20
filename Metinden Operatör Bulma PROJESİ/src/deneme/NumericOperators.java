/**
*
* Bayram Kargin bayram.kargin@ogr.sakarya.edu.tr
* 30.03.2022
* <p>
* Grup : 1/C
*/
package deneme;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.regex.*;

public class NumericOperators extends FindClass {
	NumericOperators(String metin) {
		super(metin);
		// TODO Auto-generated constructor stub
	}

	int Findnumeric() throws IOException {
		String fileLine = "Lexical.java";
		String deneme ;
		deneme = metin;
		int sayac = 0;
		int tekli = 0;
		String operator;
		String sub2 = "";
		String sub1 = "";
		FileReader fileReader = new FileReader(fileLine);
		BufferedReader br = new BufferedReader(fileReader);
		while ((operator = br.readLine()) != null) {
			if (operator.charAt(0) == 'Ý') {
				// System.out.println("Sayýsal operatorler: " + sayac);
				System.out.println("	Tekli Operator Sayýsý: " + tekli);
				System.out.println("	Ýkili Operator Sayýsý: " + (sayac - tekli));
				return tekli;
			}

			if (operator.length() > 3) {
				continue;
			}

			FileReader fileReaderdeneme = new FileReader(deneme);
			String linedeneme;
			BufferedReader brdeneme = new BufferedReader(fileReaderdeneme);

			while ((linedeneme = brdeneme.readLine()) != null) {

				for (int i = 0; i < linedeneme.length() - 1; i++) {
					String yorum;
					String linehead;
					sub2 = linedeneme.substring(i, i + 2);
					sub1 = linedeneme.substring(i, i + 1);
					String subsonraki = linedeneme.substring(i + 1, i + 2);
					if (linedeneme.length() < 3)
						continue;
					linehead = linedeneme.substring(1, 2);
					if (linehead.equalsIgnoreCase("/") || linehead.equalsIgnoreCase("*")
							|| sub2.equalsIgnoreCase("//")) {
						continue;
					}

					if (operator.length() == 2) {
						if (sub2.equalsIgnoreCase(operator)) {
							sayac++;
							if (sub2.equalsIgnoreCase("++") || sub2.equalsIgnoreCase("--")) {
								tekli++;
							}
						}
					} else if (operator.length() == 1) {
						if (sub1.equalsIgnoreCase("!")) {
							if(subsonraki.equalsIgnoreCase("=")) {
							i++;
							continue;
							}
						}
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
		return tekli;
	}
}
