public class Main {
    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();

        Product product = new Product();
        product.name= "Mouse";
        product.price = 15;

        productManager.add(product);

        System.out.println("--------------------");
        System.out.println("------InnerClass-------");


        DatabaseHelper.Crud.delete();
        DatabaseHelper.Connection.createConnection();

    }
}