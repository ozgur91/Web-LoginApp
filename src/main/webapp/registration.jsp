<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Registration Page</title>
    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <link href="signin.css" rel="stylesheet">
</head>
<body>

		
<main class="form-signin">
  <form action="setUser" method="POST">
    <img class="mb-4" src="logo/bootstrap-logo.svg" alt="" width="72" height="57">
    <h1 class="h3 mb-3 fw-normal">Registration</h1>

    <div class="form-floating">
      <input type="text" class="form-control" id="floatingInput" placeholder="ExtremUser" name="first_name">
      <label for="floatingInput">First name</label>
    </div>
        <div class="form-floating">
      <input type="text" class="form-control" id="floatingInput" placeholder="ExtremUser" name="last_name">
      <label for="floatingInput">Last name</label>
    </div>
        <div class="form-floating">
      <input type="text" class="form-control" id="floatingInput" placeholder="ExtremUser" name="username">
      <label for="floatingInput">username</label>
    </div>
    <div class="form-floating">
      <input type="password" class="form-control" id="floatingPassword" placeholder="Password" name="passwort">
      <label for="floatingPassword">Password</label>
    </div>
    <button class="w-100 btn btn-lg btn-primary" type="submit">Register</button>
    	<a href="loginPage.jsp">You are allready registered? So follow this
		link for Login then pls</a>
    <p class="mt-5 mb-3 text-muted">&copy; 2021 &Ouml;zg&uuml;r Aslan</p>
  </form>
</main>

</body>
</html>