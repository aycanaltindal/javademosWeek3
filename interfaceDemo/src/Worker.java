//Kendi çalışanımız
public class Worker implements IWorkable, IEatable, IPayable{

    @Override
    public void work() {
        //Kendi çalışanımız 09 - 17 arası çalışır

    }

    @Override
    public void eat() {
        //Kendi çalışanımıza 12-13 arası yemke verilir
    }

    @Override
    public void pay() {
        //Kendi çalışanımıza aylık x maaş verilir
    }
}
