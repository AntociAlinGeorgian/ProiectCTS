package clase;

import java.text.SimpleDateFormat;
import interfete.IObserver;
import interfete.IPacient;

public class Pacient implements IPacient , IObserver{
	private int idPacient;
	private String nume;
	private String prenume;
	private String CNP;
	private String dataInternare;
	
	String data = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new java.util.Date());
	
	public Pacient(int idPacient, String nume, String prenume, String cNP) {
		super();
		this.idPacient = idPacient;
		this.nume = nume;
		this.prenume = prenume;
		this.CNP = cNP;
	}
	
	public Pacient(){
		this.idPacient=0;
		this.nume="Andrei";
		this.prenume="Florescu";
		this.CNP="1920201343023112";
		this.dataInternare=data;
	}
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		if(nume!=null)
			this.nume = nume;
		else
			throw new IllegalArgumentException();
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		if(prenume!=null)
			this.prenume = prenume;
		else
			throw new IllegalArgumentException();
	}
	public String getCNP() {
		return CNP;
	}
	public void setCNP(String cNP) {
		if(cNP!=null)
			this.CNP = cNP;
		else
			throw new IllegalArgumentException();
	}
	public String getDataInternare() {
		return dataInternare;
	}
	public void setDataInternare(String dataInternare) {
		this.dataInternare = dataInternare;
	}
	
	@Override
	public String toString() {
		return "Pacient [nume=" + nume + ", prenume=" + prenume + ", CNP=" + CNP + ", dataInternare=" + dataInternare
				+ "]";
	}
	
	public int getIdPacient() {
		return idPacient;
	}
	public void setIdPacient(int idPacient) {
		this.idPacient = idPacient;
	}
	
	@Override
	public void interneaza() {
		
		System.out.println("Pacientul : " + this.nume + " " + this.prenume + "[id: "+idPacient+ "] a fost internat in data de " + data );
	}
	
	//Observer
	@Override
	public void update(String mesaj) {
		System.out.println(mesaj);
		
	}
	
	//Teste
	//1. Verificare prima litera din nume -> uppercase
	
	public boolean checkNumeUpper(String nume){
		if(Character.isUpperCase(nume.charAt(0))){
			return true;
		}
		return false;
	}
	
	//2. verificare prma litera din prenume -> uppercase
	
	public boolean checkPrenumeUpper(String prenume){
		if(Character.isUpperCase(prenume.charAt(0))){
			return true;
		}
		return false;
	}
	
	//3. verificare lungime cnp = 13 cifre
	
	public boolean checkCNPLenght(String cnp){
		if(cnp.length()==13){
			return true;
		}
		return false;
	}
	
	//4. verificare ca numele sa contina doar litere
	
	public boolean checkNumeLettersOnly(String nume){
		char[] litere=nume.toCharArray();
		for(int i=0;i<litere.length;i++){
			if(!Character.isLetter(litere[i])){
				return false;
			}
		}
		return true;
	}
	
	//5. verificare ca prenumele sa contina doar litere
	
	public boolean checkPrenumeLettersOnly(String prenume){
		boolean ok=true;
		char[] litere=prenume.toCharArray();
		for(int i=0;i<litere.length;i++){
			if(!Character.isLetter(litere[i])){
				ok=false;
				break;
			}
		}
		return ok;
	}
	
	//6. verificare cnp sa contina doar cifre
	
	public boolean checkCNPNumbersOnly(String cnp){
		try{
			double d= Double.parseDouble(cnp);
		} catch(NumberFormatException nfe){
			return false;
		}
		return true;
	}
	
	//7. verificare cnp sa fie al persoanei de sex feminin
	
	public boolean checkSexCNPFeminin(String cnp){
		if(cnp.charAt(0)=='2'){
			return true;
		} else {
			return false;
		}
	}
	
	//8. verificare cnp sa fie al persoanei se sex masculin
	public boolean checkSexCNPMasculin(String cnp){
		if(cnp.charAt(0)=='1'){
			return true;
		} else {
			return false;
		}
	}
	
	//9. verificare cnp ca persoana sa aibe cel putin 18 ani
	
	public boolean checkVarstaCNP(String cnp){
		int a=cnp.charAt(1)-'0';
		int b=cnp.charAt(2)-'0';
		int anNastere=a*10+b;
		if(anNastere<=98){
			return true;
		}
		else
			return false;
	}
	
	//10. suma cifrelor din cnp
	
	public int sumaCifrelorCNP(String cnp){
		double cnpDouble=Double.parseDouble(cnp);
		int sum=0;
		while(cnpDouble > 0){
			sum=(int) (sum+cnpDouble%10);
			cnpDouble=cnpDouble/10;
		}
		return sum;
	}
	
	//11. diferenta  cifrelor din cnp
	
	public int diferentaCifrelorCNP(String cnp){
		double cnpDouble=Double.parseDouble(cnp);
		int diferenta=0;
		while(cnpDouble > 0){
			diferenta=(int) (diferenta-cnpDouble%10);
			cnpDouble=cnpDouble/10;
		}
		return diferenta;
	}
	
}
