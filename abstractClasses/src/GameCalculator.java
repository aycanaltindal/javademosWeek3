public abstract class GameCalculator {

    //abstract bir class ın içerisinde abstract bir metod olmayabilir veya birden fazla da olabilir


    //1.yöntem: bu metod, bu class ın kalıtım alındığı classlarda isteğe bağlı olarak override edilebilir(ezilebilir)
    public void hesapla(){
        System.out.println("Puaniniz: 100" );
    }


    //2.yöntem:
    //class a ve metod a abstract yazarak bu class ı kalıtım alan tüm class larda
    //bu abstract metodun override edilmesi zorunlu kılındı.
    public abstract void puanHesapla() ;



    //final kullanarak bu class ı kalıtım alan class larda bu metodun ezilmesi(override edilmesi) engellendi
    public final void gameOver(){
        System.out.println("Oyun bitti.");
    }


}
