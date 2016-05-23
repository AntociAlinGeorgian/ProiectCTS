package clase;

public class Doctor {
	private String numeDoctor;
	private String specializare;
	private String program;
	private String tipDoctor;
	private int varsta;
	
	
	public Doctor(String numeDoctor, String specializare, String program) {
		super();
		this.numeDoctor = numeDoctor;
		this.specializare = specializare;
		this.program = program;
	}
	public String getNumeDoctor() {
		return numeDoctor;
	}
	public void setNumeDoctor(String numeDoctor) {
		this.numeDoctor = numeDoctor;
	}
	public String getSpecializare() {
		return specializare;
	}
	public void setSpecializare(String specializare) {
		this.specializare = specializare;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public String getTipDoctor() {
		return tipDoctor;
	}
	public void setTipDoctor() {
		if(varsta >= 25 && varsta <= 35)
			this.tipDoctor = "rezident";
		else if(varsta>35 && varsta<=40)
				this.tipDoctor="specialist";
		else if(varsta>40 && varsta<=65)
				this.tipDoctor="primar";
		else if(varsta>65)
				this.tipDoctor="pensionat";
		else throw new IllegalArgumentException();
		
	}
	//1. verificare program doctor
	public String verificareProgramDoctor(String oraProgramare,Doctor d){
		int ora=Integer.parseInt(oraProgramare.substring(0, 2));
		int minut=Integer.parseInt(oraProgramare.substring(3, 5));
		
		
		int oraInceput=Integer.parseInt(d.getProgram().substring(0, 2));
		int minutInceput=Integer.parseInt(d.getProgram().substring(3, 5));
		int oraSfarsit=Integer.parseInt(d.getProgram().substring(0, 2));
		int minutSfarsit=Integer.parseInt(d.getProgram().substring(3, 5));
		
		if(ora>=oraInceput && ora < oraSfarsit && minut>=minutInceput && minut<minutSfarsit){
			return "Disponibl";
		}
		
		return "Indisponibil";
	}
	
	//2. Verificare lungime nume;
	
	public int verificareLungimeNume(String nume){
		int lungime=nume.length();
		return lungime;
	}
	
	//3. calcul suma a doua nume;
	
	public int sumaLitere(String nume, String nume2){
		int lungime=nume.length();
		int lungime2=nume2.length();
		return lungime+lungime2;
	}
	
	//4. Verificare nume doctor - nume despartit de prenume prin spatiu
	public String verificareNumePrenumeDr(String nume){
		String[] numePrenume=nume.split(" ");
		if(numePrenume.length>=2)
			return "Nume doctor corect.";
		return "Nume doctor incorect.";
	}
	
	
}	
