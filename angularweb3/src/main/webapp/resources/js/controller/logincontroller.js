
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

//function loginController1($scope, $http) {
//$scope.login1 = function() {
//alert('dasdsads');
//var responsePromise = $http.get("http://localhost:8080/angularweb3/login/check/deb/asdf");
//alert(responsePromise);
////$http.get('http://localhost:8080/angularweb3/login1/logindetails1/deb/asdf', {
//$http.get('http://localhost:8080/angularweb3/login/check/deb/asdf', {
////params: { userName: 'deb' , password: 'deb'}
//}).sucess( function(data) {
//alert(data);
//$scope.greeting = data;
//});

//}

function loginController1($scope, $http) {
	$scope.login1 = function() {
		alert('dasdsads');
		//$http({method: 'GET', url: 'http://localhost:8080/angularweb3/login/check/deb/asdf'}).
		var username = $scope.userName;
		var pwd = $scope.password;
		var loginUrl = 'login/check'+'/'+username+'/'+pwd
//		$http({method: 'GET', url: 'login/check/deb/asdf'}).
		$http({method: 'GET', url: loginUrl}).
		success(function(data, status, headers, config) {
			// this callback will be called asynchronously
			// when the response is available
			alert(data+"---"+status);
			$scope.greeting = data;
			$location.path( 'jsp/NewPage.jsp' );
		}).
		error(function(data, status, headers, config) {
			// called asynchronously if an error occurs
			// or server returns response with an error status.
		});	
	}

	



}