class Num{
    private x:number = 5
    protected y:number = 6
    public z:number = 7

    dispNum():void{
        console.log("Num Class")
        console.log("x = ",this.x)
        console.log("y = ",this.y)
        console.log("z = ",this.z)
    }
}

class Sub extends Num
{
    dispSub():void{
        console.log("Sub Class")
        //console.log("x = ",this.x)
        console.log("y = ",this.y)
        console.log("z = ",this.z)
    }
}

var obj1 = new Sub();
obj1.dispNum()
obj1.dispSub()

console.log("Outside the classes")
//console.log(obj1.x)
//console.log(obj1.y)
console.log(obj1.z)