import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoginRequest user = new LoginRequest("test",null);

        //ValidationUtil.validate(user); //method ini menyebabkan error salah
        try { //gunakan try catch!
            ValidationUtil.validate(user);
            System.out.println("end (tidak dieksekusi kalau error)");
        }catch (ValidationException e){
            System.out.println(e.getMessage());
        }
    }
}
