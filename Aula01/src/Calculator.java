
public class Calculator {
	//Soma
	double sum(double number1, double number2) {
		return number1 + number2;
	}

	//Subtra��o
	double substraction(double number1, double number2) {
		return number1 - number2;
	}
	
	//Multiplica��o
	double multiplication(double number1, double number2) {
		return number1 * number2;
	}
	
	//Divis�o
	double division(double number1, double number2) {
		return (number2 == 0) ? 0 : number1 / number2;
	}
	
	//Resto
	double rest(double number1, double number2) {
		return number1 % number2;
	}

	//Potencia
	double power(double number1, double number2) {
		double res = 1;
		for (int i = 0; i < number2 ; i++) {
			res *= number1;
		}
		return res;
	}
	
}
