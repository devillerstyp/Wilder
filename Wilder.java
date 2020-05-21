package Wilder;

public class Wilder {

    // attributes
    private String firstname;
    private static boolean aware;

    // constructors
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }
    // getters
    public String getFirstName() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    // setters
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }
    // static method

    public String whoAmI() {
        //ou if(this.aware)
        if(isAware()){

            //pour l'affichage du nom, on peut utiliser firsname ou getFirstName
            String afficher = "Je m'appelle " + firstname + " et je suis aware";
            return afficher;

        }else{

             String afficher = "Je m'appelle " + getFirstName() + " et je ne suis pas aware";
             return afficher;
        }


    }

}

