
public class Exercise01 {

	public static void main(String[] args) {
		Contatos contato = new Contatos("");
		
		contato.setNome("Diego");
		System.out.println(contato.getNome());

		contato.setEndereco("Avenida Getúlio Vargas, 70/1 - Centro");
		System.out.println(contato.getEndereco());
	}

}
