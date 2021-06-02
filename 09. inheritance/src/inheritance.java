class Kendaraan{
    String jenis;
    String nama;
}
class Udara extends Kendaraan{//kelas Kendaraan mewarisi field jenis
    Udara(String jenis){
        this.jenis = jenis;
        System.out.println(this.jenis);
    }
}
public class inheritance {
    public static void main(String[] args) {
        var obj = new Udara("Udara");
        obj.nama = "pesawat";
        System.out.println(obj.nama);
    }
}
