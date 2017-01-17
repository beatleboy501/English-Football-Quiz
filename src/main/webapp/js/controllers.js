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

//app.controller('ResultController', ['$scope', 'ResultFactory', function($scope, ResultFactory) {
//    ResultFactory.get({}, function(resultFactory) {
//        $scope.title = resultFactory.title;
//        $scope.numberofquestions = resultFactory.numberOfQuestions;
//        $scope.score = resultFactory.score;
//    })
//}]);

app.controller('QuizController', ['$scope', '$http', 'QuizFactory', function ($scope, $http, QuizFactory) {
    QuizFactory.get({}, function (quizFactory) {
        $scope.title = quizFactory.title;
        $scope.numberofquestions = quizFactory.numberOfQuestions;
        $scope.questions = quizFactory.questions;
        $scope.submit = function() {
            $http({
                url: '/rest/results',
                method: 'POST',
                data: { title: $scope.title, questions: $scope.questions }
            }).success(function (data) {
                alert('successful');
            });
        }
    })
}]);
