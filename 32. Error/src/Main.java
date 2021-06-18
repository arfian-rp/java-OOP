public class Main {
    //jenis exception yg terakkhir
    //tidak direkomendasikan untuk di try-catch\
    //direkomendasikan mematikan app
    public static void main(String[] args) {
        ConnectDB("a", "admin");
        System.out.println("koneksi berhasil");
    }
    public static void ConnectDB(String username, String password){
        if(username == null || password == null){
            throw new databaseError("password atau username null!");
        }
    }
}
