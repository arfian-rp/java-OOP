public class Main {
    public static void main(String[] args) {
        LoginRequest user = new LoginRequest("Arfian",null);
        ValidateRuntime.validate(user); //berbeda dengan exception, runtime exception tidak perlu try catch
    }
}
