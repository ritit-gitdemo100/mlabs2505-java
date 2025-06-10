class Emp {

    //fields
    empid:number
    name:string
    salary:number

    //function
    get(a:number, b:string, c:number){
        this.empid = a
        this.name = b
        this.salary = c
    }

    disp(){
        console.log()
        console.log(this.empid)
        console.log(this.name)
        console.log(this.salary)
    }
}

var e1 = new Emp();
e1.get(121,"Gayathri",34000)
e1.disp();

var e2 = new Emp();
e2.get(145,"Anand",28000)
e2.disp()