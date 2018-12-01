<!DOCTYPE html>
<html ng-app>
<head>
<!-- <script type="text/javascript" src="angular-1.2.23/angular.js"></script>
<script type="text/javascript" src="js/controller/logincontroller.js"></script> -->
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
	
	<div>
		Result is {{ greeting  }}
	</div>
	
</div>
<script src="lib/angular/angular.js"></script>
<script src="js/controller/logincontroller.js"></script>
</body>

</html>