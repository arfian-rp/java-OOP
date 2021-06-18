public class ValidationUtil {
    public static void validate(LoginRequest LoginRequest) throws ValidationException {
        if (LoginRequest.getUsername() == null) {
            throw new ValidationException("username null!");
        } else if (LoginRequest.getPassword() == null) {
            throw new ValidationException("password null!");
        } else if (LoginRequest.getUsername().isBlank()) {
            throw new ValidationException("password kosong");
        } else if (LoginRequest.getPassword().isBlank()) {
            throw new ValidationException("password kosong");
        }
    }
}


