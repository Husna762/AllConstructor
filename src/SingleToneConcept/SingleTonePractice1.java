package SingleToneConcept;

public class SingleTonePractice1 {
    //1st create a default private constructor.
    //Syntax : private  Classname ( ) { }
    private SingleTonePractice1() {

    }

    //2nd we need to create  Private Static object for this default constructor
// Syntax : private static class name obj = new construtor of  the class ();
    private static SingleTonePractice1 dressInfo = new SingleTonePractice1();

    // 3rd Now create a public static returntype default method
//Syntax : public static classname method name () {}
    public static SingleTonePractice1 getDress() {

        return dressInfo;
    }

    //4th create some instance variable

    String brandNameOfDress;
    double priceOfDress;

// 5th create a public paramitarized constructor
    // Syntax : public classname (instance variable )

    public SingleTonePractice1 (String brandNameOfDress, double priceOfDress) {

this.brandNameOfDress = brandNameOfDress;
this.priceOfDress = priceOfDress;



    }


}
