/**
 * Controller for login
 */
function loginController($scope) {
    $scope.login = function() {
    	$scope.userName;
    	$scope.password = 'test';
    	alert($scope.userName);
    	$scope.name=$scope.userName;
    	//$scope.contacts='sss';
    	$scope.contacts=$scope.userName;
    	//$scope.contacts=angular.copy(userName);
    }
    }