import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la base del triángulo: ");
        int base = sc.nextInt();
        System.out.print("Introduzca la altura del triángulo: ");
        int altura = sc.nextInt();
        System.out.print("El área del triángulo es: "+((base*altura)/2));
        sc.close();
    }
}