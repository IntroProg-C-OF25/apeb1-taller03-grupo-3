
public class Ejercicio6 {

    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int c = 10;
        int d = 1;
        double respuesta;
        respuesta = (Math.sqrt(81) + a) / b;
        boolean verficacion = respuesta == a;
        boolean comparacion = c > d;
        boolean respuestafinal = verficacion && comparacion;
        System.out.println("La respuestafinal es = " + respuestafinal);

    }
}
