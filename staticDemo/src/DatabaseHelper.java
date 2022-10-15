public class DatabaseHelper {

    //Inner Class
    //Crud: Create Read Update Delete
    public static class Crud{
        public static void delete(){
            System.out.println("Silindi");
        }
        public static void update(){
            System.out.println("Guncellendi");
        }
    }

    //Inner Class
    public static class Connection{
        public static void createConnection(){
            System.out.println("Baglanti Kuruldu");
        }
    }
}
