package Teste;

import java.util.ArrayList;

import org.junit.Test;

import clase.Clinica;
import clase.Doctor;
import interfete.Sectie;
import junit.framework.TestCase;

public class TestClinica extends TestCase {
	Clinica c;
	Sectie s;

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	
	//1. verificare ca numele clinicii sa aibe prima litera uppercase
	@Test
	public void testVerificareNumeUpper(){
		c=new Clinica("Medicover","str. Victoriei","0744188013");
		assertEquals(true,c.checkNumeClinicaUpper(c.getNumeClinica()));
	}
	
	//2. verificare ca adresa sa nu aibe mai mult de 40 caractere
	@Test
	public void testLungimeAdresa(){
		c=new Clinica("Medicover","str. Victoriei","0744188013");
		assertEquals(true,c.checkLungimeAdresa(c.getAdresa()));
	}
	
	//3. verificare ca numarul de telefon sa fie format doar din cifre
	@Test
	public void testNumarTelefon(){
		c=new Clinica("Medicover","str. Victoriei","0744188013");
		assertEquals(true,c.checkTelefon(c.getNrTelefon()));
	}
	
	//4. verificare numar telefon
	@Test
	public void testPrefix(){
		c=new Clinica("Medicover","str. Victoriei","0744188013");
		assertEquals("Orange",c.checkPrefixTelefon(c.getNrTelefon()));
	}
	
	//5. verificare setter nume clinica
	public void testSetNumeClinica(){
		c=new Clinica("Medicover","str. Victoriei","0744188013");
		try{
			c.setNumeClinica(null);
			fail("Numele clinicii nu este null");
		} catch (IllegalArgumentException e){
			System.out.println("Numele clinicii este null");
		}
	}
	
	//6. verificare setter adresa clinica
	public void testSetAdresaClinica(){
		c=new Clinica("Medicover","str. Victoriei","0744188013");
		try{
			c.setAdresa(null);
			fail("Adresa clinicii nu este null");
		} catch (IllegalArgumentException e){
			System.out.println("Adresa clinicii este null");
		}
	}
	
	//7. verificare setter nr telefon clinica
	public void testSetTelefonClinica(){
		c=new Clinica("Medicover","str. Victoriei","0744188013");
		try{
			c.setNrTelefon(null);
			fail("Nr telefon al clinicii nu este null");
		} catch (IllegalArgumentException e){
			System.out.println("Nr de telefon al clinicii este null");
		}
	}
		
	//8. verificare creare lista nenula
	public void testCreareListaNenula(){
		c=new Clinica("Medicover","str. Victoriei","0744188013");
		ArrayList<String>lista=c.creazaListaString("Alin", "Georgian");
		assertNotNull(lista);
	}
	
	//9. verificare daca clinica este inchisa sau deschisa pe baza orei actuale
	public void testVerificareProgram(){
		c=new Clinica("Medicover","str. Victoriei","0744188013");
		assertEquals(true,c.verificareProgramClinica());
	}
	
	//10. verificare functie de adaugare doctor in lista
	public void testAdaugareDoctorNull(){
		c=new Clinica("Medicover","str. Victoriei","0744188013");
		try{
			c.adaugaDoctor(null);
			fail("Informatii doctor existente.");
		}catch(IllegalArgumentException ex){
			System.out.println("Informatii doctor inexistente.");
		}
		
	}
	//11. verificare functie de varsta medie a doctorilor
	public void testVarstaMedie(){
		c=new Clinica("Medicover","str. Victoriei","0744188013");
		Doctor d0=new Doctor("Popescu Marian","oncologie","08:00-17:00");
		Doctor d1=new Doctor("Lupu Mihai","cardiologie","10:00-17:00");
		Doctor d2=new Doctor("Mihnea Ioan","pediatrie","08:00-14:00");
		d0.setVarsta(35);
		d0.setTipDoctor();
		
		d1.setVarsta(45);
		d1.setTipDoctor();
		
		d2.setVarsta(25);
		d2.setTipDoctor();
		
		c.adaugaDoctor(d0);
		c.adaugaDoctor(d1);
		c.adaugaDoctor(d2);
		
		assertEquals((double)35, c.varstaMedieDoctor(c.getListaDoctori()));
	}
	//12. verificare nr cifre telefon
	public void testNrCifreTel()
	{
		c=new Clinica("Medicover","str. Victoriei","0744188013");
		assertEquals(10, c.nrCifreTelefon(c.getNrTelefon()));
	}
}
