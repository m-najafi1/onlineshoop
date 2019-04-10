package onlineshop;

public class State extends Address {
    //////////////////////////////////////////////////////////////////////////// Property
    private int idState;
    private String nameState;

    public String getNameState() {
        return nameState;
    }

    public void setNameState(String nameState) {
        this.nameState = nameState;
    }

    //////////////////////////////////////////////////////////////////////////// Getters
    public int getIdState() {
        return idState;
    }

    //////////////////////////////////////////////////////////////////////////// Setters
    public void setIdState(int idState) {
        this.idState = idState;
    }

    //////////////////////////////////////////////////////////////////////////// Methods

    @Override
    public void showData() {
        int idstate = 1000;
        System.out.println("\n***  List of names of provinces of the country   ***");
        System.out.println("--------------------------------------------------------------------------");
        for (state _state : state.values()) {
            System.out.println("ID State: " + '[' + idstate + ']' + '\t' + _state);
            idstate += 1000;
        }
        System.out.println("--------------------------------------------------------------------------");
    }

    //////////////////////////////////////////////////////////////////////////// Validations
    public boolean validationState() {

        boolean ischeck = false;
        switch (idState) {
            case 1000:
                this.setNameState("Tehran");
                super.setState(this);
                ischeck = true;
                break;
            case 2000:
                this.setNameState("Shiraz");
                super.setState(this);
                ischeck = true;
                break;
            case 3000:
                this.setNameState("Esfahan");
                super.setState(this);
                ischeck = true;
                break;
            case 4000:
                this.setNameState("Mazandaran");
                super.setState(this);
                ischeck = true;
                break;
            default:
                HandlingErrors.error();
                ischeck = false;
                break;
        }
        return ischeck;

    }

    //////////////////////////////////////////////////////////////////////////// Enum
    private enum state {   // ID : 1000 - 4000
        Tehran,       // ID : 1000
        Shiraz,       // ID : 2000
        Esfahan,      // ID : 3000
        Mazandaran,   // ID : 4000
    }
}
