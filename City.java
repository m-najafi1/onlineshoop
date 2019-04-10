package onlineshop;

public class City extends Address {

    ///////////////////////////////////////////  Property
    private int idCity;
    private String nameCity;

    public String getNameCity() {
        return nameCity;
    }


    //////////////////////////////////////////// Setters
    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    //////////////////////////////////////////// Methods
    private void showCityTehran() {
        int idCity = 1000;
        System.out.println("\n***  List of cities in Tehran province   ***");
        System.out.println("--------------------------------------------------------------------------");
        for (tehran _tehran : tehran.values()) {
            idCity++;
            System.out.println("ID City: " + '[' + idCity + ']' + '\t' + _tehran);
        }
        System.out.println("--------------------------------------------------------------------------");
    }


    private void showCityShiraz() {
        int idCity = 2000;
        System.out.println("\n***  List of cities in Shiraz province   ***");
        System.out.println("--------------------------------------------------------------------------");
        for (shiraz _shiraz : shiraz.values()) {
            idCity++;
            System.out.println("ID City: " + '[' + idCity + ']' + '\t' + _shiraz);
        }
        System.out.println("--------------------------------------------------------------------------");
    }

    private void showCityEsfahan() {
        int idCity = 3000;
        System.out.println("\n***  List of cities in Esfahan province   ***");
        System.out.println("--------------------------------------------------------------------------");
        for (esfahan _esfahan : esfahan.values()) {
            idCity++;
            System.out.println("ID City: " + '[' + idCity + ']' + '\t' + _esfahan);
        }
        System.out.println("--------------------------------------------------------------------------");
    }

    private void showCityMazandaran() {
        int idCity = 4000;
        System.out.println("\n***  List of cities in Mazandaran province   ***");
        System.out.println("--------------------------------------------------------------------------");
        for (mazandaran _mazandaran : mazandaran.values()) {
            idCity++;
            System.out.println("ID City: " + '[' + idCity + ']' + '\t' + _mazandaran);
        }
        System.out.println("--------------------------------------------------------------------------");
    }

    private String convertIdcityToNamecity(int idCity) {
        String _namecity = "null";
        int idcounter;
        if (idCity >= 1001 && idCity <= 1007) {  // Checking out the city of Tehran
            idcounter = 1000;
            for (tehran _tehran : tehran.values()) {
                idcounter++;
                if (idcounter == idCity) {
                    _namecity = _tehran.name();
                    this.nameCity=_namecity;
                }

            }
        }

        if (idCity >= 2001 && idCity <= 2008) { // Checking out the city of Shiraz
            idcounter = 2000;
            for (shiraz _shiraz : shiraz.values()) {
                idcounter++;
                if (idcounter == idCity) {
                    _namecity = _shiraz.name();
                    this.nameCity=_namecity;
                }

            }
        }


        if (idCity >= 3001 && idCity <= 3007) {  // Checking out the city of Esfahan
            idcounter = 3000;
            for (esfahan _esfahan : esfahan.values()) {
                idcounter++;
                if (idcounter == idCity) {
                    _namecity = _esfahan.name();
                    this.nameCity=_namecity;

                }
            }
        }


        if (idCity >= 4001 && idCity <= 4007) {     // Checking out the city of Mazandaran
            idcounter = 4000;
            for (mazandaran _mazandaran : mazandaran.values()) {
                idcounter++;
                if (idcounter == idCity) {
                    _namecity = _mazandaran.name();
                    this.nameCity=_namecity;

                }
            }
        }

        super.setCity(this);
        return _namecity;
//        return super.nameCity = _namecity;
    }


    ///////////////////////////////////////////////////////////// Validations

    public void validIdState(int idState) { // Return List City
        switch (idState) {
            case 1000:
                showCityTehran();
                break;
            case 2000:
                showCityShiraz();
                break;
            case 3000:
                showCityEsfahan();
                break;
            case 4000:
                showCityMazandaran();
                break;
            default:
                HandlingErrors.error();
                break;
        }

    }

    public boolean isCheckvalidIdCity() {
        boolean ischek = false;
        if (this.idCity >= 1001 && this.idCity <= 1007) {
            convertIdcityToNamecity(this.idCity);
            ischek = true;
        } else if (this.idCity >= 2001 && this.idCity <= 2008) {
            convertIdcityToNamecity(this.idCity);
            ischek = true;
        } else if (this.idCity >= 3001 && this.idCity <= 3007) {
            convertIdcityToNamecity(this.idCity);
            ischek = true;
        } else if (this.idCity >= 4001 && this.idCity <= 4007) {
            convertIdcityToNamecity(this.idCity);
            ischek = true;
        } else {
            HandlingErrors.error();
        }
        return ischek;
    }

    //////////////////////////////////////////// Enumerations
    private enum tehran {  //ID : 1001 - 1007
        Tehran(),            //id : 1001
        Shahriar(),          //id : 1002
        IslamCity(),         //id : 1003
        Alborz(),            //id : 1004
        Thought,             //id : 1005
        Qodscity,            //id : 1006
        Melard,              //id : 1007
    }

    private enum shiraz {   // ID : 2001 - 2008
        Shiraz,             //id : 2001
        Fasa,               //id : 2002
        Marvdasht,          //id : 2003
        Jahrom,             //id : 2004
        Kazeroon,           //id : 2005
        Abadeh,             //id : 2006
        Darab,              //id : 2007
        Lar,                //id : 2008

    }

    private enum esfahan {  // ID : 3001 - 3007
        Esfahan,            // id : 3001
        ShahinShahr,        // id : 3002
        Kashan,             // id : 3003
        NajafAbad,          // id : 3004
        Rezacity,           // id : 3005
        freshwater,         // id : 3006
        Urea,               // id : 3007
    }

    private enum mazandaran {   // ID : 4001  -  4007

        Sari,                // id : 4001
        Amol,                // id : 4002
        Babolsar,            // id : 4003
        GhaemCity,           // id : 4004
        Noshahr,             // id : 4005
        Chalous,             // id : 4006
        Alasht,              // id : 4007

    }


}
