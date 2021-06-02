class Person{
    String name;
    String address;
    Person(String nama){
        this(nama, null); //memanggil construct bawah
    }
    Person(String nama, String alamat){ //overload
        name = nama;
        address = alamat;
        System.out.println("Objk telah dibuat");
    }
}
public class ConstructOverload {
    //constructor = method yg otomatis dipanggil saat obj di buat
    public static void main(String[] args) {
        var obj1 = new Person("Arfian");
        System.out.println(obj1.name+" "+obj1.address);
        var obj2 = new Person("Arfian", "Padang");
        System.out.println(obj2.name+" "+obj2.address);
    }
}


