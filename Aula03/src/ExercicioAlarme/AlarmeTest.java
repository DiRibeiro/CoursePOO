package ExercicioAlarme;

public class AlarmeTest {

//A IDEIA � QUE EU CONFIGURE UM ALARME PARA CERTO HORARIO
//E O PROGRAMA CALCULE, UTILIZANDO A CLASSE ALARME, QUANTAS HORAS / MINUTOS / SEGUNDOS
//IR�O SE PASSAR

//A CLASSE ALARME N�O FAR� TUDO SOZINHA, ELA UTILIZAR� A CLASSE HORARIO PARA
//CONFIGURAR AS INFORMA��ES DE HORA, MINUTO E SEGUNDO.
	
/*
Horario: hora, minuto, segundo
Alarme: horarioInicial, horarioFinal, quantoTempoDormirei
 */
	
	public static void main(String[] args) {
				
		Horario horaInicial = new Horario(0, 31);
		Horario horaFinal = new Horario(7, 30);
		
		Alarme alarme = new Alarme();
		alarme.setHoraInicial(horaInicial);
		alarme.setHoraFinal(horaFinal);
		
		System.out.println(alarme.quantoTempoFalta());
		//1h e 20min
		
	}
	
	
}
