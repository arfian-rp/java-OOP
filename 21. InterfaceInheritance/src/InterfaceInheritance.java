interface kendaran{
    void jenis();
}
interface mobil extends kendaran{
    void roda();
}
interface harga{
    void harga();
}
class Avanza implements mobil, harga{
    public void jenis(){
        System.out.println("Darat");
    }
    public void roda(){
        System.out.println(4);
    }
    public void harga(){
        System.out.println(400_000);
    }
}
public class InterfaceInheritance {
    public static void main(String[] args) {
        var obj = new Avanza();
        obj.jenis();
        obj.roda();
        obj.harga();
    }
}
