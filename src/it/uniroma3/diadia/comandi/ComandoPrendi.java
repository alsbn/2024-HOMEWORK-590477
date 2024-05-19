package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

public class ComandoPrendi implements Comando {
	private String attrezzo;
	
	@Override
	public void setParametro(String parametro) {
		this.attrezzo = parametro;
	}
	
	public String getNome() {
		return "Prendi";
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
			io.mostraMessaggio("Quale attrezzo vuoi prendere?");
		if (!partita.getStanzaCorrente().hasAttrezzo(attrezzo))
			io.mostraMessaggio("Nessuno oggetto nella stanza con quel nome");
		else {
	    		partita.getGiocatore().getBorsa().addAttrezzo(partita.getStanzaCorrente().getAttrezzo(attrezzo));
	    		partita.getStanzaCorrente().removeAttrezzo(partita.getStanzaCorrente().getAttrezzo(attrezzo));
			}
		io.mostraMessaggio(partita.getGiocatore().getBorsa().toString());
	}
}
