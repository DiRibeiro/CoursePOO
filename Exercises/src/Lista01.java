import java.util.Scanner;

public class Lista01 {
	/*1. Escreva um programa que carregue dois valores A e B pelo teclado e imprima todos
	os n�meros �mpares entre A e B.*/
	public static void valueOdd (int A, int B) {
		System.out.print("Result: ");
		for (int i = A; i < B; i++) {
			if(i % 2 == 1) {
				System.out.print(" "+i);
			}
		}
		
	}
	
	/*2. Sistema de banco*/
	public static void bank() {
		double P = 0; //Empr�stimo
		double A = 0; //Valor pago mensalmente
		double i = 0; //Porcentagem de juros do saldo corrente
		
		//Valor referente aos juros pagos em dinheiro
		
		//Valor em dinheiro aplicado em pagamento da d�vida
		
		//Valor acumulado de juros j� pagos
		
		//Valor a ser pago ao fim de cada m�s;
		
		//No final do programa
		//N�mero de meses necess�rio para pagamento do empr�stimo
		
		//Quantidade da �ltima presta��o
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1
		System.out.println("Enter two values to find all the odd numbers :");
		int valueA = sc.nextInt();
		int valueB = sc.nextInt();
		
		valueOdd(valueA, valueB);
		
		//2
		sc.close();
	}

}
