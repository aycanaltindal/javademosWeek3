public class Main {
    public static void main(String[] args) {

        //ICustomerDal iCustomerDal= new ICustomerDal(); //interface'ler de abstract class'lar gibi new'lenemezler
        //ICustomerDal iCustomerDal= new OracleCustomerDal(); //Interface onu implement eden class ın referansını tutabilir.

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());

        customerManager.add();

    }
}