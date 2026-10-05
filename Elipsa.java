

public class Elipsa {
    private float hlavniPoloosa;
    private float vedlejsiPoloosa ;


    public Elipsa(float hlavniPoloosa, float vedlejsiPoloosa) {
        if (hlavniPoloosa <= 0) {
            this.hlavniPoloosa = 1;
        } else {
            this.hlavniPoloosa = hlavniPoloosa;
        }
        if (vedlejsiPoloosa <= 0) {
            this.vedlejsiPoloosa = 1;
        } else {
            this.vedlejsiPoloosa = vedlejsiPoloosa;
        }
    }

    public float gethlavniPoloosa(){
        return hlavniPoloosa;
    }
    
    public float getvedlejsiPolosa(){
        return hlavniPoloosa;
    }

        public void setHlavniPoloosa(int hlavniPoloosa){
            if (hlavniPoloosa > 0) {
            // je to spravne -> zmenim ho
            this.hlavniPoloosa = hlavniPoloosa;
         }  else {
            //neni to spravne
         }
    }
        public void setVedlejsiPoloosa(int vedlejsiPoloosa){
            if (vedlejsiPoloosa > 0) {
                this.vedlejsiPoloosa = vedlejsiPoloosa;
            } else {

            }
    }
        @Override 
    public  String toString() {
        String vysl = "hlavni poloosa elipsy: " + hlavniPoloosa + ", vedlejsi poloosa elipsy: " + vedlejsiPoloosa;
        return vysl;
    }
    
    public float obsah(){
        return (float)hlavniPoloosa * (float)vedlejsiPoloosa * (float)Math.PI;
    }
    public boolean jsemKruznice(){
        if (hlavniPoloosa == vedlejsiPoloosa) {
            return true;
        } else {
            return false;
        }
    }


        public static void main(String[] args) {
            Elipsa E1 = new Elipsa(5, 5);
            System.out.println(E1);
            Elipsa E2 = new Elipsa(-5, 5);
            System.out.println(E2);
            Elipsa E3 = new Elipsa(10, 10);
            System.out.println(E3);
            System.out.println("hlavni poloosa elipsy E1 je: " + E1.gethlavniPoloosa());
            System.out.println("vedlejsi poloosa elipsy E1 je: " + E1.getvedlejsiPolosa());
            E1.setHlavniPoloosa(10);
            System.out.println(E1);


            System.out.println("Obsah elipsy je :" + E1.obsah());
            System.out.println("Jsem kruznice " + E3.jsemKruznice());
            
        }

}