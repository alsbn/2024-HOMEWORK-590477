package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

public class ComandoAiuto implements Comando {
	
	static final private String[] elencoComandi = {"vai", "aiuto", "fine","prendi","posa","guarda"};
	
	@Override
	public void setParametro(String parametro) {
	}
	
	public String getNome() {
		return "Aiuto";
	}
	
	public String getParametro() {
		return null;
	}

	/**
	 * esecuzione del comando
	 */
	@Override
	public void esegui(Partita partita, IO io) {
		for(int i=0; i< ComandoAiuto.elencoComandi.length; i++) 
			io.mostraMessaggio(elencoComandi[i]+" ");
		io.mostraMessaggio("");
	}
}
