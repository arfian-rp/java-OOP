interface Car{
    void drive();
    int getTier();
}
class Avanza implements Car{
    public void drive() {
        System.out.println("Avanza drive");
    }

    public int getTier() {
        return 4;
    }
}
public class appInterface {
    public static void main(String[] args) {
        var obj = new Avanza();
        obj.drive();
        obj.getTier();
    }
}
