<!DOCTYPE html>
<html ng-app=registrationModule>
<head>
<title>Login Page</title>
</head>
<body>

	<div ng-controller="registrationController">
		<table>
			<tr>
				<td>First Name:</td>
				<td><input type="text" data-ng-model="data.firstName" /></td>
			</tr>
			<tr>
				<td>LastName:</td>
				<td><input type="password" data-ng-model="data.lastName" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" data-ng-model="data.email" /></td>
			</tr>
			<tr>
				<td />
				<td><button ng-click="register()">Register</button></td>
			</tr>
		</table>
	</div>
	<script src="../resources/js/lib/angular/angular.js"></script>
	<script src="../resources/js/controller/registrationcontroller.js"></script>
</body>

</html>