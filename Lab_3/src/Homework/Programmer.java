package Homework;

import java.util.Date;

public class Programmer extends Person {
    public String favoriteLanguage;
    public Programmer(String name, Date birthDate, String favoriteLanguage) {
        super(name, birthDate, "Programmer");
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getfavoriteLanguage(){
        return favoriteLanguage;
    }


}
