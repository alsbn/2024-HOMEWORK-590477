package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Direzione;

public class ComandoPosa implements Comando {
	private String attrezzo;
	private IO io;

	@Override
	public void setParametro(String parametro) {
		this.attrezzo = parametro;
	}
	
	@Override
	public String getNome() {
		return "Posa";
	}
	
	@Override
	public String getParametro() {
		return this.attrezzo;
	}

	/**
	 * esecuzione del comando
	 */
	@Override
	public void esegui(Partita partita) {
		if(attrezzo==null)
			io.mostraMessaggio("Quale attrezzo vuoi posare?");
		else if (!partita.getGiocatore().getBorsa().hasAttrezzo(attrezzo))
			io.mostraMessaggio("Nessuno oggetto nella borsa con questo nome nella borsa");
		else {
	    	partita.getStanzaCorrente().addAttrezzo(partita.getGiocatore().getBorsa().removeAttrezzo(attrezzo));
			}
		io.mostraMessaggio(partita.getGiocatore().getBorsa().toString());
	}

	@Override
	public void setParametro(Direzione direzione) {
		// TODO Auto-generated method stub
		
	}
}
