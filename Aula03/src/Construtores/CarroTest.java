package Construtores;

public class CarroTest {

	public static void main(String[] args) {
		
		//isso funciona mesmo a classe carro tendo nada.
		Carro carro = new Carro();	
		//funciona pq o compilador criou a m�todo construtor vazio
		
		//marca n�o tem a visibilidade declarada, logo � public package
		carro.marca = "Honda";
		
		//n�o funciona, pois o construtor foi declarado
		//Personagem p = new Personagem();
		
		Personagem p = new Personagem("JavaBot");
		
		
	}

}
