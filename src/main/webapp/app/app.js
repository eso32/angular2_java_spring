angular.module("myApp", []);

angular.module("myApp").controller("mainCtrl", function($scope, $http){
    $scope.idk;
    $scope.name;
    $scope.desc;

    $scope.sendGet = function(){
        $http.get('http://localhost:8090/topics').
                then(function(response) {
                    $scope.topics = response.data;
                });
    }


    $scope.sendPost = function (){
        $scope.toBeSend = {
                              id: $scope.idk,
                              name: $scope.name,
                              description: $scope.desc
                          };

        console.log('Func invoked');
        console.log($scope.toBeSend);
        $http.post('http://localhost:8090/topics', $scope.toBeSend).
                then(function(response) {
                    console.log(response);
                    $scope.post = response;
                });
    }


});