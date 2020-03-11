import java.util.ArrayList;
import java.util.Scanner;

public class Agenda extends Contatos {
	private String nome = "";
	private String endereco = "";
	private String telefone = "";
	
	Contatos newContato = new Contatos("");
	ArrayList<String> agenda = new ArrayList();
	Scanner sc = new Scanner(System.in);
	
	public Agenda(String nome) {
		super(nome);
	}
	
	public void addContato() {
		System.out.println("Nome: ");
		newContato.setNome(sc.nextLine());
		agenda.add(this.nome = newContato.getNome());
//		System.out.println(this.nome);
	
		System.out.println("Endereço: ");
		newContato.setEndereco(sc.nextLine());
		agenda.add(this.endereco = newContato.getEndereco());
		
		System.out.println("Telefone: ");
		newContato.setTelefone(sc.nextLine());
		agenda.add(this.telefone = newContato.getTelefone());
	}
	
	public void removeContato() {
		int n = agenda.size();
		int i;
		
		for(i = 0; i < n; ++i) {
			System.out.println("Posição "+i+"- "+agenda.toString());
		}
		System.out.println("Informe a posição do contato a ser removido: ");
		i = sc.nextInt();
		
		try {
			agenda.remove(i);
			System.out.println("Contato removido com sucesso!");
		}catch (IndexOutOfBoundsException e) {
			System.out.printf("\nErro: posição inválida", e.getMessage());
		}
}
	
	public String detalhaContato() {
		System.out.println("Informe o nome do contato: ");
		String nome = sc.nextLine();
		
		if(this.nome.equals(nome)) {
			return agenda.toString();
		}else {
			return "Contato não cadastrado.";
		}
	}
	
	public void chamar() {
		
	}
	
	public void verChamadas() {
		
	}
	
	
}
