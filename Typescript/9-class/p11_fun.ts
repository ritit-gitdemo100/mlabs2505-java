{
   

var stu = {
    roll:101,
    name:"ramu",
    mark:83.44,
    disp:function(){
        console.log(this.roll)
        console.log(this.name)
        console.log(this.mark)
    }

};

stu.disp()
}