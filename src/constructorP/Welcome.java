package constructorP;

public class Welcome {

// learning constructor
    // create a default construtor
  String fname = "Husna";
  int age = 25;
  String address = "Tx,Usa";



public Welcome () {


    System.out.println("Hey, Husna");



}


    public static void main(String[] args) {

        Welcome xyz = new Welcome(); // 1st we need to create a constructor object


        System.out.println(xyz.fname);

    }





}
