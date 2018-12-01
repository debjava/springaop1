var registrationModule = angular.module('registrationModule', []);

registrationModule.controller("registrationController", function($scope, $http, $window) {

	$scope.register = function() {
		var mydata = $scope.data;
		var registrationUrl = '../registration/register';
		$http({
			method : 'POST',
			url : registrationUrl,
			data : $scope.data
		}).success(function(data, status, headers, config) {
			$window.location.replace('../registration/success');
		}).error(function(data, status, headers, config) {
			// called asynchronously if an error occurs
			// or server returns response with an error status.
		});
	}

});
