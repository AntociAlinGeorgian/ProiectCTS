package clase;

import java.util.ArrayList;
import java.util.List;

import interfete.ISubject;
import interfete.Sectie;

public class Cardiologie extends Sectie  implements ISubject{
	
	private ArrayList<PacientUrgenta> listaUrgenta=new ArrayList<>();
	
	public Cardiologie(){
		this.idSectie=1;
		this.denumireSectie="Cardiologie";
	}

	@Override
	public String detaliiSectie() {
		return "Id Sectie: " + idSectie + ". Denumire: "+ denumireSectie;
	}

	@Override
	public void internarePacienti(int nrPacienti) {
		System.out.println("In sectia "+ this.denumireSectie +" au fost internati " + nrPacienti + " pacienti ");
		
	}

	@Override
	public void mutarePacienti(int nrPacienti, Sectie sectie) {
		System.out.println("Din sectia " + this.denumireSectie + " au fost mutati " + nrPacienti + " pacienti in sectia cu id " +  sectie.getIdSectie());
		
	}
	
	
		public ArrayList<PacientUrgenta> getListaUrgenta() {
		return listaUrgenta;
	}

	public void setListaUrgenta(ArrayList<PacientUrgenta> listaUrgenta) {
		if(listaUrgenta!=null)
			this.listaUrgenta = listaUrgenta;
		else throw new IllegalArgumentException();
	}
	


		//Observer
		private List<Pacient> obs= new ArrayList<Pacient>();

		public List<Pacient> getObs() {
			return obs;
		}

		public void setObs(List<Pacient> obs) {
			this.obs = obs;
		}

		@Override
		public void notifica(String mesaj) {
			for(int i=0;i<obs.size();i++){
				obs.get(i).update(mesaj);
			}
			
		}
		
		public void pacientInternat(Pacient p, Cardiologie c){
			this.notifica("*Internare:  Pacientul "+ p.getNume() + " " + p.getPrenume() + " a fost internat in sectia " + c.denumireSectie);
		}
		
		public void pacientExternat(Pacient p, Cardiologie c){
			this.notifica("*Externare: Pacientul "+p.getNume()+ " " + p.getPrenume()+ " a fost externat din sectia " + c.denumireSectie);
		}

		@Override
		public void adaugaObserver(Pacient p) {
			obs.add(p);
			
		}

		@Override
		public void stergeObserver(Pacient p) {
			obs.remove(p);
			
		}
		
		//1. functie de adaugare pacient la urgenta
		
		public void adaugaPacientUrgenta(PacientUrgenta p){
			if(p!=null)
				this.listaUrgenta.add(p);
			else throw new IllegalArgumentException();
		}
		//2. functie de determinare a numarului de pacienti sositi in intervalul orar 12-19
		
		public int nrPacientInterval(ArrayList<PacientUrgenta> lista){
			int numar=0;
			for(int i=0;i<lista.size();i++)
				if(lista.get(i).getOraSosire()>=12 && lista.get(i).getOraSosire()<=19)
					numar++;
			return numar;
		}
	
		//3. functie centralizare pacienti
		
		public String centralizarePacientiUrgenta(ArrayList<PacientUrgenta> lista, int index){
			if(index<=lista.size())
				return "Pacientul" + lista.get(index).getNumeComplet() + " a sosit in data de " + lista.get(index).getDataSosire();
			return "Pacient inexistent";
		}
}
