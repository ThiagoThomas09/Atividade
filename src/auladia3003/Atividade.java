package auladia3003;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Date;

public class Atividade {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("pt", "BR"));
		
		Calendar hoje = Calendar.getInstance();
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int min = hoje.get(Calendar.MINUTE);
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
		Date data = new Date();
		System.out.println("A data é: " + df4.format(data) +
				", o horário é: " + hora + "h " + min + "min");
	}

}
