
public class Koule {
    //atributy
    private double polomer;


    //konstruktor
    public Koule(double polomer){
        //kontrola nullovych nebo zapornych hodnot
        if (polomer <= 0) {
            // je to spatne -> default
            this.polomer = 1;
        } else {
            //polomer je spravne zadany --> zkopirujeme
            this.polomer = polomer;
        }
    }

    //getter
    public double getPolomer(){
        return polomer;
    }
    //setter
    public void setPolomer(int polomer){
        if (polomer > 0) {
            // je to spravne -> zmenim ho
            this.polomer = polomer;
        } else {
            //neni to spravne
        }
    }

    //toString
    @Override 
    public  String toString() {
        String vysl = "koule o polomeru: ";
        vysl +=getPolomer();
        
        return vysl;
    }

    //dalsi metody
    public float povrch() {
        return (float)(4 * Math.PI * polomer * polomer);
    }
    public float objem() {
        return (float)((double)4 / 3 * Math.PI * polomer * polomer * polomer);
    }
    public float  prumer() {
        return (float)(2 * getPolomer());
    }

        public static void main(String[] args) {
        //test konstruktoru
        Koule k1 = new Koule(2.5);
        //vypis
        System.out.println(k1);
        //test rozbite koule
        Koule k2 = new Koule(-4);
        //vypis
        System.out.println(k2);
        //test getteru
        System.out.println("polomer koule je: " + k1.getPolomer());
        //test setteru
        k2.setPolomer(-5);
        //vypis
        System.out.println(k2);

        System.out.println("Povrch koule o polomeru: " + k1.getPolomer() + " je " + k1.objem());
        System.out.println("Povrch koule o polomeru: " + k1.getPolomer() + " je " + k1.povrch());
        System.out.println("Povrch koule o polomeru: " + k1.getPolomer() + " je " + k1.prumer());

    }
}
