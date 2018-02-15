package metier;

import java.util.ArrayList;

public class Operation {

	
	private ArrayList<Produit> produits = new ArrayList<Produit>();

	public ArrayList<Produit> getProduits() {
		return produits;
	}

	public void setProduits(ArrayList<Produit> produits) {
		this.produits = produits;
	}
	
	public void add (Produit p) {
		produits.add(p);
	}
	
	public void remove (long id) {
		for (Produit p:produits) {
			if(p.getId()==id) {
				produits.remove(p);
				break;
			}
		}
	}
	
	public ArrayList getAll() {
		return produits;
	}
}
