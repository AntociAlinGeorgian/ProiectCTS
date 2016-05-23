package clase;

public class Internari {
	private Cardiologie cardio;
	private Dermatologie dermato;
	private Neurologie neuro;
	
	
	//Facade
	public Internari(){
		cardio=new Cardiologie();
		dermato=new Dermatologie();
		neuro=new Neurologie();
	}
		
		public void internareCardio(int nrPacienti){
			cardio.internarePacienti(nrPacienti);
		}
		
		public void internareDermato(int nrPacienti){
			dermato.internarePacienti(nrPacienti);
		}
		
		public void internareNeuro(int nrPacienti){
			neuro.internarePacienti(nrPacienti);
		}
}
