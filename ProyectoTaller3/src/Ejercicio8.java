
public class Ejercicio8 {

    public static void main(String[] args) {
        int a = 10;
        int b = 9;
        int c = 20;
        int d = 500;
        int f = 2;
        int g = 3;
        int h = 200;
        int j = 50;
        int k = 51;
        double operacion1 = (a * b) + c - (d) / f + Math.pow(g, 2);
        boolean comparacion1 = operacion1 >= h;

        double operacion2 = j - j + k;
        boolean comparacion2 = j >= operacion2;
        boolean comparacionfinal = comparacion1 || comparacion2;
        System.out.println("comparacionfinal = " + comparacionfinal);

    }
}
