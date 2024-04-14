package it.uniroma3.diadia;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/** 
 * 
 */
public class PartitaTest {
	private Partita partitaInGioco;
	private Partita partitaFinita;
	private Partita partitaNocfu;
	private Partita partitaVinta;
	
	@Before
	public void setUp() {
		this.partitaInGioco = new Partita();
		this.partitaFinita = new Partita();
		this.partitaFinita.setFinita();
		this.partitaNocfu = new Partita();
		this.partitaNocfu.setCfu(0);
		this.partitaVinta = new Partita();
		this.partitaVinta.setStanzaCorrente(this.partitaVinta.getStanzaVincente());
	}
	
	@Test
	public void testPartitaInGioco() {
		assertEquals(false, this.partitaInGioco.isFinita());
	}
	
	@Test
	public void testPartitaFinita() {
		assertEquals(true, this.partitaFinita.isFinita());
	}
	
	@Test
	public void testPartitaNocfu() {
		assertEquals(true, this.partitaNocfu.isFinita());
	}
	
	@Test
	public void testPartitaVinta() {
		assertEquals(true, this.partitaVinta.isFinita());
	}
}
