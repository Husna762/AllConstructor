package constructorP;

import java.sql.SQLOutput;

public class WelcomePara {

    String name = "Ashraf";
    int age = 35;

    public WelcomePara (){   //Default constructor

    }

    public WelcomePara ( String lname , int age ){ // single constructor
        this.name = lname;     // this value "name" is come from paramitarize value "String name"
        this.age = age;
        System.out.println( "His name is "+this.name +" " + "His age is " +this.age);
    }
    public static void main( String[] args) {

        WelcomePara abc = new WelcomePara();

//WelcomePara bulbuli = new WelcomePara("Ashraf") // argument passing inside the constructor
WelcomePara tuntuni = new WelcomePara("Ashraf", 35);
    }
}
