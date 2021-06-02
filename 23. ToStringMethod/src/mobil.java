class Mobil3{
    String merk;
    public Mobil3(String merk){
        this.merk = merk;
    }
    public String toString(){ //mengoverride method toString()
        return "mobil merk "+merk;
    }
}
public class mobil {
    public static void main(String[] args) {
        var obj = new Mobil3("Avanza");
        System.out.println(obj);
    }

}
