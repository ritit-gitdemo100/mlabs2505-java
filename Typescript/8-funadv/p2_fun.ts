//Rest parameters (...variable:type[]) don’t restrict 
//the number of values that you can pass to a function.
//Rest must be the last parameter

function stud1(roll:number, name:string, ...mark:number[]) { 
    console.log("\nRoll:", roll,"Name",name); 
    console.log("marks",...mark); 
    
    var i:any
    var total:number = 0

    for(i in mark){
        total += mark[i]
    }
    console.log("Total",total)
 }

 stud1(101,"Raj",70);
 stud1(102,"Ravi",70,80,90);
 stud1(103,"Divya",50,60,70,80,90);