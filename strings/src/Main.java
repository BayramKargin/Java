import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava karlı.";
        System.out.println(mesaj);

        System.out.println(mesaj.length());
        System.out.println(mesaj.charAt(8));
        System.out.println(mesaj.concat("üşüyoruz.."));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[20];
        mesaj.getChars(5, 10, karakterler, 6);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("ı"));
        System.out.println(mesaj.lastIndexOf("a"));
        System.out.println("----------------------------------");

        String yeniMesaj=mesaj.replace(" ","-");
        System.out.println(yeniMesaj);

        System.out.println(mesaj.substring(2,5));

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        System.out.println(mesaj.trim());//Başındaki Snundaki boşlukları yok eder.



    }
}
