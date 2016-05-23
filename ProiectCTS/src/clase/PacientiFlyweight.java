package clase;
import java.util.HashMap;
import clase.Pacient;
import interfete.IPacient;

public class PacientiFlyweight {
	private static final HashMap<String,IPacient> pacientiMap=new HashMap<String, IPacient>();
	
	public static IPacient getPacient(String sectie){
		Pacient p=(Pacient)pacientiMap.get(sectie);
		
		if(p==null){
			p=new Pacient();
			pacientiMap.put(sectie, p);
			System.out.println("Internare in sectia " + sectie);
		}
		return p;
	}
}
