public class Main {

    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();
        System.out.println("----------------------------------------------");

        GameCalculator gameCalculator = new KidsGameCalculator();
        gameCalculator.hesapla();
        System.out.println("----------------------------------------------");
        GameCalculator[] gameCalculator1 = new GameCalculator[]{new KidsGameCalculator(), new ManGameCalculator()
        };
        for (GameCalculator game : gameCalculator1) {
            game.hesapla();
        }

    }
}
