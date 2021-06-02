class Person{
    String name;
    void Tes(String name){
        System.out.println("hi "+name);
    }
}
public class Method {
    public static void main(String[] args) {
        var obj = new Person();
        obj.name = "Arfian";
        obj.Tes(obj.name);
        var objLain = new Person();
        objLain.name = "Pradana";
        objLain.Tes(objLain.name);
    }
}
