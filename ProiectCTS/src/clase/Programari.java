package clase;

import interfete.Sectie;

public class Programari {
	private int id;
	private Pacient p;
	private Sectie s;
	private String data;
	private String ora;
	private String numeDoctor;

	public Programari(int id, Pacient p, String data, String ora, String numeDoctor) {
		super();
		if(id>0)
			this.id = id;
		else throw new IllegalArgumentException();
		if(p!=null)
			this.p = p;
		else throw new IllegalArgumentException();
		if(data!="")
			this.data = data;
		else throw new IllegalArgumentException();
		if(ora!="")
			this.ora = ora;
		else throw new IllegalArgumentException();
		if(numeDoctor!="")
			this.numeDoctor = numeDoctor;
		else throw new IllegalArgumentException();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pacient getP() {
		return p;
	}

	public void setP(Pacient p) {
		this.p = p;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getOra() {
		return ora;
	}

	public void setOra(String ora) {
		this.ora = ora;
	}

	public Sectie getS() {
		return s;
	}

	public void setS(Sectie s) {
		this.s = s;
	}

	public String getNumeDoctor() {
		return numeDoctor;
	}

	public void setNumeDoctor(String numeDoctor) {
		this.numeDoctor = numeDoctor;
	}
	
	
}
