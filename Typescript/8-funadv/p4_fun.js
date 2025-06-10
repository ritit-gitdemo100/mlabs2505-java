//anonymous function
//normal function parses before execution
//anonymous function parses only at runtime
var greet = function () {
    console.log("Greetings from RIT");
};
greet();
//With Arguments and Return value
var add1 = function (x, y) {
    return x + y;
};
var sum = add1(5, 3);
console.log(sum);
