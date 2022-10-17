public class OgrenciKrediManager extends BaseKrediManager{

    //kalıtım aldığı BaseKrediManager class ındaki metod override edildi
    public  double hesapla(double tutar){
        return tutar * 0.9;
    }

    //kalıtım aldığı BaseKrediManager class ındaki metod final olduğu için override edilemedi
    /*
    public final double carp(double tutar){
        return tutar * 2;
    }
    */
}
