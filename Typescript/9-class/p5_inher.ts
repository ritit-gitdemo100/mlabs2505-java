class Personal{
    name:string
    age:number
    city:string
}

class Studs extends Personal{
    roll:number
    mark:number
}

var st1 = new Studs();
st1.roll = 101
st1.name = "Ravi"
st1.age = 19
st1.mark = 89.5
st1.city = "Chennai"

console.log(st1.roll)
console.log(st1.name)
console.log(st1.age)
console.log(st1.mark)
console.log(st1.city)