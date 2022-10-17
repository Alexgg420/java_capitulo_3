import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca cantidad de pesetas: ");
        int pesetas = sc.nextInt();
        double euros = (double)(pesetas/166.386);
        System.out.println(pesetas+" pesetas son "+euros+" euros");
        sc.close();
    }
}