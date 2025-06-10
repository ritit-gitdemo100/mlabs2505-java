//Inheritance with methods
{
    class Personal{
        name:string
        age:number
        city:string
        
        getPersonal(name:string, age:number, city:string){
            this.name = name
            this.age= age
            this.city= city
        }

        dispPersonal(){
            console.log("name =",this.name)
            console.log("age =",this.age)
            console.log("city =",this.city)
        }
    }

    class Studs extends Personal{
        roll:number
        mark:number

        getStud(roll:number, mark:number){
            this.roll = roll
            this.mark= mark
        }

        dispStud(){
            console.log("roll =",this.roll)
            console.log("mark =",this.mark)
        }
    }

    var st2 = new Studs();
    
    st2.getPersonal("Gayathri",19,"Chennai")
    st2.getStud(103,95.5)
    
    st2.dispPersonal()
    st2.dispStud()

}