package metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		try {
			//etape 1
			Class.forName("com.mysql.jdbc.Driver");
			//etape 2
			java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionproduit","root","root");
			//etape 3
			PreparedStatement pr = cn.prepareStatement("INSERT INTO produit VALUE (NULL,?,?,?,?)");
			//etape 4
			pr.setString(1, p.getNom());
			pr.setString(2, p.getDesc());
			pr.setInt(3, p.getPrix());
			pr.setInt(4, p.getEtat());
			//etape 5
			pr.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//produits.add(p);
	}
	
	public void remove (long id) {
		
		try {
		//etape 1
		Class.forName("com.mysql.jdbc.Driver");
		//etape 2
		java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionproduit","root","root");
		//etape 3
		PreparedStatement pr = cn.prepareStatement("DELETE FROM produit WHERE id=?");
		//etape 4
		pr.setLong(1, id);
		//etape 5
		pr.execute();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
		/*for (Produit p:produits) {
			if(p.getId()==id) {
				produits.remove(p);
				break;
			}
		}*/
	}
	
	public ArrayList getAll() {
		
		ArrayList listproduit = new ArrayList<Produit>();
		
		try {
			//etape 1
			Class.forName("com.mysql.jdbc.Driver");
			//etape 2
			java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionproduit","root","root");
			//etape 3
			PreparedStatement pr = cn.prepareStatement("SELECT * FROM produit");
			ResultSet rs = pr.executeQuery();
			//etape 5
			while(rs.next()) {
				Produit p = new Produit();
				p.setId(rs.getLong("id"));
				p.setNom(rs.getString("nom"));
				p.setDesc(rs.getString("desc"));
				p.setPrix(rs.getInt("prix"));
				p.setEtat(rs.getInt("etat"));
				listproduit.add(p);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listproduit;
		//return produits;
	}
}
