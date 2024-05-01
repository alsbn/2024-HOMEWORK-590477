package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

public class ComandoPosa implements Comando {
	private String attrezzo;

	@Override
	public void setParametro(String parametro) {
		this.attrezzo = parametro;
	}
	
	public String getNome() {
		return "Posa";
	}
	
	public String getParametro() {
		return this.attrezzo;
	}

	/**
	 * esecuzione del comando
	 */
	@Override
	public void esegui(Partita partita, IO io) {
		if(attrezzo==null)
			io.mostraMessaggio("Quale attrezzo vuoi posare?");
		if (!partita.getGiocatore().getBorsa().hasAttrezzo(attrezzo))
			io.mostraMessaggio("Nessuno oggetto nella borsa con questo nome nella borsa");
		else {
	    		partita.getStanzaCorrente().addAttrezzo(partita.getGiocatore().getBorsa().removeAttrezzo(attrezzo));
			}
		io.mostraMessaggio(partita.getGiocatore().getBorsa().toString());
	}
}
