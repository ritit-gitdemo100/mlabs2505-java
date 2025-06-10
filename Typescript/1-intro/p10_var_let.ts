//we can declare same variable name many times with var declaration 
var num1;
var num1;

//we cannot redeclare a variable using let declaration
let num2;
//let num2;


//Shadowing: Redeclaring the variable in nested block
function disp()
{
    var num = 10;
    console.log("Before if num = "+num);
    if(true)
    {
        var num = 20; //outer variable becomes unavailable
        console.log("Inside if num = "+num);
    }
    console.log("Outside if num = "+num);
}

disp();