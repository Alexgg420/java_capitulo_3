import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la base del rectángulo: ");
        int base = sc.nextInt();
        System.out.print("Introduzca la altura del rectángulo: ");
        int altura = sc.nextInt();
        System.out.print("El área del rectángulo es: "+(base*altura));
        sc.close();
    }
}