package it.uniroma3.diadia;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import it.uniroma3.diadia.giocatore.Giocatore;

public class GiocatoreTest {
	
	static final private int CFU_INIZIALI = 20;
	
	private Giocatore giocatore0;
	private Giocatore giocatoreIniziale;
	private Giocatore giocatore100;
	
	@Before
	public void setUp() {
		this.giocatore0 = new Giocatore();
		this.giocatore0.setCfu(0);
		this.giocatoreIniziale = new Giocatore();
		this.giocatore100 = new Giocatore();
		this.giocatore100.setCfu(100);
	}
	
	@Test
	public void test0cfu() {
		assertEquals(0, this.giocatore0.getCfu());
	}
	
	@Test
	public void testCfuIniziali() {
		assertEquals(CFU_INIZIALI, this.giocatoreIniziale.getCfu());
	}
	
	@Test
	public void test100cfu() {
		assertEquals(100, this.giocatore100.getCfu());
	}
	
}
