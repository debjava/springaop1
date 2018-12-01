var newAppModule = angular.module('newApp', []);

newAppModule.controller("welcomeController2", function($scope,$http,$window) {

	$scope.login = function() {
		var username = $scope.userName;
		var pwd = $scope.password;
		alert(username);
		var loginUrl = 'check'+'/'+username+'/'+pwd
		$http({method: 'GET', url: loginUrl}).
		success(function(data, status, headers, config) {
			$scope.greeting = data;
//			$window.location.replace('login/newpage');
			alert(data);
//			$window.location.replace(data);
			$window.location.replace('login/newpage');
		}).
		error(function(data, status, headers, config) {
			// called asynchronously if an error occurs
			// or server returns response with an error status.
		});	
	}
});
