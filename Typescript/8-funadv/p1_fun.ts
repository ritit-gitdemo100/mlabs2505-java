//Optional parameters '?' can be used when arguments 
//need not be compulsorily passed for a function’s execution.

function disp(roll:number, name:string, mark?:number) { 
    console.log("\nRoll:", roll); 
    console.log("Name",name); 
    
    if(mark != undefined)  
        console.log("Mark",mark); 
 }

 disp(101,"Raj")
 disp(102,"Ravi",89.5)