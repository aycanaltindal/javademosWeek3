public class ProductManager {

    public void add(Product product){

        if(ProductValidator.isValid(product)){
            //ürünü veritabanına ekleyen kod burda
            System.out.println("Veritabanina eklendi");
        }else{
            System.out.println("Urun bilgileri gecersizdir. Veritabanina eklenemedi.");
        }

        System.out.println("--------------------");

        ProductValidator validator = new ProductValidator();
        validator.bisey();

    }
}
