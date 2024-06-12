package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

public class ComandoSaluta extends AbstractComando implements Comando{
	private IO io;
	
	@Override
	public void esegui(Partita partita) {
		// TODO Auto-generated method stub
		io.mostraMessaggio(partita.getStanzaCorrente().getPersonaggio().saluta());
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return "Saluta";
	}

}
