import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args){
        System.out.println("Introduzca dos números que desea multiplicar:");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.print("El resultado de la multiplicación de los dos números es: "+(n1*n2));
    }
}