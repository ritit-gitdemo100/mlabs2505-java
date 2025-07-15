
export default function Event2() {


    const greet = (name) => {
        alert("Welcome "+name+" to React Events")
      
    }

    return <button onClick={()=>greet("Bala")}>Click Me</button>
}