<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Donate Blood, Save Life</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
	function ctck() {
		var sds = document.getElementById("dum");
		if (sds == null) {
			alert("You are using a free package.\n You are not allowed to remove the tag.\n");
		}
	}
</script>

<SCRIPT LANGUAGE="JavaScript">
	function dil(form) {
		for ( var i = 0; i < form.elements.length; i++) {
			if (form.elements[i].value == "") {
				alert("Fill out all Fields")
				document.F1.accountno.focus()
				return false
			}
		}

		if (isNaN(document.F1.accountno.value)) {
			alert("Accountno must  be  number & can't be null")
			document.F1.accountno.value = ""
			document.F1.accountno.focus()
			return false
		}
		if (!isNaN(document.F1.username.value)) {
			alert("User Name  must  be  char's & can't be null")
			document.F1.username.value = ""
			document.F1.username.focus()
			return false
		}

		if (!isNaN(document.F1.password.value)) {
			alert("Password  must  be  char's & can't be null")
			document.F1.password.value = ""
			document.F1.password.focus()
			return false
		}

		return true
	}
</SCRIPT>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Global Banking ..</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
	function ctck() {
		var sds = document.getElementById("dum");

	}
</script>

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="../JS/angular.min.js"></script>
<script src="../JS/bootstrap.min.js"></script>
<body>
	<div id="header">
		<div id="navigation">
			<ul>
				<li><a href="index.jsp">Home</a></li>
				<li><a href="about.jsp">About Us</a></li>
				<li><a href="admin.jsp">ADMINISTRATOR </a></li>
				<li><a href="customer.jsp">CUST0MER</a></li>
				<li><a href="contactus.jsp">Contact Us</a></li>

			</ul>
			<div style='float: right'>
				<a href="LogoutServlet" class="btn btn-info btn-md"> <span
					class="glyphicon glyphicon-log-out"></span> Log out
				</a>
			</div>
		</div>
	</div>

	<table width="960" border="0" cellspacing="10" cellpadding="0"
		align="center">
		<tr align="justify">
			<td valign="top" width="220px"><img src="images/DonateBlud2.jpg"
				alt="" border="0" /> <br />
				<h1>Pharmaceutist</h1>
				<p>Freedesignertemplates.com has a wide collection of HTML web
					design templates.</p>
				<p align="right">
					<a href="#" class="more">View More</a>
				</p></td>
			<td valign="top">
				<%%>
				<table width="300" border="0" cellspacing="10" cellpadding="0"
					align="center">
					<%
						String username = request.getParameter("username");
						String password = request.getParameter("password");
						boolean status = verifyLogin1.checkLogin(username, password);
						
						try {
								if(username.equals("admin") && status == true){
									out.print("Welcome    " + username);
									%>
									<jsp:forward page="adminprocess.jsp"></jsp:forward>		<%	
								}
								else if (status == true) {
									out.print("Welcome    " + username);

	 								out.println("<br><a href='order.jsp'>Click for recpient details</a> ");

							} else {
								out.print("Please check your username and Password");
								request.setAttribute("check",
										"Please check your username and Password");
					%>
					<jsp:forward page="customer.jsp"></jsp:forward>
					<%
 						}
 						} catch (Exception e) {
 							e.printStackTrace();
 						}
					%>
				</table>
				<%%> <%@ page import="java.sql.*"%> <%@ page
					import="java.io.*"%> <%@ page
 					import="javax.servlet.*"%>
					<%@ page 
import="com.javatpoint.*"%> 
			<td valign="top"><img src="images/DonateBlud2.jpg" alt=""
				border="0" />
				<h1>Drug Store</h1>
				<p>Anyone can use these HTML templates just by replacing the
					content to the pre-existing site designs.</p>
				<p align="right">
					<a href="#" class="more">View More</a>
				</p></td>
			<td valign="top"><img src="images/DonateBlud2.jpg" alt=""
				border="0" />
				<h1>Tablets</h1>
				<p>This high quality free pharmaceutical company template is
					built using XHTML and CSS..</p>
				<p align="right">
					<a href="#" class="more">View More</a>
				</p></td>

		</tr>
		<tr>
			<td colspan="4" style="border-bottom: 1px solid #CCCCCC;"></td>
		</tr>
	</table>


	<div id="content">
		<table width="960" border="0" cellspacing="0" cellpadding="0">
			<tr align="justify">
				<td width="200" valign="top"><img src="images/DonateBlud2.jpg"
					alt="" border="0" /></td>
				<td width="760" valign="top">
					<h1>Welcome to Our Blood Donation Program.</h1>
					<p>This is .</p>
					<br />

					<p>There are many other template categories like Arts,
						Agriculture, Computers, Satellite, Cars, Finance, Nature, Music,
						Personal Website, Religious, Fashion, Furniture, Holiday, Travel,
						Night club are available in this site. Have a look at the
						collection of HTML templates, pick the right one, preview and
						download it easily.</p>
				</td>
			</tr>
		</table>
	</div>

</body>
</html>

</head>

<body>

	<script type="text/javascript">
		document.onload = ctck();
	</script>
	</div>

</body>
</html>
