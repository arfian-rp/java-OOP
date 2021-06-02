class angka{
    private int p;
    private int l;
    angka(int n, int k){
        p = n;
        l = k;
    }
    public int getL() {
        return l;
    }

    public int getP() {
        return p;
    }
}
class L extends angka{
    L(int n, int k){
        super(n, k);
    }
    public int getLuas(){
        int hasil = this.getP() * this.getL();
        return hasil;
    }
}
public class GetterSetter {
    public static void main(String[] args) {
        var obj = new L(12, 8);
        System.out.println(obj.getLuas());
    }
}
