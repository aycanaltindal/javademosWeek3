public class CustomerManager {

    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }

    public  void add(){
        //iş kodları yazılır

        //OracleCustomerDal oracleCustomerDal = new OracleCustomerDal(); //bu şekilde yapmak oracle'a bağımlılık yaratır!!!!!

        customerDal.add();

    }
}
