import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi;

        System.out.println("Bir Sayı Giriniz: ");
        Scanner girilenSayi = new Scanner(System.in);
        sayi = girilenSayi.nextInt();
        if (sayi > 2) {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    System.out.println(sayi+" Asal Sayı Değildir");
                    return;
                }
            }
            System.out.println(sayi+" Asal Sayıdır.");
        }else if(sayi<=2||sayi>0){
            System.out.println(sayi+" Asal Sayıdır.");
        }
    }
}
