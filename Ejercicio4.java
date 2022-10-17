import java.util.Scanner;
public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int n1 = sc.nextInt();
		System.out.print("Introduzca otro número: ");
		int n2 = sc.nextInt();
		System.out.println("Introduzca la operación que desea realizar: ");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		int op = sc.nextInt();
		if(op==1)
		    System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
		else if(op==2)
		    System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
		else if(op==3)
		    System.out.println(n1 + " x " + n2 + " = " + (n1*n2));
		else if(op==4 && n2!=0)
		    System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
		else
		    System.out.println("Operación no permitida");
		sc.close();
	}
}
