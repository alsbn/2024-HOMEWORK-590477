package it.uniroma3.diadia;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;

public class BorsaTest {
		
	public final static int DEFAULT_PESO_MAX_BORSA = 10;
	private Borsa borsaVuota;
	private Borsa borsaSpazio3;
	private Borsa borsaNoPeso;
	private Borsa borsa2attrezzi;
	private Attrezzo attrezzo7Kg;
	private Attrezzo attrezzo4Kg;
	private Attrezzo attrezzo2Kg;
	
	@Before
	public void setUp() {
		this.attrezzo7Kg = new Attrezzo("scudo", 7);
		this.attrezzo4Kg = new Attrezzo("spada", 4);
		this.attrezzo2Kg = new Attrezzo("arco", 2);
		this.borsaVuota = new Borsa();
		this.borsaSpazio3 = new Borsa();
		this.borsaSpazio3.addAttrezzo(this.attrezzo7Kg);
		this.borsaNoPeso = new Borsa(0);
		this.borsa2attrezzi = new Borsa();
		this.borsa2attrezzi.addAttrezzo(this.attrezzo2Kg);
		this.borsa2attrezzi.addAttrezzo(this.attrezzo4Kg);
	}
		
	@Test
	public void testGetPesoMaxVuota() {
		assertEquals(DEFAULT_PESO_MAX_BORSA, this.borsaVuota.getPesoMax());
	}
	
	@Test
	public void testGetPesoMaxSpazio3() {
		assertEquals(DEFAULT_PESO_MAX_BORSA, this.borsaSpazio3.getPesoMax());
	}
	
	@Test
	public void testGetPesoMaxZero() {
		assertEquals(0, this.borsaNoPeso.getPesoMax());
	}
	
	@Test
	public void testIsEmpty() {
		assertEquals(true, this.borsaVuota.isEmpty());
	}
	
	@Test
	public void testIsEmptySpazio3() {
		assertEquals(false, this.borsaSpazio3.isEmpty());
	}
	
	@Test
	public void testIsEmptyAttrezzi2() {
		assertEquals(false, this.borsa2attrezzi.isEmpty());
	}
	
	@Test
	public void testGetPesoVuota() {
		assertEquals(0, this.borsaVuota.getPeso());
	}
	
	@Test
	public void testGetPesoSpazio3() {
		assertEquals(7, this.borsaSpazio3.getPeso());
	}
	
	@Test
	public void testGetPesoAttrezzi2() {
		assertEquals(6, this.borsa2attrezzi.getPeso());
	}
	
	@Test
	public void testHasAttrezzoVuota() {
		assertEquals(false, this.borsaVuota.hasAttrezzo("scudo"));
	}
	
	@Test
	public void testHasAttrezzoUnAttrezzoSbagliato() {
		assertEquals(false, this.borsaSpazio3.hasAttrezzo("arco"));
	}
	
	@Test
	public void testHasAttrezzoUnAttrezzoGiusto() {
		assertEquals(true, this.borsaSpazio3.hasAttrezzo("scudo"));
	}
	
	@Test
	public void testHasAttrezzoDueAttrezziSbagliato() {
		assertEquals(false, this.borsa2attrezzi.hasAttrezzo("scudo"));
	}
	
	@Test
	public void testHasAttrezzoDueAttrezziGiusto1() {
		assertEquals(true, this.borsa2attrezzi.hasAttrezzo("spada"));
	}
	
	@Test
	public void testHasAttrezzoDueAttrezziGiusto2() {
		assertEquals(true, this.borsa2attrezzi.hasAttrezzo("arco"));
	}
	
	@Test
	public void testGetAttrezzoVuota() {
		assertEquals(null, this.borsaVuota.getAttrezzo("scudo"));
	}
	
	@Test
	public void testGetAttrezzoSpazio3Sbagliato() {
		assertEquals(null, this.borsaSpazio3.getAttrezzo("spada"));
	}
	
	@Test
	public void testGetAttrezzoSpazio3Giusto() {
		assertEquals(this.attrezzo7Kg, this.borsaSpazio3.getAttrezzo("scudo"));
	}
	
	@Test
	public void testGetAttrezzoDueSbagliato() {
		assertEquals(null, this.borsa2attrezzi.getAttrezzo("scudo"));
	}
	
	@Test
	public void testGetAttrezzoDueGiusto1() {
		assertEquals(this.attrezzo2Kg, this.borsa2attrezzi.getAttrezzo("arco"));
	}
	
	@Test
	public void testGetAttrezzoDueGiusto2() {
		assertEquals(this.attrezzo4Kg, this.borsa2attrezzi.getAttrezzo("spada"));
	}
	
	@Test
	public void testAddAttrezzoVuota() {
		assertEquals(true, this.borsaVuota.addAttrezzo(this.attrezzo2Kg));
	}
	
	@Test
	public void testAddAttrezzoSpazio3Entra() {
		assertEquals(true, this.borsaSpazio3.addAttrezzo(this.attrezzo2Kg));
	}
	
	@Test
	public void testAddAttrezzoSpazio3NoEntra() {
		assertEquals(false, this.borsaSpazio3.addAttrezzo(this.attrezzo4Kg));
	}
	
	@Test
	public void testAddAttrezzo2attrezziEntra() {
		assertEquals(true, this.borsa2attrezzi.addAttrezzo(this.attrezzo2Kg));
	}
	
	@Test
	public void testAddAttrezzo2attrezziNoEntra() {
		assertEquals(false, this.borsa2attrezzi.addAttrezzo(this.attrezzo7Kg));
	}
	
	/*
	 * @Test
	public void test() {
		this.borsa2attrezzi.addAttrezzo(this.attrezzo2Kg);
		System.out.print(this.borsa2attrezzi.toString());
	}
	*/
}
