public class KidsGameCalculator extends GameCalculator{

    //1.yöntem isteğe bağlı override ederek kalıtım aldığı class'taki metodu burda ezmek
    /*
    public void hesapla(){
        System.out.println("Puaniniz: 100" );
    }
    */

    //2.yöntem kalıtım alınan base class ta bu metod abstract olduğu için bu metodun override edilmesi zorunlu kılınmış.
    @Override
    public void puanHesapla(){
        System.out.println("Puaniniz: 100" );
    }
}
