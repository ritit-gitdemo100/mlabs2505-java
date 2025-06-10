/*
    An object is an instance which contains set of key value pairs. 
    The values can be scalar values or functions or even array of other objects. 
    
    var object_name = { 
        key1: “value1”, //scalar value 
        key2: “value”,  
        key3: function() {
            //functions 
        }, 
    key4:[“content1”, “content2”] //collection  
    };
*/

var stud = {
    roll:101,
    name:"ramu",
    marks:[35,46,57,68],
    disp:function(){
        console.log(stud.roll)
        console.log(stud.name)
        for(var i=0;i<stud.marks.length;i++)
            console.log(stud.marks[i])  
    }
};

stud.disp()