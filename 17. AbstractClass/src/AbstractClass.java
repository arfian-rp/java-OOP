abstract class Hewan{

}
class Darat extends Hewan{

}
public class AbstractClass {
    public static void main(String[] args) {
        // error var x = new Hewan()
        var x = new Darat();
    }
}
