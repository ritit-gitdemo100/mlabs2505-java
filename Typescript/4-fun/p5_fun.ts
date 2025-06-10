var m1:number = 40
var m2:number = 30
var m3:number = 60

var tot:number = total(m1,m2,m3)
console.log("Total :",tot)

var avg:number = average(tot)
console.log("Average :",avg)

var resu:string = result(m1,m2,m3)
console.log("Result :",resu)

function total(m1:number, m2:number, m3:number):number{
    return m1+m2+m3
}

function average(tot:number):number{
    return tot/3.0;
}

function result(m1:number, m2:number, m3:number):string{
    if(m1>=35 && m2>=35 && m3>=35)
        return 'pass'
    else
        return 'fail'
}
