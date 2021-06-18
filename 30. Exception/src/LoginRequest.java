class LoginRequest {
    String username, password;
    LoginRequest(String username,String password){
        this.username=username;
        this.password=password;
    }
    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public boolean LOGIN(String username, String password){
        if (username.equals(this.username)){
            if(password.equals(this.password)){
                return true;
            }
        }
        return false;
    }
}
