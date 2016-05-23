package clase;

import interfete.Sectie;

public class Neurologie extends Sectie{
	
	
	
	public Neurologie(){
		this.idSectie=2;
		this.denumireSectie="Neurologie";
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
	
	
}
