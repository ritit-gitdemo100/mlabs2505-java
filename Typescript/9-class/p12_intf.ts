{
   
    interface IStud{
        roll:number,
        name:string,
        mark:number,
        disp:()=>void
    }

    var st:IStud = {
        roll:101,
        name:"ramu",
        mark:83.44,
        disp:function(){
            console.log(this.roll)
            console.log(this.name)
            console.log(this.mark)
        }
    
    };
    
    st.disp()
    }