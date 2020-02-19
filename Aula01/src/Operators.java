
public class Operators {

	public static void main(String[] args) {
		float balance = 0;
		//Adição
		balance += 1000;
		
		//Subtração
		balance -= 500;
		
		//Multiplicação
		balance *= 2;
		
		//Divisão
		balance /= 2;
		
		System.out.println("Your balance is: "+balance+".\n\n");
		
		//Resto
		//Verificar se número é impar
		int number = 13;
		//Ímpar = odd
		boolean odd = number % 2 == 1;
		
		System.out.println("Number is odd: "+odd+".\n\n");
		
		//Operadores relacionais
		//< <= > >= != == || &&
		//Resultado de um operador relacional  é sempre Verdadeiro ou Falso
		
		boolean conditional = 5 > 2; //True
		conditional = 3 == 4; //False
		
		//Operador ternário
		int age1 = 25;
		int age2 = 20;
		
		boolean result = (age1 != age2) ? true : false;
		
		System.out.println(result);
	}

}
