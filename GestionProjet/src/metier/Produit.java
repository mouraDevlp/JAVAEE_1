package metier;

public class Produit {

	
	private long id;
	private String nom;
	private String desc;
	private int prix;
	private int etat;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	
	
	public Produit(String nom, String desc, int prix, int etat) {
		super();
		this.nom = nom;
		this.desc = desc;
		this.prix = prix;
		this.etat = etat;
	}
	
	
	public Produit(long id, String nom, String desc, int prix, int etat) {
		super();
		this.id = id;
		this.nom = nom;
		this.desc = desc;
		this.prix = prix;
		this.etat = etat;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "id: "+id+"  nom:  " + nom + "  desc:  "+desc+"  prix: "+prix+"   etat: "+etat;
	}
   public void show() {
	System.out.println(toString());
    }
	
}
