package Teste;

import org.junit.Test;

import clase.Doctor;
import clase.Programari;
import junit.framework.TestCase;

public class TestDoctor extends TestCase {
	Programari p;
	Doctor d;

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	//1. verificare program doctor
	@Test
	public void testProgramDoctor(){
		d=new Doctor("Cimpoeru Ion","Dermatologe","08:00-17:00");
		assertEquals("Indisponibil",d.verificareProgramDoctor("12:00", d));
	}
	
	//2. verificare lungime nume
	@Test
	public void testLungimeNume(){
		d=new Doctor("Cimpoeru Ion","Dermatologe","08:00-17:00");
		assertEquals(12,d.verificareLungimeNume(d.getNumeDoctor()));
	}
	
	//3. calcul suma litere a doua nume
	@Test
	public void testCalculLungimeNume(){
		d=new Doctor("Cimpoeru Ion","Dermatologe","08:00-17:00");
		assertEquals(10,d.sumaLitere("nume1", "nume2"));
	}
	
	//4. verificare nume prenume doctor
	@Test
	public void testSpatiuNumePrenume(){
		d=new Doctor("CimpoeruIon","Dermatologe","08:00-17:00");
		assertEquals("Nume doctor incorect.",d.verificareNumePrenumeDr(d.getNumeDoctor()));
	}
	//5. verificare setter tip doctor
	public void testSetterTipDoctor(){
		d=new Doctor("Cimpoeru Ion","Dermatologe","08:00-17:00");
		d.setVarsta(15);
		try{
			d.setTipDoctor();
			fail("Persoana este doctor " + d.getTipDoctor() + " .");
		}catch(IllegalArgumentException ex){
			System.out.println("Persoana nu poate fi doctor. Varsta prea mica.");
		}
	}

}
