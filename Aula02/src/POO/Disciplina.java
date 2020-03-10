package POO;

public class Disciplina {

	//atributos privados - apenas a pr�pria classe pode manipular estes atributos
	private String nome;
	private float notas[];
	
	//m�todo construtor
	/*
	 * configuramos o estado inicial da classe, setando os estados
	 * de cada um dos atributos.
	 * 
	 */
	public Disciplina(String nomeDaDisciplina) {
		System.out.println("Construindo o objeto...");
		nome = nomeDaDisciplina;
		notas = new float[0];
	}
	
	//m�todos => normalmente s�o p�blicos para que determinem
	//de que maneira utilizaremos a classe.
	//podem existir m�todos privados, sempre s�o auxiliares para a pr�pria classe.
	public String getNome() {
		return nome;
	}

	public float[] getNotas() {
		return notas;
	}
	
	public void setNotas(float[] novasNotas) {
		for (int i = 0; i < novasNotas.length; i++) {
			if (novasNotas[i] < 0 || novasNotas[i] > 10) {
				return;
			}
		}
		notas = novasNotas;
	}
	
	//EXERC�CIO - TRANSFORMAR AS CONSULTAS DA CLASSE REVISAOVETORES/VETORES.JAVA EM M�TODOS DA DISCIPLINA
	//TODOS OS M�TODOS SER�O P�BLICOS E TER�O ALGUM TIPO DE RETORNO
	
	//REGRA IMPORTANTE: A CLASSE N�O POSSUI SCANNER, SYSTEM.OUT, NENHUM TIPO DE INTERA��O COM O USU�RIO
}
