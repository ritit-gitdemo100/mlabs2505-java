//Inheritance with methods
{
    class Personal{
        name:string
        age:number
        city:string
        
        constructor(name:string, age:number, city:string){
            this.name = name
            this.age= age
            this.city= city
        }

        disp(){
            console.log("name =",this.name)
            console.log("age =",this.age)
            console.log("city =",this.city)
        }
    }

    class Studs extends Personal{
        roll:number
        mark:number

        constructor(name:string, age:number, city:string, roll:number, mark:number){
            super(name,age,city)
            this.roll = roll
            this.mark= mark
        }

        disp(){
            console.log("roll =",this.roll)
            super.disp()
            console.log("mark =",this.mark)
        }
    }

    var st3 = new Studs("Gayathri",19,"Chennai",103,95.5)
    
    st3.disp()

}