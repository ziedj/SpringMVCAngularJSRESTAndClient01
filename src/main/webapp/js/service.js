/**
 * 
 */
angular.module('myApp.services', [ 'ngResource' ]).factory(
		'AngularIssues',
		function($resource) {
			return $resource(
					'/SpringMVCAngularJSRESTAndClient01/rest/newJsonUser',
					{},
					{
						query : {
							method : 'GET',
							params : {},
							isArray : false
						}
					})
		})
