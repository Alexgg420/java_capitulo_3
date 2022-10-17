import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.print("Introduce la cantidad en Kb: ");
        num = sc.nextDouble();
        System.out.print(num+" Kb equivalen a "+(num / 1024)+" Mb");
        sc.close();

    }

}