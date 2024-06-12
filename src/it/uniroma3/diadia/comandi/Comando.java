package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Direzione;

public interface Comando {
	
	/**
	* esecuzione del comando
	*/
	public void esegui(Partita partita);
	
	/**
	* set parametro del comando
	*/
	public void setParametro(String parametro);
	
	public void setParametro(Direzione direzione);
	
	public String getNome();
	
	public Object getParametro();
	
}
