package onlineshop;

import javax.print.attribute.standard.SheetCollate;
import javax.xml.soap.SOAPHeaderElement;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        InfoUser infoUser;
        Scanner inpScanner = new Scanner(System.in);
        State state;
        City city;
        Street street;
        Postalcode postalcode;
        EmailAddress emailAddress;
        AppliancesElectronic appliancesElectronic = null;
        Shoes shoes = null;
        Readings readings = null;
        Address address;

  /*
    **** Start Operation Create User ****
        // Input Values [Name,LastName,Phone Mobile,Email Address]
  */
        Messages.createmessage(4);
        infoUser = new User();
        // infoUser.setNamme(inpScanner.next());
        infoUser.setNamme("Mehran");
        Messages.createmessage(5);
        //infoUser.setLastname(inpScanner.next());
        infoUser.setLastname("Najafi");
        Messages.createmessage(6);
        //   infoUser.setPhone(inpScanner.next());
        infoUser.setPhone("09365092694");
        Messages.createmessage(7);

        // Start Is Check Input Value [Email Address,State,City,Street,Postcode]
        emailAddress = new EmailAddress();
        //emailAddress.setEmailAddress(inpScanner.next());
        emailAddress.setEmailAddress("m.najafi@outlook.com");
        while (!emailAddress.ischeckEmailAddress()) {
            Messages.createmessage(7);
            emailAddress.setEmailAddress(inpScanner.next());
        }

        Messages.createmessage(1); // Send One Number Message Between 1 To 12  And Return Message
        // ((User) infoUser).setUsernamme(inpScanner.next());
        ((User) infoUser).setUsernamme("Mehran_Najafi");
        Messages.createmessage(2);
        //  ((User) infoUser).setPassword(inpScanner.next());
        ((User) infoUser).setPassword("123");
        Messages.createmessage(3);
        //String replayPassword = inpScanner.next();
        String replayPassword = "123";
        while (!((User) infoUser).ischekpassword(replayPassword)) {  // Is Check Value Replay Password And Return (True/False)
            Messages.createmessage(2);
            ((User) infoUser).setPassword(inpScanner.next());
            Messages.createmessage(3);
            replayPassword = inpScanner.next();
        }
        state = new State();
        state.showData();
        Messages.createmessage(9);
        // state.setIdState(inpScanner.nextInt());     // Set Input value in property IdState

        state.setIdState(2000);
        while (!state.validationState()) { // Is Check Value IdState And Return (True/False)
            Messages.createmessage(9);
            state.setIdState(inpScanner.nextInt()); // Set Input value in property IdState
        }
        //((City) city).validIdState(((State) state).getIdState()); // Set Input value in property IdState And return List City
        city = new City();
        city.validIdState(state.getIdState());
        Messages.createmessage(10);
        //city.setIdCity(inpScanner.nextInt()); // Set Input value in property IdCity
        city.setIdCity(2001);
        while (!city.isCheckvalidIdCity()) { // Is Check Value IdCity And Return (True/False)
            Messages.createmessage(10);
            city.setIdCity(inpScanner.nextInt());
        }

        street = new Street();
        street.showListStreet();
        Messages.createmessage(11);

        // street.setIdStreet(inpScanner.nextInt()); // Set Input value in property IdStreet And
        street.setIdStreet(120);
        while (!street.isChekvalidIdStreet()) { // Is Check Value IdStreet And Return (True/False)
            Messages.createmessage(11);      // If (isCheckValidIdStreet()==False) Replay Loop While
            street.setIdStreet(inpScanner.nextInt());
        }

        Messages.createmessage(12);
        postalcode = new Postalcode();
        // postalcode.setPostalcode(inpScanner.next());
        postalcode.setPostalcode("1234567890");
        while (!postalcode.isValidPostalcod()) {
            Messages.createmessage(12);
            postalcode.setPostalcode(inpScanner.next());
            //  postalcode.setPostalcode("1234567890");
        }
        address = new Address();
        address.getFullAddres1();
        /*
        // End s Check Input Value [Email Address,State,City,Street,Postcode
    *** End Operation Create User ***
         */
        for (int _productcode = 1000; _productcode <= 1013; _productcode++) { // ************ Start Initialization *************
            if (_productcode >= 1000 && _productcode <= 1002) {

                appliancesElectronic = new Radio();
                appliancesElectronic.initializeProduct(_productcode);
                appliancesElectronic.SetToArrayElectronic();
                appliancesElectronic.showProduct();
            } else if (_productcode >= 1003 && _productcode <= 1005) {

                appliancesElectronic = new Television();
                appliancesElectronic.initializeProduct(_productcode);
                appliancesElectronic.SetToArrayElectronic();
                appliancesElectronic.showProduct();

            } else if (_productcode >= 1006 && _productcode <= 1007) {

                shoes = new Sportshoes();
                shoes.initializeProduct(_productcode);
                shoes.setToArrayShoes();
                shoes.showProduct();
            } else if (_productcode >= 1008 && _productcode <= 1010) {

                shoes = new Formalshoes();
                shoes.initializeProduct(_productcode);
                shoes.setToArrayShoes();
                shoes.showProduct();
            } else if (_productcode >= 1011 && _productcode <= 1013) {

                readings = new Magazine();
                readings.initializeProduct(_productcode);
                readings.setToArrayShoes();
                readings.showProduct();
            }
            else if (_productcode >= 1014 && _productcode <= 1015) {

                readings = new Book();
                readings.initializeProduct(_productcode);
                readings.setToArrayShoes();
                readings.showProduct();
            }

        } // ************ End Initialization *************

        Menu.showMenu();
        int codeMenu, productcod, productnumber;
        codeMenu = Menu.visiblMeenu();

        while (codeMenu != 0) {
            if (codeMenu == 1) { //Start Add Item
                Messages.createmessage(8);
                productcod = inpScanner.nextInt();
                Messages.createmessage(13);
                productnumber = inpScanner.nextInt();
                if (productcod >= 1000 && productcod <= 1015 && productnumber >= 1 && productnumber <= 5) {
                    if (productcod >= 1000 && productcod <= 1002)
                        appliancesElectronic = new Radio();
                    else if (productcod >= 1003 && productcod <= 1005)
                        appliancesElectronic = new Television();
                    else if (productcod >= 1008 && productcod <= 1010)
                        shoes = new Formalshoes();
                    else if (productcod >= 1011 && productcod <= 1013)
                        readings = new Magazine();
                    else if (productcod >= 1006 && productcod <= 1007)
                        shoes = new Sportshoes();
                    else if (productcod >= 1014 && productcod <= 1015)
                        readings = new Book();


                    while ((!appliancesElectronic.addProduct(productcod, productnumber)) && (!shoes.addProduct(productcod, productnumber))
                            && (!readings.addProduct(productcod, productnumber))) { // ********* Start Operation Add Item **********
                        Menu.showMenu();
                        codeMenu = Menu.visiblMeenu();
                        if (codeMenu == 1) {
                            Messages.createmessage(8);
                            productcod = inpScanner.nextInt();

                            Messages.createmessage(13);
                            productnumber = inpScanner.nextInt();

                        } else

                            break;

                    }
                    HandlingErrors.addItem(productcod, productnumber);  // ************** End Operation Add Item ****************

                    if (codeMenu == 1) {
                        Menu.showMenu();
                        codeMenu = Menu.visiblMeenu();

                    }
                } else {
                    HandlingErrors.notProductCodeOrnumber();
                    Menu.showMenu();
                    codeMenu = Menu.visiblMeenu();
                }
            }// End Add Item

            else if (codeMenu == 2) { //Start Delete Item
                Messages.createmessage(8);
                productcod = inpScanner.nextInt();
                Messages.createmessage(13);
                productnumber = inpScanner.nextInt();
                if (productcod >= 1000 && productcod <= 1015 && productnumber >= 1 && productnumber <= 5) {
                    if (productcod >= 1000 && productcod <= 1002)
                        appliancesElectronic = new Radio();
                    else if (productcod >= 1003 && productcod <= 1005)
                        appliancesElectronic = new Television();
                    else if (productcod >= 1006 && productcod <= 1007)
                        shoes = new Sportshoes();
                    else if (productcod >= 1008 && productcod <= 1010)
                        shoes = new Formalshoes();
                    else if (productcod >= 1014 && productcod <= 1015)
                        readings = new Book();
                    else if (productcod >= 1011 && productcod <= 1013)
                        readings = new Magazine();

                    while ((!appliancesElectronic.deleteProduct(productcod, productnumber)) && (!shoes.deleteProduct(productcod, productnumber))
                            && (!readings.deleteProduct(productcod, productnumber))) { //************ Start  Operation Delete Item
                        Menu.showMenu();
                        codeMenu = Menu.visiblMeenu();
                        if (codeMenu == 2) {
                            Messages.createmessage(8);
                            productcod = inpScanner.nextInt();
                            Messages.createmessage(13);
                            productnumber = inpScanner.nextInt();
                        } else
                            break;

                    }
                    HandlingErrors.deleteItem(productcod, productnumber); //*************** End  Operation Delete Item *****************
                    if (codeMenu == 2) {
                        Menu.showMenu();
                        codeMenu = Menu.visiblMeenu();
                    }
                } else {
                    HandlingErrors.notProductCodeOrnumber();
                    Menu.showMenu();
                    codeMenu = Menu.visiblMeenu();
                }

            }// **************** End Delete Item  ****************

            else if (codeMenu == 3) {
                appliancesElectronic = new AppliancesElectronic();
                appliancesElectronic.showProduct();
                Menu.showMenu();
                codeMenu = Menu.visiblMeenu();

            }

        }
        System.out.println(" Product Regester Finul........ ");

    }


}

