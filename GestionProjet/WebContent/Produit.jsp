<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>gestion de produit</title>
</head>
<body>
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
</body>
</html>