package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

public class ComandoGuarda extends AbstractComando {
	private IO io;
	
	@Override
	public String getNome() {
		return "Guarda";
	}
	
	/**
	 * esecuzione del comando
	 */
	@Override
	public void esegui(Partita partita) {
		io.mostraMessaggio(partita.getStanzaCorrente().getDescrizione());
		io.mostraMessaggio(partita.getGiocatore().getBorsa().toString());
	}
}
