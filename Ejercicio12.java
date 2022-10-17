import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1;
        double notaFinal;
        double solucion;
        System.out.print("Introduce la nota del primer examen: ");
        nota1 = sc.nextDouble();
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        notaFinal = sc.nextDouble();
        solucion = ((notaFinal - (nota1 * 0.4)) / 0.6);
        System.out.println("Para tener un " + notaFinal + " en el trimestre, necesitas sacar un " + solucion + " en el segundo examen");
        sc.close();
    }
}