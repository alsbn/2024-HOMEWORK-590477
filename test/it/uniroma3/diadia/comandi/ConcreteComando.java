package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;

public class ConcreteComando extends AbstractComando{

	public final static String MESSAGGIO= "Grazie di aver giocato!";
	private final static String NOME = "ConcreteComando";
	private IOConsole io;
	
	@Override
	public void esegui(Partita partita) {
		partita.setFinita();
	}

	@Override
	public String getNome() {
		return NOME;
	}

	public void setIo(IOConsole ioConsole) {
		// TODO Auto-generated method stub
		this.io = ioConsole;
	}

	public Object getIo() {
		// TODO Auto-generated method stub
		return this.io;
	}

}
