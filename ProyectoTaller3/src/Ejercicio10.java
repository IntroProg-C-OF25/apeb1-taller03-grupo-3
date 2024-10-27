
public class Ejercicio10 {

    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        int c = 5;
        int d = 2;

        double operacion1 = Math.sqrt(25) * a;
        boolean comparacion1 = operacion1 >= b;

        double operacion2 = a / c;
        boolean comparacion2 = operacion2 >= d;

        boolean comparaciontotal = comparacion1 && true || false || comparacion2;
        System.out.println("comparaciontotal = " + comparaciontotal);
    }

}
