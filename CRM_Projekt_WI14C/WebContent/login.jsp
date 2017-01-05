<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DHBW CRM Login-Screen</title>

<link rel="stylesheet" href="css/style.css">
<style>
	body{
 	display: flex;
 	justify-content: center;
  	align-items: center;
  }
</style>
</head>
<body>

<form id="login">
  <div>
  	<img src="img/logo.gif" />
  </div>
  <label>Benutzername <span>*</span></label>
  <input/>
  <label>Passwort <span>*</span></label>
  <input/>
  <p><a id="pw_recovery_link" style="margin-left:20px;">Passwort vergessen?</a></p>
  <button>Login</button>
</form>

</body>
</html>
