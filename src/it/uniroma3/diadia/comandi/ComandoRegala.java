package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Direzione;


public class ComandoRegala implements Comando{
	private String attrezzo;
	private IO io;
	
	@Override
	public void esegui(Partita partita) {
		// TODO Auto-generated method stub
		if(partita.getStanzaCorrente().getPersonaggio()==null)
			io.mostraMessaggio("Nessuno personaggio nella stanza");
		else if(attrezzo==null)
			io.mostraMessaggio("Quale attrezzo vuoi regalare?");
		else if (!partita.getGiocatore().getBorsa().hasAttrezzo(attrezzo))
			io.mostraMessaggio("Nessuno oggetto nella borsa con questo nome nella borsa");
		else {
	    	partita.getStanzaCorrente().getPersonaggio().riceviRegalo(partita.getGiocatore().getBorsa().getAttrezzo(attrezzo), partita);
			}
		io.mostraMessaggio(partita.getGiocatore().getBorsa().toString());
	}

	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub
		this.attrezzo = parametro;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return "Regala";
	}

	@Override
	public String getParametro() {
		// TODO Auto-generated method stub
		return this.attrezzo;
	}

	@Override
	public void setParametro(Direzione direzione) {
		// TODO Auto-generated method stub
		
	}

}
