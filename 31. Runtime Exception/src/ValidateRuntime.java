public class ValidateRuntime {
    public static void validate(LoginRequest LoginRequest){
        if (LoginRequest.getUsername() == null) {
            throw new BlankExceptions("username null!");
        } else if (LoginRequest.getPassword() == null) {
            throw new BlankExceptions("password null!");
        } else if (LoginRequest.getUsername().isBlank()) {
            throw new BlankExceptions("password kosong");
        } else if (LoginRequest.getPassword().isBlank()) {
            throw new BlankExceptions("password kosong");
        }
    }
}