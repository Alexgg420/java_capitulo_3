import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la base imponible: ");
        double base = sc.nextDouble();
        System.out.println("El IVA consta del 21% sobre el precio del producto");
        double total = (double)(base+(base*21/100));
        System.out.println("El precio total con IVA es "+total);
        double iva = (double)(total-base);
        System.out.println("El valor del IVA en el producto es de "+iva);
        sc.close();
    }
}