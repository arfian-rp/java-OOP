class Person{
    String name; //field
    String address;
    final String country = "id_ID";
}
public class Field {
    //field = attribute
    public static void main(String[] args) {
        var obj = new Person();
        obj.name = "Arfian";
        obj.address = "jogja";
        //obj.country = "amerika"; error

        System.out.println(obj.name);
        System.out.println(obj.address);
        System.out.println(obj.country);

    }
}
