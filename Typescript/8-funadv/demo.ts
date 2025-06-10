function add(...arr:number[]){
    
    var sum:any = 0;

    for(var i in arr)
    {
        sum += arr[i];
    }
        
    console.log(sum)
}


add(2,3)
add(2,3,4)
add(2,3,4,5)
add(1,2,3,4,5,6,7,8,9,10)