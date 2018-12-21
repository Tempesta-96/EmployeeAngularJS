import { Http, Headers } from '@angular/http';

var html = angular.module('myApp', []);
html.controller('myCtrl', function ($scope, $http){
    $http.get()
});