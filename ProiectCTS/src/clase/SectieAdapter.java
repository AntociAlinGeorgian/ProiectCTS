package clase;

import interfete.Sectie;
import interfete.SectieADP;

public class SectieAdapter extends Sectie{
	
	public SectieADP sectieADP;

	@Override
	public String detaliiSectie() {
		return "Id sectie: " + sectieADP.getIdSectie();
	}

	@Override
	public void internarePacienti(int nrPacienti) {
		sectieADP.transferPacienti(sectieADP, nrPacienti);
		
	}

	@Override
	public void mutarePacienti(int nrPacienti, Sectie sectie) {
		sectieADP.transferPacienti(new SectieClinicaExterna(sectie.getIdSectie()), nrPacienti);
		
	}
	
	public SectieAdapter(int idSectie){
		sectieADP=new SectieClinicaExterna(this.getIdSectie());
		sectieADP.setIdSectie(idSectie);
	}

	
}
