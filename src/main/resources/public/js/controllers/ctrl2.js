
var appController2 = function($scope, $log){

  $scope.entradaNombre = "carlos";

  $scope.nombreChange = function(nombre){
    $log.info(nombre);
  }

}


myApp.controller("myctrl2", appController2);
