package main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import clase.Cardiologie;
import clase.Clinica;
import clase.Doctor;
import clase.SectiiFactory;
import interfete.IModTratament;
import interfete.Sectie;
import clase.EnumSectii;
import clase.Injectabil;
import clase.Internari;
import clase.Pacient;
import clase.PacientUrgenta;
import clase.PacientiFlyweight;
import clase.Pastile;
import clase.SectieAdapter;

public class main {

	private static final String sectii[]={"Dermatologie","Neurologie","Cardiologie"};
	private static final String nume[]={"Alin","Florin","Andrei","Florentina","Teodora"};
	private static final String prenume[]={"Corina","Cornel","Ionut","Gabriela"};
	private static final String cnp[]={"1920202123123123","2920202122123123","2920202123222131","1920202123123121"};
	private static Random id;
	
	public static String randomSectii(){
		int idx= new Random().nextInt(sectii.length);
		return sectii[idx];
	}
	
	public static String randomNume(){
		int idx= new Random().nextInt(nume.length);
		return nume[idx];
	}
	
	public static String randomPrenume(){
		int idx= new Random().nextInt(prenume.length);
		return prenume[idx];
	}
	
	public static String randomCNP(){
		int idx= new Random().nextInt(cnp.length);
		return cnp[idx];
	}
	
	public static int randomId(){
		Random random=new Random();
		int randomInt = 0;
		for(int id=0;id<=999;id++){
			randomInt=random.nextInt(100);
		}
		return randomInt;
	}
	
	

	public static void main(String[] args) {
		//Singleton
		System.out.println("====== Singleton ======");
		Clinica c1=Clinica.getInstance("Medicover","str. Victoriei","021 330 123");
		System.out.println(c1.toString());
		Clinica c2=Clinica.getInstance("Anima","str. Viitorului","022 201 322");
		System.out.println(c2.toString());
		
		
		//Factory
		System.out.println("\n ====== Factory ======");
		SectiiFactory factory=new SectiiFactory();
		Sectie s1=factory.createSectie(EnumSectii.Cardiologie);
		System.out.println(s1.detaliiSectie());
		
		Sectie s2=factory.createSectie(EnumSectii.Neurologie);
		System.out.println(s2.detaliiSectie());
		

		//Adapter
		System.out.println("\n====== Adapter ======");
		s1.internarePacienti(44);
		s1.mutarePacienti(22, s2);
		
		SectieAdapter sectieAdapter=new SectieAdapter(s1.getIdSectie());
		sectieAdapter.internarePacienti(55);
		
		//Prototype
		System.out.println("\n====== Prototype ======");
		Sectie s3=s1.clone();
		System.out.println(s3.detaliiSectie());
		
		//Facade
		System.out.println("\n====== Facade ======");
		Internari internari=new Internari();
		internari.internareCardio(22);
		internari.internareDermato(11);
		
		//Flyweight
		System.out.println("\n====== Flyweight ======");
		for(int i=0;i<5;i++){
			Pacient p1=(Pacient) PacientiFlyweight.getPacient(randomSectii());
			p1.setIdPacient(randomId());
			p1.setNume(randomNume());
			p1.setCNP(randomCNP());
			p1.setPrenume(randomPrenume());
			p1.interneaza();
		}
		
		//Observer
		System.out.println("\n====== Observer ======");
		Pacient p=new Pacient();
		Pacient p1=new Pacient(1,"Alina","Tamasescu","12312312");
		Cardiologie card=new Cardiologie();
		card.adaugaObserver(p);
		card.adaugaObserver(p1);
		
		card.pacientInternat(p, card);
		card.pacientExternat(p1, card);
		
		
		//Strategy
		System.out.println("\n====== Strategy ======");
		IModTratament mod=new Injectabil();
		PacientUrgenta pu1=new PacientUrgenta(mod);
		pu1.tratament();
		
		
		IModTratament mod1=new Pastile();
		PacientUrgenta pu2=new PacientUrgenta(mod1);
		pu2.tratament();
		
		// 
		
		ArrayList<Sectie> listaSectii= new ArrayList<Sectie>();	
		listaSectii.add(s1);
		listaSectii.add(s2);
		
		for(int i=0;i<listaSectii.size();i++){
			System.out.println(listaSectii.get(i).getDenumireSectie());
		}

	}
	
}
