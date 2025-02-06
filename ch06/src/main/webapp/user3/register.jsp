<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>user2::register</title>
</head>
<body>
	<h3>user2 register</h3>
	<a href="../1.jdbc.jsp">first page</a>
	<a href="./list.jsp">list page</a>
	
	<form action="./proc/register.jsp" method="post">
		<table border="1">
			<tr>
				<td>id</td>
				<td><input type="text" name="uid" placeholder="input id"></td>
			</tr>
			<tr>
				<td>name</td>
				<td><input type="text" name="name" placeholder="input name"></td>
			</tr>
			<tr>
				<td>birth</td>
				<td><input type="text" name="birth" placeholder="input birth"></td>
			</tr>
			<tr>
				<td>addr</td>
				<td><input type="text" name="addr" placeholder="input addr"></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="enroll">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>