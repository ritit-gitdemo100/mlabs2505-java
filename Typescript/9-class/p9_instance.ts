{
    class Personal{ 
        name:string
        age:number
        city:string
    } 
    
    var obj = new Personal() 
    var isPersonal = obj instanceof Personal; 
    console.log(" obj is an instance of Personal " + isPersonal);

}