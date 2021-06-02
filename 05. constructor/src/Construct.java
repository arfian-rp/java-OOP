class Person{
    String name;
    String address;
    Person(String nama, String alamat){ //method constructor
        name = nama;
        address = alamat;
        System.out.println("Objk telah dibuat");
    }
}
public class Construct {
    //constructor = method yg otomatis dipanggil saat obj di buat
    public static void main(String[] args) {
        var obj = new Person("Arfian", "Padang");
        System.out.println(obj.name+" "+obj.address);
    }
}
