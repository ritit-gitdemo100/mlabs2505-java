/*Function parameters can also be assigned values by default. 
It must be last argument
cannot be declared optional and default at the same time.
*/

function disp_stud(roll:number, name:string, city:string = "Chennai")
{
    console.log("Roll:",roll," Name:",name," City:",city)
}

disp_stud(101,"Raj")
disp_stud(102,"Gayathri","Madurai")
disp_stud(103,"Anand")