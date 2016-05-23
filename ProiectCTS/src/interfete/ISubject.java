package interfete;

import clase.Pacient;

public interface ISubject {
	void adaugaObserver(Pacient p);
	void stergeObserver(Pacient p);
	void notifica(String mesaj);
}
