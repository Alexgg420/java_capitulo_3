import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de horas que ha trabajado esta semana: ");
        int horas = sc.nextInt();
        System.out.print("Su salario semanal es: "+(horas*12)+" euros");
        sc.close();
    }
}