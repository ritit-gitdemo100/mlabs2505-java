{
    class Emp {
        empid:number
        name:string
        salary:number
        static company:string = "ABC Company"
        
        //function
        get(a:number, b:string, c:number){
            this.empid = a
            this.name = b
            this.salary = c
        }

        disp(){
            console.log(this.empid)
            console.log(this.name)
            console.log(this.salary)
            console.log(Emp.company)
        }
        static dline(){
            console.log("*******************")
        }
    }

    var e3 = new Emp();
    e3.get(121,"Gayathri",34000)

    var e4 = new Emp();
    e4.get(145,"Anand",28000)

    Emp.dline();
    e3.disp();
    Emp.dline();
    e4.disp()
    Emp.dline();
}