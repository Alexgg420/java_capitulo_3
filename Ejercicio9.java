import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio;
        double altura;
        System.out.print("Introduce el radio del cono: ");
        radio = sc.nextFloat();
        System.out.print("Introduce la altura del cono: ");
        altura = sc.nextFloat();
        double solucion = (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;
        System.out.println("El volumen del cono es de " + String.format("%.8f", solucion));
        sc.close();
    }
}