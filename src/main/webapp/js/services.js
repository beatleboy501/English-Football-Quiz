'use strict';

/* Services */

var services = angular.module('quiz.services', ['ngResource']);

services.factory('QuizFactory', function ($resource) {
    return $resource('/quiz/rest/questions', {}, {
        query: {
            method: 'GET',
            params: {},
            isArray: false
        }
    })
});
