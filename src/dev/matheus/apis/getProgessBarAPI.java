package dev.matheus.apis;

public class getProgessBarAPI {

	public static String ProgressBar(int tamanho, double valor1, double valor2, String caractere, String concluindocor, String faltandocor) {

		int amount = tamanho;
		double perChar = valor1 / amount;
		int perTotal = (int) (valor2 / perChar);

		StringBuilder progressBar = new StringBuilder();

		for (int i = 0; i < perTotal; i++)
			progressBar.append(concluindocor + caractere);

		if (perTotal < amount)
			for (int i = perTotal; i < amount; i++)
				progressBar.append(faltandocor + caractere);
		return progressBar.toString();
	}
	
	/*
	 * 
	 * ProgressBar(20, p.getMaxHealth(), p.getHealth(), "|", "§a", "§c");
	 * http://prntscr.com/jpqeyp
	 */

}
