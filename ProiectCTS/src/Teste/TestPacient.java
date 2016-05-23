package Teste;

import org.junit.Test;

import clase.Pacient;
import junit.framework.TestCase;

public class TestPacient extends TestCase {
	Pacient p;

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	//1. verificare nume pentru a incepe cu uppercase
	@Test
	public void testNumeUpper(){
		p=new Pacient(1,"Brinza","Alin","1920208123312");
		assertEquals(true,p.checkNumeUpper(p.getNume()));
	}
	
	//2. verificare prenume pentru a incepe cu uppercase
	@Test
	public void testPrenumeUpper(){
		p=new Pacient(1,"Brinza","Alin","1920208123312");
		assertEquals(true,p.checkPrenumeUpper(p.getPrenume()));
	}
	
	//3. verificare lungime cnp
	@Test
	public void testLungimeCnp(){
		p=new Pacient(1,"Brinza","Alin","1920208123313");
		assertEquals(true,p.checkCNPLenght(p.getCNP()));
	}
	
	//4. verificare ca numele sa contina doar litere
	@Test
	public void testLettersNume(){
		p=new Pacient(1,"Brinza","Alin","1920208123313");
		assertEquals(true,p.checkNumeLettersOnly(p.getNume()));
	}
	
	//5. verificare ca prenumele sa contina doar litere
	@Test
	public void testLettersPrenume(){
		p=new Pacient(1,"Brinza","Alin","1920208123313");
		assertEquals(true,p.checkPrenumeLettersOnly(p.getPrenume()));
	}
	
	//6. verificare ca cnp sa contina doar cifre
	@Test
	public void testCNPNumbers(){
		p=new Pacient(1,"Brinza","Alin","1920208123313");
		assertEquals(true,p.checkCNPNumbersOnly(p.getCNP()));
	}
	
	//7. verificare ca cnp sa fie al unei persoane de sex feminin
	@Test
	public void testSexCNPFeminin(){
		p=new Pacient(1,"Brinza","Alin","2920208123313");
		assertEquals(true,p.checkSexCNPFeminin(p.getCNP()));
	}
	
	//8. verificare ca cnp sa fie al unei persoane de sex masculin
	@Test
	public void testSexCNPMasculin(){
		p=new Pacient(1,"Brinza","Alin","1920208123313");
		assertEquals(true,p.checkSexCNPMasculin(p.getCNP()));
	}
	
	//9. verificare cnp ca persoana sa aibe cel putin 18 ani
	public void testVarstaCNP(){
		p=new Pacient(1,"Brinza","Alin","1980208123313");
		assertEquals(true,p.checkVarstaCNP(p.getCNP()));
	}
	
	//10. verificare setter nume pacient
	public void testSetNume(){
		p=new Pacient(1,"Brinza","Alin","1980208123313");
		try{
			p.setNume(null);
			fail("Nume nu este null");
		} catch (IllegalArgumentException e){
			System.out.println("Nume este null");
		}
	}
	
	//11. verificare setter prenume pacient
	public void testSetPrenume(){
		p=new Pacient(1,"Brinza","Alin","1980208123313");
		try{
			p.setPrenume(null);
			fail("Prenumele nu este null");
		} catch (IllegalArgumentException e){
			System.out.println("Prenumele este null");
		}
	}
	
	//12. verificare setter cnp pacient
	public void testSetCNP(){
		p=new Pacient(1,"Brinza","Alin","1980208123313");
		try{
			p.setCNP(null);
			fail("CNP nu este null");
		} catch (IllegalArgumentException e){
			System.out.println("CNP este null");
		}
	}
	
	//13. suma cifrelor cnp
	public void testSumaCifrelorCNP(){
		p=new Pacient(1,"Brinza","Alin","123456789");
		assertEquals(45,p.sumaCifrelorCNP(p.getCNP()));
	}
	
	//14. produs cifre cnp
	public void testDiferentaCifreCNP(){
		p=new Pacient(1,"Brinza","Alin","12345444789");
		assertEquals(-51,p.diferentaCifrelorCNP(p.getCNP()));
	}
}
