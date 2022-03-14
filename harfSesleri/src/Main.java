import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] harf=new String[1];
        System.out.println("Sesli bir harf giriniz: ");
        Scanner girilenHarf=new Scanner(System.in);
        harf[0]=girilenHarf.nextLine().substring(0,1).toUpperCase(Locale.ROOT);
        switch (harf[0]){
            case"A":
            case"I":
            case"U:":
            case"O":
                System.out.println("Kalın Harftir.");
                break;
            default:
                System.out.println("İnce harftir");
        }

    }
}
