package onlineshop;

public class InfoUser {


    ///////////////////////////////////////////  Property

    private String namme;
    private String lastname;
    private String phone;
    private User user;
    private EmailAddress emailAddress;
    private Address address;

    /////////////////////////////////////////// Constructors
    public InfoUser() {
    }


    /////////////////////////////////////////// Getters

    public User getUser() {
        return user;
    }

    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    public Address getAddress() {
        return address;
    }
    /////////////////////////////////////////// Setters

    public void setNamme(String namme) {
        this.namme = namme;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setEmailAddress(EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
    }

    public  void setAddress(Address addres) {
        this.address = addres;
    }


}


/////////////////////////////////////////// Methods

/////////////////////////////////////////// Validations
