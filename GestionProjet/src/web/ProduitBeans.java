package web;



import java.util.ArrayList;

import metier.Produit;

public class ProduitBeans {

	private Produit produit = new Produit();
	private ArrayList <Produit> liste = new ArrayList<Produit>();
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public ArrayList<Produit> getListe(ArrayList arrayList) {
		return liste;
	}
	public ArrayList<Produit> getListe() {
		return liste;
	}
	public void setListe(ArrayList<Produit> liste) {
		this.liste = liste;
	}
	
	
}
