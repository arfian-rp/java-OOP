class Hewan{
    String jenis;
    String nama;
    Hewan(int tes){
        System.out.println("construct parent dipanggil");
    }
    void salam(){
        System.out.println("salam() dipanggil PARENT");
    }
}
class Darat extends Hewan{
    Darat(String nama){
        super(0);
        this.nama = nama;
        this.jenis = "Darat";
    }
    void salam(){
        System.out.println("salam() dipanggil CHILD");
    }
    void salamParent(){
        super.salam();//memanggil field/method di class parent
    }
}

public class Super {
    public static void main(String[] args) {
        var sapi = new Darat("Sapi");
        sapi.salam();
        sapi.salamParent();
    }
}
