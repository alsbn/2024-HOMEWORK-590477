package it.uniroma3.diadia;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.ambienti.Labirinto;

public class LabirintoTest {
	
	private Labirinto labirintoFine;
	
	@Before
	public void setUp() {
		this.labirintoFine = new Labirinto();
		this.labirintoFine.setStanzaCorrente(this.labirintoFine.getStanzaVincente());
	}
	
	@Test
	public void testFine() {
		assertEquals(this.labirintoFine.getStanzaVincente(), this.labirintoFine.getStanzaCorrente());
	}

}
