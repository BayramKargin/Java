public class Main {

    public static void main(String[] args) {
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Bayram";
        ogrenciler[1] = "Engin";
        ogrenciler[2] = "Ramo";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("------------------------------------------");

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }


        // EXAMPLE........
        double[] myList = {1.6, 2.8, 3.2, 4.4};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam ......: " + total);
        System.out.println("En Büyük Sayi: " + max);
    }
}
