public class Main {

    public static void main(String[] args) {
       int argument= toplam(1,2,23,25,36,44,41);
       System.out.println(argument);
        int argument1= toplam(2,54);
        System.out.println(argument1);
       int toplam= topla(25,44);
       System.out.println(toplam);
    }
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    //istediğin kadar parametre girebilirsin.
    //variable arguments.
    public static int toplam(int... sayilar){
        int toplam=0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}
