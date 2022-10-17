//Bir ürünü kaydederken/güncellerken kurallara uygun olup olmadığının bulmak için kullanılacak
public class ProductValidator {

    //Bu static constructor static metodun kullanıldığı yerlerde çalışır
    static{
        System.out.println("Statik yapici blok calisti");
    }

    //Bu static constructor'ı birden fazla sayıda daoluşturabiliriz
    static{
        System.out.println("2.Statik yapici blok calisti");
    }

    //Bu class adı ile olan constructor ise ancak ProductValidator class'ı new'lendiğinde çalışır
    public ProductValidator(){
        System.out.println("Yapici blok calisti");
    }

    //static metodlar direk class ismi ile çağrılır(class'ı new'lemeden)
    // ve çağrıldığı an bellekte oluşur
    // Exp: ProductValidator.isValid(product)
    public static boolean isValid(Product product){
        if(product.price > 0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    //bu metod static olmadığı için class'ı new'lemeden bunu çağıramayız
    //Exp: ProductValidator validator = new ProductValidator();
    //     validator.bisey();
    public void bisey(){

    }

    //Java'da bir class'ın kendisi static yapılamaz ama
    //"Inner class" ile bir class içinde oluşturulan başka bir class'ı static yapabiliriz
    public class BaskaBirClass{
        public static void ekle(){

        }
    }

}
