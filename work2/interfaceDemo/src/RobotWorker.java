
//İlerde şirkete robot çalışanlar dahil olunca bunu bir class oluşturarak ekleyebildik
// ve gerekli interface'leri(ihtayaç varsa yeni de oluşturarak) implemet ettik
public class RobotWorker  implements IWorkable, IMaintable{
    @Override
    public void work() {
        //Robotlar 7/24 çalışır
    }

    @Override
    public void maintain() {
        //Robotlara haftada bir bakım yapılır
    }
}
