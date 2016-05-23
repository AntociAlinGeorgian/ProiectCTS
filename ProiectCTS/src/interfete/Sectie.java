package interfete;

public abstract class Sectie implements Cloneable{
	
	protected String denumireSectie;
	protected int idSectie;
	
	public abstract String detaliiSectie();
	public abstract void internarePacienti(int nrPacienti);
	public abstract void mutarePacienti(int nrPacienti, Sectie sectie);
	
	
	public String getDenumireSectie() {
		return denumireSectie;
	}
	
	
	public void setDenumireSectie(String denumireSectie) {
		this.denumireSectie = denumireSectie;
	}
	public int getIdSectie() {
		return idSectie;
	}
	public void setIdSectie(int idSectie) {
		this.idSectie = idSectie;
	}
	
	
	//Prototype
	public Sectie clone(){
		Sectie clone=null;
		try{
			clone=(Sectie) super.clone();
		} catch (CloneNotSupportedException e){
			e.printStackTrace();
		}
		return clone;
	}
}
