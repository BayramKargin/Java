public class Main {

    public static void main(String[] args) {
        int display;
        HesapMakinesi hesapMakinesi=new HesapMakinesi();
       display= hesapMakinesi.Add(25,36);
        hesapMakinesi.sub(33,15);
        hesapMakinesi.multi(14,22);
        hesapMakinesi.div(30,3);
        System.out.println(display);
    }
}
