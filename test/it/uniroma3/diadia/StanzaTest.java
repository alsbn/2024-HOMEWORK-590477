package it.uniroma3.diadia;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaTest {
	
	private Stanza stanzaVuotaNoAdiacente;
	private Stanza stanzaUnAttrezzo;;
	private Stanza stanzaUnAdiacente1;
	private Stanza stanzaUnAdiacente2;
	private Attrezzo attrezzo;
	private String[] direzione1;
	private String[] direzione2;
	private Attrezzo[] noAttrezzi;
	private Attrezzo[] unAttrezzo;
	static final private int NUMERO_MASSIMO_ATTREZZI = 10;
	
	@Before
	public void setUp() {
		this.stanzaVuotaNoAdiacente = new Stanza("stanzaVuotaNoAdiacente");
		this.stanzaUnAttrezzo = new Stanza("stanzaUnAttrezzo");
		this.attrezzo = new Attrezzo("attrezzo",1);
		this.stanzaUnAttrezzo.addAttrezzo(this.attrezzo);
		this.stanzaUnAdiacente1 = new Stanza("stanzaUnAdiacente1");
		this.stanzaUnAdiacente2 = new Stanza("stanzaUnAdiacente2");
		this.stanzaUnAdiacente1.impostaStanzaAdiacente("est", this.stanzaUnAdiacente2);
		this.stanzaUnAdiacente2.impostaStanzaAdiacente("ovest", this.stanzaUnAdiacente1);
		this.direzione1 = new String[1];
		this.direzione1[0] = "est";
		this.direzione2 = new String[1];
		this.direzione2[0] = "ovest";
		this.noAttrezzi = new Attrezzo[NUMERO_MASSIMO_ATTREZZI];
		this.unAttrezzo = new Attrezzo[NUMERO_MASSIMO_ATTREZZI];
		this.unAttrezzo[0] = this.attrezzo;
	}
	
	@Test
	public void testNoAdiacente() {
		assertEquals(0, this.stanzaVuotaNoAdiacente.getDirezioni().length);
	}
	
	@Test
	public void testUnAdiacente1() {
		assertEquals(this.direzione1, this.stanzaUnAdiacente1.getDirezioni());
	}
	
	@Test
	public void testUnAdiacente2() {
		assertEquals(this.direzione2, this.stanzaUnAdiacente2.getDirezioni());
	}
	
	@Test
	public void testGetVuoti() {
		assertEquals(this.noAttrezzi, this.stanzaVuotaNoAdiacente.getAttrezzi());
	}
	
	@Test
	public void testGetUnAttrezzi() {
		assertEquals(this.unAttrezzo, this.stanzaUnAttrezzo.getAttrezzi());
	}
	
	@Test
	public void testHasVuota() {
		assertEquals(false, this.stanzaVuotaNoAdiacente.hasAttrezzo("attrezzo"));
	}
	
	@Test
	public void testHasUnAttrezzoGiusto() {
		assertEquals(true, this.stanzaUnAttrezzo.hasAttrezzo("attrezzo"));
	}
	
	@Test
	public void testHasUnAttrezzoSbagliato() {
		assertEquals(false, this.stanzaUnAttrezzo.hasAttrezzo("spada"));
	}
	
	@Test
	public void testGetVuota() {
		assertEquals(null, this.stanzaVuotaNoAdiacente.getAttrezzo("attrezzo"));
	}
	
	@Test
	public void testGetUnAttrezzoGiusto() {
		assertEquals(this.attrezzo, this.stanzaUnAttrezzo.getAttrezzo("attrezzo"));
	}
	
	@Test
	public void testGetAttrezzoSbagliato() {
		assertEquals(null, this.stanzaUnAttrezzo.getAttrezzo("Spada"));
	}
	
}
