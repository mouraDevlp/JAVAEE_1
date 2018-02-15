package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Operation;
import metier.Produit;

@WebServlet("/ProduitServlet")
public class ProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/* Operation op;
	
    public ProduitServlet() {
        super();
    }

    public void init () throws ServletException{
    	op = new Operation();
    }*/
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Operation op = new Operation();
		if(request.getParameter("action")!=null) {
			op.remove(Long.parseLong(request.getParameter("id")) );
			/*ProduitBeans pb = new ProduitBeans();
			pb.setListe(op.getAll());
			request.getRequestDispatcher("Produit.jsp").forward(request, response);
			System.out.println("action = suprimer");*/
		}else {
			
		
		String nom = request.getParameter("nom");
		String desc=request.getParameter("desc");
		String prix=request.getParameter("prix");
		String etat=request.getParameter("etat");
		Produit p = new Produit(1L,nom, desc, Integer.parseInt(prix),Integer.parseInt(etat));
		op.add(p);

		}
		ProduitBeans pb = new ProduitBeans();
		pb.setListe(op.getAll());
		request.setAttribute("modele", pb);
		request.getRequestDispatcher("Produit.jsp").forward(request, response);	
		
	}

}
