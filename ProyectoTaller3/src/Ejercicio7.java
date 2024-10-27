
public class Ejercicio7 {

    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int c = 10;
        int d = 1;
        int e = 100;
        int f = 25;
        double respuesta;
        respuesta = (Math.sqrt(81) + a) / b;
        boolean verficacion = respuesta == a;

        boolean comparacion = c > d;
        boolean Comparacion1 = verficacion || comparacion;

        double operacion;
        operacion = e / f + Math.sqrt(100);
        boolean comparacion2 = comparacion && operacion;// En este caso no se puede realizar la comparacion porque en una tenemos un tipo 
        //de dato booleano y en otro un de double y no se puede realizar por el dato"&&" se necesita dos datos de tipo booleano para que se pueda resolver
        System.out.println("comparacionf = " + comparacion2);

    }
}
