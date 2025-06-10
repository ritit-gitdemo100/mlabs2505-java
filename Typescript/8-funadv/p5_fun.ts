//Lambda Expression.


var greet1 = ()=>{ console.log("Greetings from Renault")  }
greet1()

//optional parathesis for single argument
var greet2 = name =>{ console.log("Welcome",name) }
greet2("Krishnan")

//optional curly braces for single statement
var total = (m1,m2,m3) => console.log(m1+m2+m3) 
total(10,20,30)

var addition = (n1,n2)=>n1+n2
console.log(addition(5,6))