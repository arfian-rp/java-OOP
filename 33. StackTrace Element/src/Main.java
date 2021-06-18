public class Main {
    public static void main(String[] args) {
        //stack trace element berisi informasi tentang class file bahkan balis error
        try {
            String[] nama = {
                    "adi","abi","eko"
            };
            System.out.println(nama[100]);
        }catch (Throwable throwable){
            StackTraceElement[] stacktrace = throwable.getStackTrace();
            throwable.printStackTrace();
        }
    }
}
