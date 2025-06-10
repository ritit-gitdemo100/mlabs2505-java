class Book {

    //fields
    bookid:number
    name:string
    author:string

    //constructor
    constructor(a:number, b:string, c:string){
        this.bookid = a
        this.name = b
        this.author = c
    }

    //function
    disp():void{
        console.log(this.bookid)
        console.log(this.name)
        console.log(this.author)
    }
}

var b1 = new Book(1121,"Mastering Angular","Mark David")
b1.disp();