import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi;
        int total = 0;
        System.out.println("Bir Sayı Giriniz: ");
        Scanner girilenSayi = new Scanner(System.in);
        sayi = girilenSayi.nextInt();
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                total = total + i;
            }
        }
        if (total == sayi) {
            System.out.println(sayi + " Mükemmel Bir Sayıdır.");
        } else System.out.println(sayi + " Mükemmel Bir Sayı Değildir.");

    }
}
