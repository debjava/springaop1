var loginModule = angular.module('loginModule', []);

loginModule.controller("loginController", function($scope, $http, $window) {

	$scope.login = function() {
		var username = $scope.userName;
		var pwd = $scope.password;
		var loginUrl = 'login/login' + '/' + username + '/' + pwd
		$http({
			method : 'GET',
			url : loginUrl
		}).success(function(data, status, headers, config) {
			$window.location.replace('login/registrationpage');
		}).error(function(data, status, headers, config) {
			// called asynchronously if an error occurs
			// or server returns response with an error status.
		});
	}
});
