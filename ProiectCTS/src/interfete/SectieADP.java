package interfete;

public abstract class SectieADP {
	
	protected int idSectie;
	

	public int getIdSectie() {
		return idSectie;
	}

	public void setIdSectie(int idSectie) {
		this.idSectie = idSectie;
	}
	
	
	public abstract void transferPacienti(SectieADP sectieADP, int nrPacienti);
}
