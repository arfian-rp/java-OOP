abstract class Buah{
    public abstract void Rasa();
}
class mangga extends Buah{
    public void Rasa(){
        System.out.println("manis");
    }
}
public class AbstractMethod {
    public static void main(String[] args) {
        // error var x = new Hewan()
        var x = new mangga();
        x.Rasa();
    }
}

