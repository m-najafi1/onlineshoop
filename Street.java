package onlineshop;

public class Street extends Address {
    private int idStreet;

    public void setNameStreet(String nameStreet) {
        this.nameStreet = nameStreet;
    }

    private String nameStreet;


    public String getNameStreet() {
        return nameStreet;
    }

    public void setIdStreet(int idStreet) {
        this.idStreet = idStreet;
    }

    public void showListStreet() {
        int idCity = 100;
        System.out.println("\n***  List all streets of provinces   ***");
        System.out.println("-----------------------------------------------------------------------------------------------");
        for (streets _streets : streets.values()) {
            idCity++;
            if (idCity == (idCity / 2) * 2)
                System.out.println("\t\t\tID Street: " + '[' + idCity + ']' + '\t' + _streets);
            else {

                System.out.print("ID Street: " + '[' + idCity + ']' + "   " + _streets);
            }
        }
        System.out.println("\n----------------------------------------------------------------------------------------------");
    }


    private String convertIdstreetToNamestreet(int idStreet) {
        String _namestreet = "null";
        int idcounter;
        if (idStreet >= 101 && idStreet <= 120) {  // Checking out the street all State
            idcounter = 100;
            for (streets _strrets : streets.values()) {
                idcounter++;
                if (idcounter == idStreet) {
                    _namestreet = _strrets.name();
                    this.setNameStreet(_namestreet);
                    super.setStreet(this);
                }

            }
        }


        return _namestreet;
    }

    public boolean isChekvalidIdStreet() {
        boolean ischek = false;
        if (this.idStreet >= 101 && this.idStreet <= 120) {
            convertIdstreetToNamestreet(this.idStreet);
            ischek = true;
        } else {
            HandlingErrors.error();
        }
        return ischek;
    }


    private enum streets {   //  id : 101 - 124 For Id Streets
        Bahman22Street,                           //  id : 101
        MullahMajdaddinStreet,                    //  id : 102
        CoohsarStreet,                            //  id : 103
        EmamzadehAbbasStreet,                     //  id : 104
        TajrishStreet,                            //  id : 105
        WasalShiraziStreet,                       //  id : 116
        ValiasrStreet,                            //  id : 107
        NoshahrStreet,                            //  id : 108
        EnghelabStreet,                           //  id : 109
        BoulevarBesat,                            //  id : 110
        AmadgahStreet,                            //  id : 111
        HafezStreet,                              //  id : 112
        KashaniStreet,                            //  id : 113
        Hassanabad,                               //  id : 114
        TaleghaniStreet,                          //  id : 115
        ChaharBaghStreet,                         //  id : 116
        ChalousStreet,                            //  id : 117
        SepahStreet,                              //  id : 118
        LavasanStreet,                            //  id : 119
        AzadiStreet                               //  id : 120


    }


}



