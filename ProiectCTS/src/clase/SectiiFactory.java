package clase;

import interfete.Sectie;

public class SectiiFactory {
	public Sectie createSectie(EnumSectii e){
		switch (e){
		case Cardiologie:
			return new Cardiologie();
		case Neurologie:
			return new Neurologie();
		case Dermatologie:
			return new Dermatologie();
		}
		return null;
	}
}

