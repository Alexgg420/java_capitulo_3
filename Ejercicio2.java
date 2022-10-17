import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca cantidad de Euros: ");
        int canteu = sc.nextInt();
        double pesetas = (double)(canteu*166.386);
        System.out.println(canteu+" euros son "+pesetas+" pesetas");
        sc.close();
    }
}