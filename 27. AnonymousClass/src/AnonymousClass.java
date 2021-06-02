interface helloworld{

    void sayhello();

    void sayhello(String name);

}
public class AnonymousClass {
    public static void main(String[] args) {
        helloworld english = new helloworld() { //anonymous class
            @Override
            public void sayhello() {
                System.out.println("hello");
            }

            @Override
            public void sayhello(String name) {
                System.out.println("hello " + name);
            }
        };
        helloworld indonesia = new helloworld() { //anonymous class
            @Override
            public void sayhello() {
                System.out.println("halo");
            }

            @Override
            public void sayhello(String name) {
                System.out.println("halo " + name);
            }
        };

        english.sayhello();
        english.sayhello("Arfian");
        indonesia.sayhello();
        indonesia.sayhello("Arfian");
    }
}
