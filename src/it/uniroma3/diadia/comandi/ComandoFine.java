package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

public class ComandoFine extends AbstractComando {
	public static final String MESSAGGIO_FINE = "Grazie di aver giocato";
	private IO io;
	
	@Override
	public String getNome() {
		return "Fine";
	}

	/**
	 * esecuzione del comando
	 */
	@Override
	public void esegui(Partita partita) {
		io.mostraMessaggio(MESSAGGIO_FINE);  // si desidera smettere
	}
}
