package Homework;

import java.util.Date;

public class Designer extends Person{
    private String style;
    public Designer(String name, Date birthDate, String style) {
        super(name, birthDate, "Designer");
        this.style = style;
    }

    public String getstyle(){
        return style;
    }

}
