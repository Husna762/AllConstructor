package constructorP;

import javax.print.attribute.standard.JobOriginatingUserName;

public class YahooPara {
String name = "Irin";
int age = 20;
double salary = 1250.789;

public YahooPara( String xxx , int x ) {

    this.name = xxx;
     this.age = x;

    System.out.println(this.name);
    System.out.println(this.age);



}

public YahooPara (String xyz , int y , double z) {

    this.name = xyz;
    this.age = y;
    this.salary = z;

//    System.out.println( "Her name is  "+this.name+" she is " + this.age + " years old "+ " Her salary is " +this.salary);

}

public YahooPara (double z , int y , String xyz){



    this.salary = z;
    this.age = y;
    this.name = xyz;
    System.out.println( this.age + this.name + this.salary);

}
    public static void main(String[] args) {

        YahooPara abc = new YahooPara("Fouzia" , 20);
        YahooPara tuntuni = new YahooPara("Fouzia", 20, 1250);


    }
}
