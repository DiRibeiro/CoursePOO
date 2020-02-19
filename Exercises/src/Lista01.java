import java.util.Scanner;

public class Lista01 {
	/*1. Escreva um programa que carregue dois valores A e B pelo teclado e imprima todos
	os números ímpares entre A e B.*/
	public static void valueOdd (int A, int B) {
		System.out.print("Result: ");
		for (int i = A; i < B; i++) {
			if(i % 2 == 1) {
				System.out.print(" "+i);
			}
		}
		
	}
	
	/*
	 */
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
