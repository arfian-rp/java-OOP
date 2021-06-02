class Hewan{
    String jenis;
    String nama;
    void salam(){
        System.out.println("salam() dipanggil PARENT");
    }
}
class Darat extends Hewan{
    Darat(String nama){
        this.nama = nama;
        this.jenis = "Darat";
    }
    void salam(){
        System.out.println("salam() dipanggil CHILD");
    }
}
public class Overridding {
    public static void main(String[] args) {
        var sapi = new Darat("Sapi");
        sapi.salam();
    }
}
