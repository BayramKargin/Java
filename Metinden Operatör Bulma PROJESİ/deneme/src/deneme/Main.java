/**
*
* Bayram Kargin bayram.kargin@ogr.sakarya.edu.tr
* 30.03.2022
* <p>
* Grup : 1/C
*/
package deneme;

import java.io.IOException;

public class Main {

	public static void main(String [] args) throws IOException {
		
		
		
		    //args[0]="src\\deneme\\Deneme.java";
		

			//String fileLine=args[0];
			//ReadFile readFile=new ReadFile(fileLine);
			
			//String metin= readFile.oku();
			System.out.println("Operat�r Bilgisi : ");
			NumericOperators operator=new NumericOperators(args[0]);
			int numeric=operator.Find(3,24);
			int tekli=operator.Findnumeric();
			System.out.println("	Say�sal operator Say�s� : "+ numeric);
			RetionalOperators rOperator=new RetionalOperators(args[0]);
			int retional=rOperator.Find(24, 31);
			System.out.println("	�li�kisel operator Say�s�: "+ retional);
			LogicalOperators lOperator= new LogicalOperators(args[0]);
			int logical=lOperator.Find(31,36);
			System.out.println("	Mant�ksal operator Say�s� : "+ logical);
			int operand=(((numeric-tekli)*2)+(retional*2)+(logical*2)+tekli);
			System.out.println("Operat�r Bilgisi : ");
			System.out.println("	Toplam operand Say�s� : " + operand);
		}
}
