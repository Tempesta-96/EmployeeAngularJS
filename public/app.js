

var app = angular.module('selectOpt', []);

app.controller('addController', function ($scope, $http) {
  $scope.addShow = false;
  // $scope.designation = ["Programmer", "Consultant", "Toilet Cleaner", "Pantry IC"];
  $scope.addClick = function () {
    $scope.addShow = !$scope.addShow;
  }
  $scope.addEmployeeResult = false;

  var url = "http://localhost:8090/EmpProject/AddEmpServlet"
  $scope.addSubmit = function () {
    let x = [$scope.empName, $scope.empDesignation, $scope.empAge, $scope.empSalary];
    let emp = {
      "name": $scope.empName,
      "designation": $scope.empDesignation,
      "age": $scope.empAge,
      "salary": $scope.empSalary
    }
    // url = url + "name=" + x[0] + "&designation=" + x[1] + "&age=" + x[2] + "&salary=" + x[3]
    $http({
      method: 'POST',
      url: url,
      data: JSON.stringify(emp)
    })
      .then(function successCallback(response) {
        let emp = response.data;
        $scope.addEmployeeResult = true;
        $scope.empId = emp.id;
        $scope.empName = emp.name;
        $scope.empDesignation = emp.designation;
        $scope.empSalary = emp.salary;
        $scope.empAge = emp.age;
      }, function errorCallback(response) {
        console.log(response)
      });
  }
  

  $scope.addReset = function () {
    $scope.addEmployeeResult = false;
    $scope.empId = "";
    $scope.empName = "";
    $scope.empDesignation = "";
    $scope.empAge = "";
    $scope.empSalary = "";
  }
});

app.controller('deleteController', ['$scope', function ($scope) {
  $scope.deleteShow = false;
  $scope.deleteClick = function () {
    $scope.deleteShow = !$scope.deleteShow;
  }
}]);

app.controller('updateController', ['$scope', function ($scope) {
  $scope.updateShow = false;
  $scope.updateClick = function () {
    $scope.updateShow = !$scope.updateShow;
  }
}]);