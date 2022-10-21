package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.domain;

public class Flor {

	private Integer id;

	private String nom;

	private String pais;

	public Flor() {
	}

	public Flor(Integer id, String nom, String pais) {
		this.id = id;
		this.nom = nom;
		this.pais = pais;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}


}
