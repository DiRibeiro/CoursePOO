
public class Exercises02 {

	public static void main(String[] args) {
		Agenda contato = new Agenda("");
		
		contato.addContato();
		System.out.println(contato.detalhaContato());
		
		contato.removeContato();
	}

}
