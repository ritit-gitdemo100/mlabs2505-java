
//var keyword have function scope (accessible anywhere in the function)
function var_demo()
{
    var a = 5; //available globally inside this function
    if(true)
    {
        var b = 6; //available globally inside this function
        console.log("var demo inside if block");
        console.log("a  = "+a+"\tb = "+b);
    }
    console.log("var demo outside if block");
    console.log("a  = "+a+"\tb = "+b);
}

//let keyword have block scope (accessible only within the block)
function let_demo()
{
    let a = 5; //available globally inside this function
    if(true)
    {
        let b = 6; //available only within this block
        console.log("let demo inside if block");
        console.log("a  = "+a+"\tb = "+b);
    }
    console.log("let demo outside if block");
    console.log("a  = "+a);
    //console.log("b = "+b);
}

var_demo();
let_demo();
//console.log("outside the function");
//console.log("a  = "+a+"\tb = "+b);