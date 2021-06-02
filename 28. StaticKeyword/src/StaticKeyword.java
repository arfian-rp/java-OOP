class tes{
    static int jumlah = 0; //static field
    tes(){
        jumlah++;
    }
    static int getJumlah(){ //static method
        return jumlah;
    }
    //anda tidak dapat lagi mengakses outer apabila menambahkan static pada inner
    static class tes2{ //static inner class
        private String name;
        tes2(String n){
            name=n;
        }
        String getName(){
            return name;
        }
    }
    static int PROCESSOR;
    static {//Static block
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }

}
public class StaticKeyword {
    public static void main(String[] args) {
        var  obj1 = new tes();
        var  obj2 = new tes();
        System.out.println(tes.jumlah);
        System.out.println(tes.getJumlah());
        tes.tes2 tes2obj = new tes.tes2("Arfian");
        System.out.println(tes2obj.getName());;
        System.out.println(tes.PROCESSOR);
    }
}
