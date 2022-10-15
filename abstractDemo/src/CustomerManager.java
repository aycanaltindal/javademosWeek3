public class CustomerManager {


    BaseDatabaseManager databaseManager;

    public void getCustomers(){

        databaseManager.getData();

        //Aşağıdaki şekilde yapmak oracle a bağımlı olduğu için tercik-h edilmemeli
        /*
        OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
        oracleDatabaseManager.getData();
        */


    }
}
