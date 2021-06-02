class A{
    String nama;
    A(String nama){
        this.nama = nama;
        System.out.println("my name is "+nama);
    }
}
class B extends A{
    B(String nama){
        super(nama);
    }

}
public class ChecknCast {
    public static void main(String[] args) {
        A obj1 = new B("B");
        if(obj1 instanceof  A){
            A obj2 = (A) obj1;
            System.out.println("Hello A "+obj2.nama);
        }
    }
}
