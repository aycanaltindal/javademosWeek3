public class CustomerManager {

    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }


    public void add(){

        System.out.println("Musteri eklendi.");
        this.logger.log("Log mesaji");

        //DatabaseLogger a bağımlı kalmamak için bunu kullanmıyoruz İlerde FileLogger a geçmek isteyebiliriz
        /*
        DatabaseLogger logger  =new DatabaseLogger();
        logger.Log("Log Mesaji");
        */

    }
}
