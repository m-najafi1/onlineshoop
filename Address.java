package onlineshop;

public class Address {



    private static State state;
    private static City city;
    private static Street street;
    private static Postalcode postcode;

    public Address() {

    }

    public Postalcode getPostcode() {
        return postcode;
    }

    public void setPostalcode(Postalcode postalcode) {
        this.postcode = postalcode;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    ///////////////////////////////////////////////// Method


    public void getFullAddres1() {

        if (state.getState().getNameState() != null && city.getNameCity() != null && street.getNameStreet() != null && postcode.getPostalcode() != null)
            System.out.println("FullAddress:\t" + getState().getNameState() + " " + getCity().getNameCity() + "  " +
                    getStreet().getNameStreet() + "  " + getPostcode().getPostalcode());
        else {
            HandlingErrors.error();
        }
    }

    protected void showData() {

    }

//    public void getFullAddres(Address state, Address city, Address street, Address postalcode) {
//        if (state.nammeState != null && city.nameCity != null && street.nammeStrret != null && postalcode.postalcode != null)
//            System.out.println("Name State:\t" + state.nammeState + "\t Name City:\t" + city.nameCity + "\t NameStreet :\t"
//                    + street.nammeStrret + "\tPostal Code:\t" + postalcode.postalcode);
//        else {
//            HandlingErrors.error();
//        }
//    }


}
