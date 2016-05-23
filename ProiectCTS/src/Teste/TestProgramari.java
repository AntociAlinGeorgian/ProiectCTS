package Teste;

import clase.Pacient;
import clase.Programari;
import junit.framework.TestCase;

public class TestProgramari extends TestCase {
	Programari prog;

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	//1. verificare constructor - parametrul id
	public void testConstructorID(){
		Pacient p=new Pacient(1,"Ioana", "Luca","1925463892101");
		try{
			prog=new Programari(0,p,"15-05-2016","15:00","Matei Popescu");
			fail("Contructor programare corect.");
		}catch(IllegalArgumentException ex){
			System.out.println("Constructor programare incorect.");
		}
	}
	//2. verificare constructor - parametrul pacient
	public void testConstructorPacient(){
		Pacient p=new Pacient(1,"Ioana", "Luca","1925463892101");
		try{
			prog=new Programari(0,p,"15-05-2016","15:00","Matei Popescu");
			fail("Contructor programare corect.");
		}catch(IllegalArgumentException ex){
			System.out.println("Constructor programare incorect.");
		}
	}
	
	//3.  verificare constructor - parametrul data
	public void testConstructorData(){
		Pacient p=new Pacient(1,"Ioana", "Luca","1925463892101");
		try{
			prog=new Programari(0,p,"15-05-2016","15:00","Matei Popescu");
			fail("Contructor programare corect.");
		}catch(IllegalArgumentException ex){
			System.out.println("Constructor programare incorect.");
		}
	}
	
	//4. verificare constructor - parametrul ora
	public void testConstructorOra(){
		Pacient p=new Pacient(1,"Ioana", "Luca","1925463892101");
		try{
			prog=new Programari(0,p,"15-05-2016","15:00","Matei Popescu");
			fail("Contructor programare corect.");
		}catch(IllegalArgumentException ex){
			System.out.println("Constructor programare incorect.");
		}
	}
	
	//5. verificare constructor - parametrul doctor
		public void testConstructorDoctor(){
			Pacient p=new Pacient(1,"Ioana", "Luca","1925463892101");
			try{
				prog=new Programari(0,p,"15-05-2016","15:00","Matei Popescu");
				fail("Contructor programare corect.");
			}catch(IllegalArgumentException ex){
				System.out.println("Constructor programare incorect.");
			}
		}
}
