//Passing Arrays to a function

function disp1(arr_names:string[]) {
    for(var i = 0;i<arr_names.length;i++) { 
       console.log(names[i]) 
    }  
 } 

var names:string[] = new Array("Mary","Tom","Jack","Jill")  
disp1(names)