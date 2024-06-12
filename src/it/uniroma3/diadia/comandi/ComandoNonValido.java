package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

public class ComandoNonValido extends AbstractComando  {
	private IO io;
	
	@Override
	public String getNome() {
		return "ComandoNonValido";
	}

	/**
	 * esecuzione del comando
	 */
	@Override
	public void esegui(Partita partita) {
		io.mostraMessaggio("Comando non valido");
	}
}
