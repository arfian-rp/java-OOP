class A{
    String nama;
    A(String nama){
        this.nama = nama;
    }
    void salam(){
        System.out.println("Hello "+this.nama+" my name is A");
    }
}
class B extends A{
    String nama;
    B(String nama){
        super(nama);
        this.nama = nama;
    }
    void salam(){
        System.out.println("Hello "+this.nama+" my name is B");
    }

}
public class Polymorphism{
    public static void main(String[] args) {
    A a = new A("A");
    a.salam();
    a = new B("B"); //berubah bentuk
    a.salam();
    }
}
