<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6 lt8"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7 lt8"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8 lt8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta charset="UTF-8" />
<!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
<title>Book Application</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="Login and Registration Form with HTML5 and CSS3" />
<meta name="keywords"
	content="html5, css3, form, switch, animation, :target, pseudo-class" />
<meta name="author" content="Codrops" />
<link rel="shortcut icon" href="../favicon.ico">
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/animate-custom.css" />

</head>
<body>
	<div class="container">
		<!-- Codrops top bar -->
		<div class="codrops-top">
			<!-- <a href="">
                    <strong>&laquo; Previous Demo: </strong>Responsive Content Navigator
                </a>
                <span class="right">
                    <a href=" http://tympanus.net/codrops/2012/03/27/login-and-registration-form-with-html5-and-css3/">
                        <strong>Back to the Codrops Article</strong>
                    </a>
                </span>
                 -->
			<div class="clr"></div>
		</div>
		<!--/ Codrops top bar -->
		<header>
			<h1>
				Login failed<span>Try again</span>
			</h1>
			<nav class="codrops-demos">
				<span>Book managment with<strong>"Java"</strong></span>
				<!-- 	<a href="index.html" class="current-demo">Demo 1</a>
					<a href="index2.html">Demo 2</a>
					<a href="index3.html">Demo 3</a>
				 -->
			</nav>
		</header>
		<section>
			<div id="container_demo">
				<!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
				<a class="hiddenanchor" id="toregister"></a> <a class="hiddenanchor"
					id="tologin"></a>
				<div id="wrapper">
					<div id="login" class="animate form">
						<form action="UsersLogin" method="post" autocomplete="on">
							<h1>Log in</h1>
							<p>
								<label for="username" class="uname" data-icon="u">Enter
									your email </label> <input id="username" name="emailid"
									required="required" type="text"
									placeholder="myusername or mymail@mail.com" />
							</p>
							<p>
								<label for="password" class="youpasswd" data-icon="p">
									Your password </label> <input id="password" name="password"
									required="required" type="password" placeholder="eg. X8df!90EO" />
							</p>
							<!--     <p class="keeplogin"> 
									<input type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping" /> 
									<label for="loginkeeping">Keep me logged in</label>
								</p> -->
							<p class="login button">
								<input type="submit" value="Login" />
							</p>
							<p class="change_link">
								Not a member yet ? <a href="#toregister" class="to_register">Register
									here</a>
							</p>
						</form>
					</div>

					<div id="register" class="animate form">
						<form action="UsersRegistration" method="post">
							<h1>Sign up</h1>
							<p>
								<label for="usernamesignup" class="uname" data-icon="u">Enter
									your name</label> <input id="usernamesignup" name="username"
									required="required" type="text"
									placeholder="mysuperusername690" />
							</p>
							<p>
								<label for="emailsignup" class="youmail" data-icon="e">
									Your email id</label> <input id="emailsignup" name="emailid"
									required="required" type="email"
									placeholder="mysupermail@mail.com" />
							</p>
							<p>
								<label for="passwordsignup" class="youpasswd" data-icon="p">Your
									password </label> <input id="passwordsignup" name="password"
									required="required" type="password" placeholder="eg. X8df!90EO" />
							</p>
							<!-- <p> 
                                    <label for="passwordsignup_confirm" class="youpasswd" data-icon="p">Please confirm your password </label>
                                    <input id="passwordsignup_confirm" name="passwordsignup_confirm" required="required" type="password" placeholder="eg. X8df!90EO"/>
                                </p>
                                 -->
							<p class="signin button">
								<input type="submit" value="Sign up" />
							</p>
							<p class="change_link">
								Already a member ? <a href="#tologin" class="to_register">
									Go and log in </a>
							</p>
						</form>
					</div>

				</div>
			</div>
		</section>
	</div>


</body>
</html>