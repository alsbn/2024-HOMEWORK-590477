package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;

import it.uniroma3.diadia.Partita;

public class ComandoAiuto extends AbstractComando {
	static final String[] elencoComandi = {"vai", "aiuto", "fine","prendi","posa","guarda", "Regala", "Saluta", "Interagisci"};
	private IO io;
	
	@Override
	public String getNome() {
		return "Aiuto";
	}

	/**
	 * esecuzione del comando
	 */
	@Override
	public void esegui(Partita partita) {
		for(int i=0; i< ComandoAiuto.elencoComandi.length; i++) 
			io.mostraMessaggio(elencoComandi[i]+" ");
		io.mostraMessaggio("");
	}

}
