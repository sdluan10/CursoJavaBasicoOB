public class Main {

    public static void main(String[] args) {
        coche micoche = new coche();

        micoche.añadirPuerta();

        System.out.println(micoche.puertas);
    }

    public static int suma (int a, int b) {
        return a + b;
    }
}
class coche{
    public int puertas = 4;

    public void añadirPuerta() {
         this.puertas++;



    }
}
