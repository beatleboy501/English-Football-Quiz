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


app.controller('MyCtrl1', ['$scope', 'QuizFactory', function ($scope, QuizFactory) {
    $scope.bla = 'bla from controller';
    QuizFactory.get({}, function (quizFactory) {
        $scope.title = quizFactory.title;
    })
}]);
