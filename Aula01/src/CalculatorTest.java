
public class CalculatorTest {

	public static void main(String[] args) {
		//Declaração
		Calculator calc;
		//Inicialização
		calc = new Calculator();
		
		System.out.println("Result: "+calc.sum(2, 5));

		System.out.println("Result: "+calc.substraction(2, 5));

		System.out.println("Result: "+calc.multiplication(2, 5));

		System.out.println("Result: "+calc.division(2, 5));
		
		System.out.println("Result: "+calc.rest(2, 5));

		System.out.println("Result: "+calc.power(2, 3));

	}

}
