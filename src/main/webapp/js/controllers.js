'use strict';

/* Controllers */


var app = angular.module('quiz.controllers', []);


// Clear browser cache (in development mode)
//
// http://stackoverflow.com/questions/14718826/angularjs-disable-partial-caching-on-dev-machine
app.run(function ($rootScope, $templateCache) {
    $rootScope.$on('$viewContentLoaded', function () {
        $templateCache.removeAll();
    });
});


app.controller('QuizController', ['$scope', 'QuizFactory', function ($scope, QuizFactory) {
    QuizFactory.get({}, function (quizFactory) {
        $scope.title = quizFactory.title;
        $scope.numberofquestions = quizFactory.numberOfQuestions;
        $scope.questions = quizFactory.questions;
    })
}]);
