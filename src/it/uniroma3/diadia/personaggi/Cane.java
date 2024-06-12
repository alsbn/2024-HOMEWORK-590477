package it.uniroma3.diadia.personaggi;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class Cane extends AbstractPersonaggio{
	private static final String MESSAGGIO_DONO = "Grrr, sei stato morso e hai perso 1 cfu";
	private Attrezzo ciboPreferito = new Attrezzo("osso", 2);
	
	public Cane(String nome, String presentazione) {
		super(nome, presentazione);
	}
	
	@Override
	public String agisci(Partita partita) {
		String msg = MESSAGGIO_DONO;
		partita.getGiocatore().setCfu(partita.getGiocatore().getCfu()-1);
		return msg;
	}

	@Override
	public String riceviRegalo(Attrezzo attrezzo, Partita partita) {
		StringBuilder risposta = new StringBuilder("Bau grazie per avermi regalato ");

		if(attrezzo.equals(this.ciboPreferito)) {
			risposta.append("il mio cibo preferito.");
			partita.getStanzaCorrente().addAttrezzo(new Attrezzo("collare", 2));
		} else {
		risposta.append(attrezzo.getNome()+",ma non e' il mio cibo preferit, bau!");
		partita.getGiocatore().setCfu(partita.getGiocatore().getCfu()-1);
		}
		
		return risposta.toString();
	}


}
