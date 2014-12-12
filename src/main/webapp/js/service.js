/**
 * 
 */
angular.module('myApp.services', [ 'ngResource' ]).factory(
		'AngularIssues',
		function($resource) {
			return $resource(
					'/SpringMVCAngularJSRESTAndClient01/newUser',
					{}, {
						query : {
							method : 'GET',
							params : {},
							isArray : false
						}
					})
		})
