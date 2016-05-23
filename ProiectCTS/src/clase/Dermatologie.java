package clase;


import interfete.Sectie;

public class Dermatologie extends Sectie{
	
	public Dermatologie(){
		this.idSectie=3;
		this.denumireSectie="Dermatologie";
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
	
	//Teste
	//1. programare pacienti


	
}
