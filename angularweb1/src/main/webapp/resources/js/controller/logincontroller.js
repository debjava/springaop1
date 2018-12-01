/**
 * Controller for login
 */
function loginController($scope) {
	$scope.login = function() {
		$scope.userName;
		$scope.password = 'test';
		alert($scope.userName);
		$scope.name = $scope.userName;
		//$scope.contacts='sss';
		$scope.contacts = $scope.userName;
		//$scope.contacts=angular.copy(userName);
	}
}

function loginController1($scope, $http) {
	$scope.login = function() {
		alert('dasdsads');
		
		$http.get('http://localhost:8080/angularweb1/login/logindetails', {
	    params: { userName: 'deb' , password: 'deb'}
	}).sucess( function(data) {
		 $scope.greeting = data;
	});
	
	}
	
	
   
}