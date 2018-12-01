<!DOCTYPE html>
<html ng-app=newApp>
<head>
<title>Login Page</title>
</head>
<body>
<form action="login/newpage" method="POST">
	<input type="submit" value="Submit">
</form>
It is new
<div ng-controller="welcomeController2">
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
		You Login is {{ greeting  }}
	</div>
	
</div>
<script src="../resources/js/lib/angular/angular.js"></script>
<!-- <script src="../resources/js/controller/logincontroller1.js"></script> -->
<script src="../resources/js/controller/welcomecontroller2.js"></script>
<!-- <script src="../resources/js/controller/welcomeController2.js"></script> -->
</body>

</html>