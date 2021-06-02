interface Car{
    void drive();
    default boolean isbig(){ //tidak wajib di override
        return false;
    }
}
class avanza implements Car{
    public void drive() {
        System.out.println("Avanza drive");
    }

    public boolean isbig(){//tidak wajib
        return true;
    }
}

public class defaultMethod {
    public static void main(String[] args) {
        var obj = new avanza();
        obj.drive();
        System.out.println(obj.isbig());;
    }
}
