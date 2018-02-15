package metier;

import java.util.Iterator;

public class TestMetier {

	public static void main(String[] args){
		
		Operation op = new Operation();
		Produit p = new Produit();
		
		
		//ajout des produits
		op.add(new Produit(new Long (1),"PC","pc portable",500,1));
		op.add(new Produit(new Long (2),"sourie","sourie pc hp",500,1));
		op.add(new Produit(new Long (3),"clavier","clavier hp",500,1));
		op.add(new Produit(new Long (4),"RAM","ram lenovo",500,1));
		
		//supression de produits
		op.remove(2);
		
		Iterator<Produit> prds = op.getAll().iterator();
		
		while (prds.hasNext()){
			Produit pr = prds.next();
			//System.out.println(pr.toString());
			pr.show();
		}
	}
}
