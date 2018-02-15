<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page  import="web.ProduitBeans" %>
    <%@ page  import="metier.Produit" %>
    <%@ page  import= "java.util.Vector" %>
    <%@ page  import="java.util.Iterator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>gestion de produit</title>
</head>
<body>
<br>

	<% 
String b = (String) request.getAttribute("v");
out.println(b);
%>
	


<br>

<%
	ProduitBeans produits ;
	if (request.getAttribute("modele")!=null){
		produits =  (ProduitBeans) request.getAttribute("modele");
	}else{
		produits = new ProduitBeans();
	}
		
%>
	ceci est une pase jsp
	<br>
	<p3>Ajouter un produit</p3>
	<br>
	
	<form action="prodserv" method="post">
	<table border="1" width="50%">
	
	<tr>
	<td>Nom</td>
	<td><input type="text" name="nom"  /></td>
	</tr>
	
	<tr>
	<td>Discription</td>
	<td><input type="text" name="desc"  /></td>
	</tr>
	
	<tr>
	<td>Prix</td>
	<td><input type="text" name="prix"  /></td>
	</tr>
	
	<tr>
	<td>Etat</td>
	<td><input type="text" name="etat"  /></td>
	</tr>
	
	<tr>
	<td colspan="2"><input type="submit" value="envoyer"/></td>
	</tr>
	</table>
	</form>
	
	<table border="1" width="60%">
	<tr>
		<th>ID</th>
		<th>Nom</th>
		<th>Description</th>
		<th>Prix</th>
		<th>Etat</th>
		<th>Option</th>
	</tr>
	
	<%
		Iterator<Produit> list = produits.getListe().iterator();
	while(list.hasNext()){
		Produit p = list.next();
		%>
	
	<tr>
		<td><%=p.getId() %></td>
		<td><%=p.getNom() %></td>
		<td><%=p.getDesc() %></td>
		<td><%=p.getPrix() %></td>
		<td><%=p.getEtat() %></td>
		
		<td>
			<form action="prodserv" method="POST">
			<input type="hidden" name="id" value="<%=p.getId() %>"/>
			<input type="hidden" name="action" value="supprimer"/>
			<input type="submit" value="supprimer"/>
			</form>
		</td>
		
		
	</tr>
	
		
	<%}%>
	
	
	
	
	</table>
</body>
</html>