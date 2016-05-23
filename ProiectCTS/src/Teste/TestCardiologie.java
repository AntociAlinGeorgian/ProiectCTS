package Teste;

import clase.Cardiologie;
import clase.PacientUrgenta;
import junit.framework.TestCase;

public class TestCardiologie extends TestCase {
	
	Cardiologie c;

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	//1. verificare lista pacienti la urgenta nula
	public void testUrgentaNull(){
		c=new Cardiologie();
		try{
			c.setListaUrgenta(null);
			fail("Nu se genereaza exceptie. Lista nenula.");
		}catch (IllegalArgumentException ex){
			System.out.println("LIsta pacienti nula.");
		}
	}
	//2. verificare adaugare pacient urgenta
	public void testAdaugaPacientUrgentaNull(){
		c=new Cardiologie();
		try{
			c.adaugaPacientUrgenta(null);
			fail("Pacient la urgenta valid");
		}catch(IllegalArgumentException ex){
			System.out.println("Pacient la urgenta null");
		}
	}
	//3. verificare functie numar pacienti in interval
	public void testNrpacientiInterval(){
		c=new Cardiologie();
		PacientUrgenta p0=new PacientUrgenta("Popescu Ioan","22-01-2016");
		p0.setOraSosire(14);
		
		PacientUrgenta p1=new PacientUrgenta("Popescu Ioan","22-01-2016");
		p1.setOraSosire(16);
		
		PacientUrgenta p2=new PacientUrgenta("Popescu Ioan","22-01-2016");
		p2.setOraSosire(21);
		
		c.adaugaPacientUrgenta(p0);
		c.adaugaPacientUrgenta(p1);
		c.adaugaPacientUrgenta(p2);
		
		assertEquals(2, c.nrPacientInterval(c.getListaUrgenta()));
	}
	//4. verificare functie centralizare pacienti
	public void testCentralizareUrgenta()
	{
		c=new Cardiologie();
		PacientUrgenta p0=new PacientUrgenta("Popescu Ioan","22-01-2016");
		p0.setOraSosire(14);
		
		PacientUrgenta p1=new PacientUrgenta("Popescu Ioan","22-01-2016");
		p1.setOraSosire(16);
		
		PacientUrgenta p2=new PacientUrgenta("Popescu Ioan","22-01-2016");
		p2.setOraSosire(21);
		
		c.adaugaPacientUrgenta(p0);
		c.adaugaPacientUrgenta(p1);
		c.adaugaPacientUrgenta(p2);
		
		assertEquals("Pacient inexistent", c.centralizarePacientiUrgenta(c.getListaUrgenta(), 5));
	}
	
}
