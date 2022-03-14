import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi1 = 0;
        int sayi2 = 0;
        int sayi3 = 0;
        Scanner girisSayi = new Scanner(System.in);
        System.out.println("1.Sayıyı Gir: ");
        sayi1 = girisSayi.nextInt();
        System.out.println("2.Sayıyı Gir: ");
        sayi2 = girisSayi.nextInt();
        System.out.println("3.Sayıyı Gir: ");
        sayi3 = girisSayi.nextInt();

        int enBuyukSayi = sayi1;
        if (enBuyukSayi < sayi2) {
            enBuyukSayi = sayi2;
        }
        if (enBuyukSayi < sayi3) {
            enBuyukSayi = sayi3;
        }
        System.out.println(enBuyukSayi);
    }
}
