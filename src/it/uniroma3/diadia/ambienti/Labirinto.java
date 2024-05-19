package it.uniroma3.diadia.ambienti;

public class Labirinto {
	
	private Stanza stanzaCorrente;
	private Stanza stanzaVincente;
	private static LabirintoBuilder laBuild;
	
    public static LabirintoBuilder newBuilder() {
    	laBuild = new LabirintoBuilder();
		return laBuild;
	}
    
	public Stanza getStanzaVincente() {
		return this.stanzaVincente;
	}

	public void setStanzaCorrente(Stanza stanzaCorrente) {
		this.stanzaCorrente = stanzaCorrente;
	}

	public Stanza getStanzaCorrente() {
		return this.stanzaCorrente;
	}
	
	public void setStanzaVincente(Stanza stanzaVincente) {
		this.stanzaVincente = stanzaVincente;
	}

	public Stanza getStanzaIniziale() {
		return laBuild.getStanzaIniziale();
	}
}
