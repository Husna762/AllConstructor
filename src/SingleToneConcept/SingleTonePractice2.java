package SingleToneConcept;

public class SingleTonePractice2 {

    public static void main(String[] args) {

        SingleTonePractice1 allDressinfo = new SingleTonePractice1("Adna's Libas",150.55);

        System.out.println("My Eid dress name   " +allDressinfo.brandNameOfDress );
        System.out.println("My Eid dress Price " +allDressinfo.priceOfDress );
    }
}
