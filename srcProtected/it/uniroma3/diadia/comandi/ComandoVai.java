package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;

public class ComandoVai implements Comando {
	private String direzione;

	@Override
	public void setParametro(String parametro) {
		this.direzione = parametro;
	}
	
	public String getNome() {
		return "Vai";
	}
	
	public String getParametro() {
		return this.direzione;
	}

	/**
	 * esecuzione del comando
	 */
	@Override
	public void esegui(Partita partita, IO io) {
		// qui il codice per cambiare stanza ...
		Stanza stanzaCorrente = partita.getStanzaCorrente();
		Stanza prossimaStanza = null;
		
		if(direzione==null) {
			io.mostraMessaggio("Dove vuoi andare?");
			return;
		}
		
		prossimaStanza = stanzaCorrente.getStanzaAdiacente(this.direzione);
		if(prossimaStanza == null) {
			io.mostraMessaggio("Direzione inesistente");
			return;
		}
		
		partita.setStanzaCorrente(prossimaStanza);
		io.mostraMessaggio(partita.getStanzaCorrente().getNome());
		partita.getGiocatore().setCfu(partita.getGiocatore().getCfu()-1);
	}
}
