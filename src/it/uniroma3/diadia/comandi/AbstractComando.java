package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Direzione;

public abstract class AbstractComando implements Comando{
	
	@Override
	public void setParametro(Direzione parametro) {
	}
	
	@Override
	public void setParametro(String attrezzo) {
	}
	
	@Override
	public Direzione getParametro() {
		return null;
	}
	
	@Override
	public abstract String getNome();
	
	@Override
	public abstract void esegui(Partita partita);
	
}
