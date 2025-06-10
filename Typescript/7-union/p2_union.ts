function disp2(qty:string|number) //formal arg
{
    if(typeof qty == "number")
        console.log(qty," kgs")
    else
        console.log(qty)
}


disp2(25)
disp2("350 gms")
disp2("2 liters")