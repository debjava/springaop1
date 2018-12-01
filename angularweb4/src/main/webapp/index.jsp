<!DOCTYPE html>
<html ng-app="loginModule">
<head>
<title>Login Page</title>
</head>
<body>
<div ng-controller="loginController">
	<table>
		<tr>
			<td>UserName:</td>
			<td><input type="text" ng-model="userName"/></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="password" ng-model="password"/></td>
		</tr>
		<tr>
			<td/>
			<td><button ng-click="login()">Login</button></td>
		</tr>
	</table>
	
	<!-- <div>
		You Login is {{ greeting  }}
	</div> -->
	
</div>
<script src="resources/js/lib/angular/angular.js"></script>
<script src="resources/js/controller/logincontroller.js"></script>
</body>

</html>