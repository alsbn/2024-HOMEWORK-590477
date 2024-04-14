package it.uniroma3.diadia;

import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Giocatore;

/**
 * Questa classe modella una partita del gioco
 *
 * @author  docente di POO
 * @see Stanza
 * @version base
 */

public class Partita {

	private Labirinto labirinto;
	private Giocatore giocatore;
	private boolean finita;
	
	public Partita(){
		this.labirinto = new Labirinto();
		this.giocatore = new Giocatore();
		this.finita = false;
	}

	public Stanza getStanzaVincente() {
		return this.labirinto.getStanzaVincente();
	}

	public void setStanzaCorrente(Stanza stanzaCorrente) {
		this.labirinto.setStanzaCorrente(stanzaCorrente);;
	}

	public Stanza getStanzaCorrente() {
		return this.labirinto.getStanzaCorrente();
	}

	/**
	 * Restituisce vero se e solo se la partita e' stata vinta
	 * @return vero se partita vinta
	 */
	public boolean vinta() {
		return this.getStanzaCorrente()== this.getStanzaVincente();
	}

	/**
	 * Restituisce vero se e solo se la partita e' finita
	 * @return vero se partita finita
	 */
	public boolean isFinita() {
		return finita || vinta() || (this.giocatore.getCfu() == 0);
	}

	/**
	 * Imposta la partita come finita
	 *
	 */
	public void setFinita() {
		this.finita = true;
	}

	public int getCfu() {
		return this.giocatore.getCfu();
	}

	public void setCfu(int cfu) {
		this.giocatore.setCfu(cfu);		
	}	
	
	public boolean addAttrezzoBorsa(Attrezzo attrezzo) {
		return this.giocatore.addAttrezzo(attrezzo);
	}
		
	public Attrezzo removeAttrezzoBorsa(String nomeAttrezzo) {
		return this.giocatore.removeAttrezzo(nomeAttrezzo);
	}
		
	public String toStringBorsa() {
		return this.giocatore.toString();
	}
	
	public boolean hasBorsaAttrezzo(String nomeAttrezzo) {
		return this.giocatore.hasAttrezzo(nomeAttrezzo);
	}
	
	public Attrezzo getAttrezzoBorsa(String nomeAttrezzo) {
		return this.giocatore.getAttrezzo(nomeAttrezzo);
	}
}
