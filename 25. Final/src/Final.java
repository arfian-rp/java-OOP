class sosialmedia{
    final void a(){//method tidak dapat di override
        System.out.println("ok a");
    }
}
final class facebook extends sosialmedia{//kelas ini tidak boleh diturunkan lagi
//    void a(){//error
//        System.out.println("ok a");
}

public class Final {
    public static void main(String[] args) {

    }
}
