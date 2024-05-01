package it.uniroma3.diadia.ambienti;

public class StanzaBuia extends Stanza {
	private String attrezzoNecessario;
	
	public StanzaBuia(String nome, String attrezzo) {
		super(nome);
		this.attrezzoNecessario = attrezzo;
	}
	
	@Override
	public String getDescrizione() {
		if(!this.hasAttrezzo(attrezzoNecessario))
			return "qui c'è un buio pesto";
		return super.getDescrizione();
	}
}
