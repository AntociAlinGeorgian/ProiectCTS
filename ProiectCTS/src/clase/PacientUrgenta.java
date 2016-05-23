package clase;

import interfete.IModTratament;

public class PacientUrgenta {
	private String numeComplet;
	private String dataSosire;
	private int oraSosire;
	
	private IModTratament mod;
	
	public PacientUrgenta(){
		this.numeComplet="Cristiana Alexandru";
		this.dataSosire="10-01-2016";
	}
	
	public PacientUrgenta(String numeComplet, String dataSosire) {
		super();
		this.numeComplet = numeComplet;
		this.dataSosire = dataSosire;
	}

	public String getNumeComplet() {
		return numeComplet;
	}
	public void setNumeComplet(String numeComplet) {
		this.numeComplet = numeComplet;
	}
	public String getDataSosire() {
		return dataSosire;
	}
	public void setDataSosire(String dataSosire) {
		this.dataSosire = dataSosire;
	}


	public IModTratament getMod() {
		return mod;
	}


	public void setMod(IModTratament mod) {
		this.mod = mod;
	}
	
	public int getOraSosire() {
		return oraSosire;
	}

	public void setOraSosire(int oraSosire) {
		this.oraSosire = oraSosire;
	}

	public PacientUrgenta(IModTratament mod) {
		super();
		this.mod=mod;
	}
	
	public void tratament(){
		if(mod!=null){
			mod.tratament();
		} else {
			System.out.println("Niciun tratament.");
		}
	}
}
