
public class Operators {

	public static void main(String[] args) {
		float balance = 0;
		//Adi��o
		balance += 1000;
		
		//Subtra��o
		balance -= 500;
		
		//Multiplica��o
		balance *= 2;
		
		//Divis�o
		balance /= 2;
		
		System.out.println("Your balance is: "+balance+".\n\n");
		
		//Resto
		//Verificar se n�mero � impar
		int number = 13;
		//�mpar = odd
		boolean odd = number % 2 == 1;
		
		System.out.println("Number is odd: "+odd+".\n\n");
		
		//Operadores relacionais
		//< <= > >= != == || &&
		//Resultado de um operador relacional  � sempre Verdadeiro ou Falso
		
		boolean conditional = 5 > 2; //True
		conditional = 3 == 4; //False
		
		//Operador tern�rio
		int age1 = 25;
		int age2 = 20;
		
		boolean result = (age1 != age2) ? true : false;
		
		System.out.println(result);
	}

}
