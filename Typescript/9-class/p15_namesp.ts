namespace numbers{
    export function add(x:number, y:number){
        return x+y;
    }
}
namespace strings{
    export function add(x:string, y:string){
        return x+y;
    }
}

var a = numbers.add(5,15)
console.log(a)

var b = strings.add("Raja","Ram");
console.log(b)
