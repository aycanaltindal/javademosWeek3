public class Main {
    public static void main(String[] args) {

        //WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        //womanGameCalculator.hesapla();
        //womanGameCalculator.gameOver();


        //abstract bir class anca aşağıdaki şekilde new'lenebilir ama tercih edilmemeli
        /*
        GameCalculator gameCalculator = new GameCalculator() {
            @Override
            public void puanHesapla() {

            }
        };
        */

        //abstract bir class ı miras aldığı diğer class larla new'leyebiliriz
        GameCalculator gameCalculator = new WomanGameCalculator();
        gameCalculator.puanHesapla();
        gameCalculator.gameOver();
        gameCalculator.hesapla();

    }
}