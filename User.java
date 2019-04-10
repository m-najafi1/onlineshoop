package onlineshop;

public class User extends InfoUser {
    public String getUsernamme() {
        return usernamme;
    }

    public String getPassword() {
        return password;
    }

    private String usernamme;
    private String password;

    public void setUsernamme(String usernamme) {
        this.usernamme = usernamme;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean ischekpassword(String replypass) {
        boolean ischek = false;
        if (this.usernamme != null && this.password != null) {
            if (this.password.equals(replypass)) {
                ischek = true;
                super.setUser(this);
            } else {
                HandlingErrors.validationPassword();
            }
        }
        return ischek;
    }


}
