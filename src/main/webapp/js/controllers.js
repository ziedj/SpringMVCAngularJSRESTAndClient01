/**
 * 
 */
angular.module('myApp.controllers', ['myApp.services'])
.controller('MyCtrl1',
		[ '$scope', 'AngularIssues', function($scope, AngularIssues) {
			// Instantiate an object to store your scope data in (Best
			// Practices)
			
			AngularIssues.get({}, function (AngularIssues) {
				$scope.user = AngularIssues.firstName;
		    })
			
			//$scope.user = AngularIssues.name;

//			AngularIssues.query(function(response) {
//				// Assign the response INSIDE the callback
//				$scope.data.issues = response;
//			});
		} ])
		
.controller('MyCtrl2', [ function() {
} ]);
