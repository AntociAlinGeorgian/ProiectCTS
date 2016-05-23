package clase;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import interfete.Sectie;

public class Clinica{
	private static Clinica instance = null;
	private String numeClinica;
	private String adresa;
	private String nrTelefon;
	
	private ArrayList<Doctor> listaDoctori=new ArrayList<>();
	private ArrayList<Sectie> listaSectii=new ArrayList<>();
	

	
	public Clinica(){
		this.numeClinica="Anima";
		this.adresa="Piata Unirii";
		this.nrTelefon="07123123123";
	}
	
	public Clinica(String numeClinica, String adresa, String nrTelefon){
		super();
		this.numeClinica=numeClinica;
		this.adresa=adresa;
		this.nrTelefon=nrTelefon;
	}
	
	
	@Override
	public String toString() {
		return "Clinica [numeClinica=" + numeClinica + ", adresa=" + adresa + ", nrTelefon=" + nrTelefon + "]";
	}

	public static Clinica getInstance() {
		return instance;
	}
	public static void setInstance(Clinica instance) {
		Clinica.instance = instance;
	}
	public String getNumeClinica() {
		return numeClinica;
	}
	public void setNumeClinica(String numeClinica) {
		if(numeClinica !=null)
			this.numeClinica = numeClinica;
		else throw new IllegalArgumentException();
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		if(adresa !=null)
			this.adresa = adresa;
		else throw new IllegalArgumentException();
	}
	public String getNrTelefon() {
		return nrTelefon;
	}
	public void setNrTelefon(String nrTelefon) {
		if(nrTelefon !=null)
			this.nrTelefon = nrTelefon;
		else throw new IllegalArgumentException();
	}
	
	

	
	public ArrayList<Sectie> getListaSectii() {
		return listaSectii;
	}

	public void setListaSectii(ArrayList<Sectie> listaSectii) {
		if(listaSectii !=null)
			this.listaSectii = listaSectii;
		else throw new IllegalArgumentException();
	}
	public ArrayList<Doctor> getListaDoctori() {
		return listaDoctori;
	}

	public void setListaDoctori(ArrayList<Doctor> listaDoctori) {
		this.listaDoctori = listaDoctori;
	}
	

	
	//Singleton
	public static Clinica getInstance(String numeClinica, String adresa, String nrTelefon){
		if(instance==null){
			instance=new Clinica(numeClinica, adresa, nrTelefon);
		}
		return instance;
	}
	
	
	//Teste
	//1. verificare ca numele clinicii sa aibe prima litera uppercase
	public boolean checkNumeClinicaUpper(String numeClinica){
		if(Character.isUpperCase(numeClinica.charAt(0)))
			return true;
		else
			return false;
	}
	
	//2. verificare ca adresa sa nu aibe mai mult de 40 caractere
	
	public boolean checkLungimeAdresa(String adresaClinica){
		if(adresaClinica.length()<=40)
			return true;
		else
			return false;
	}
	
	//3. verificare ca numarul de telefon sa fie format doar din cifre
	public boolean checkTelefon(String telefon){
		try{
			double d= Double.parseDouble(telefon);
		} catch(NumberFormatException nfe){
			return false;
		}
		return true;
	}
	
	//4. verificare numar telefon
	
	
	public String checkPrefixTelefon(String telefon){
		String prefix=telefon.substring(0, 4);
		if(prefix.equals("0722"))
			return "Vodafone";
		else if(prefix.equals("0744"))
			return "Orange";
		else if(prefix.equals("0770"))
			return "Telekom";
		else 
			return "Alta retea";
	}
	
	//5. verificare lista nenula
	public ArrayList<String> creazaListaString(String nume,String prenume){
		ArrayList<String> lista=new ArrayList<String>();
		if(nume.length()<2 || prenume.length() <2){
			lista.add(nume);
			lista.add(prenume);
		}
		return lista;
	}
	
	//6. verificare daca clinica este deschisa sau nu
	
	
	public boolean verificareProgramClinica(){
		String data = new SimpleDateFormat("HH:mm").format(new java.util.Date());
		String ora= data.substring(0, 2);
		String minut=data.substring(3,5);
		
		if(Integer.parseInt(ora)>20 && Integer.parseInt(minut)>30)
			return false; //clinica este inchisa
		else 
			return true; //clinica este deschisa
	}
	//7. adaugare doctori in lista de doctori
	
	public void adaugaDoctor(Doctor d)
	{
		if(d!=null)
			this.listaDoctori.add(d);
		else throw new IllegalArgumentException();
	}
	
	//8. determinare varsta medie a doctorilor
	
	public double varstaMedieDoctor(ArrayList<Doctor> lista)
	{
		double suma=0;
		for(int i=0;i<this.listaDoctori.size();i++)
			suma=suma+this.listaDoctori.get(i).getVarsta();
		suma=suma/this.listaDoctori.size();
		return suma;
	}
	//9. verificare numar de telefon - 10 cifre
	
	public int nrCifreTelefon(String numar){
		int lungime=numar.length();
		return lungime;
	}

	
}
