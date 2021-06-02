class Person{
    String nama;
    String alamat;
    Person(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        System.out.println(this.nama+" "+this.alamat);
    }
}
public class This {
    public static void main(String[] args) {
        var x = new Person("Arfian", "jember");
    }
}
