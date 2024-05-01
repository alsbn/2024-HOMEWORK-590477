package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

public class ComandoGuarda implements Comando {

	@Override
	public void setParametro(String parametro) {
	}
	
	public String getNome() {
		return "Guarda";
	}
	
	public String getParametro() {
		return null;
	}

	/**
	 * esecuzione del comando
	 */
	@Override
	public void esegui(Partita partita, IO io) {
		io.mostraMessaggio(partita.getStanzaCorrente().getDescrizione());
		io.mostraMessaggio(partita.getGiocatore().getBorsa().toString());
	}
}
