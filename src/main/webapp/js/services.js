'use strict';

/* Services */

var services = angular.module('quiz.services', ['ngResource']);

services.factory('ResultsFactory', function($resource) {
    return $resource('/rest/results', {}, {
        query: {
            method: 'POST'
        }
    })
});

services.factory('QuizFactory', function ($resource) {
    return $resource('/rest/questions', {}, {
        query: {
            method: 'GET',
            params: {},
            isArray: false
        }
    })
});
