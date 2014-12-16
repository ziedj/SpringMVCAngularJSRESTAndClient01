/**
 * 
 */
angular.module('myApp.services', [ 'ngResource' ]).factory(
		'AngularIssues',
		function($resource) {
			return $resource(
					'rest/newJsonUser',
					{},
					{
						query : {
							method : 'GET',
							params : {},
							isArray : false
						}
					})
		})
