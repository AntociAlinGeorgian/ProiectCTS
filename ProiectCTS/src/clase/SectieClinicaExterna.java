package clase;

import interfete.SectieADP;

public class SectieClinicaExterna extends SectieADP{

	public SectieClinicaExterna(int idSectie) {
		this.idSectie=idSectie;
	}


	@Override
	public void transferPacienti(SectieADP sectieADP, int nrPacienti) {
		System.out.println("Au fost transferati "+ nrPacienti + " pacinenti in  sectia cu id "+ sectieADP.getIdSectie() + " de la sectia clinicii externe Anima.");
		
	}

}
