package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Direzione;

public class ComandoPrendi implements Comando {
	private String attrezzo;
	private IO io;
	
	@Override
	public void setParametro(String parametro) {
		this.attrezzo = parametro;
	}
	
	@Override
	public String getNome() {
		return "Prendi";
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
			io.mostraMessaggio("Quale attrezzo vuoi prendere?");
		else if (!partita.getStanzaCorrente().hasAttrezzo(attrezzo))
			io.mostraMessaggio("Nessuno oggetto nella stanza con quel nome");
		else {
	    		partita.getGiocatore().getBorsa().addAttrezzo(partita.getStanzaCorrente().getAttrezzo(attrezzo));
	    		partita.getStanzaCorrente().removeAttrezzo(partita.getStanzaCorrente().getAttrezzo(attrezzo));
			}
		io.mostraMessaggio(partita.getGiocatore().getBorsa().toString());
	}

	@Override
	public void setParametro(Direzione direzione) {
		// TODO Auto-generated method stub
		
	}
}
