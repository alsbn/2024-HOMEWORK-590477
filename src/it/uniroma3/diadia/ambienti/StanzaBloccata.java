package it.uniroma3.diadia.ambienti;

public class StanzaBloccata extends Stanza {
	private Direzione direzioneBloccata;
	private String attrezzoNecessario;
	
	public StanzaBloccata(String nome, String attrezzo, Direzione direzione) {
		super(nome);
		this.attrezzoNecessario = attrezzo;
		this.direzioneBloccata = direzione;
	}
	
	@Override
	public Stanza getStanzaAdiacente(Direzione dir) {
		if(!this.hasAttrezzo(attrezzoNecessario) && this.direzioneBloccata==dir)
			return this;
		return super.getStanzaAdiacente(dir);
	}
	
	@Override
	public String getDescrizione() {
		if(!this.hasAttrezzo(attrezzoNecessario))
			return super.getDescrizione()+"\nDirezione bloccata:  "+this.direzioneBloccata+"\n"+"Necessiti:  "+this.attrezzoNecessario;
		return super.getDescrizione();
	}
}
