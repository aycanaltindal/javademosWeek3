public class BaseKrediManager {

    public  double hesapla(double tutar){
        return tutar * 1.18;
    }

    //private olduğu için yalnızca bu class'ta kulllanılır
    //kalıtım vermiş olduğu diğer class'ların nesneleri tarafından kullanılamaz
    private double topla(double tutar){
        return tutar + 1000;
    }

    public final double carp(double tutar){
        return tutar * 2;
    }

}
