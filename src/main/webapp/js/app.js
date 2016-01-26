'use strict';

// Declare app level module which depends on filters, and services
angular.module('quiz', ['quiz.filters', 'quiz.services', 'quiz.directives', 'quiz.controllers']).
    config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/view1', {templateUrl: 'partials/partial1.html', controller: 'QuizController'});
        $routeProvider.otherwise({redirectTo: '/view1'});
    }]);
