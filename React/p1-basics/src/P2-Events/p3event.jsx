
export default function Event3() {


    const greet = (name) => {
        alert("Welcome "+name+" to React Events")
      
    }

    const greetName = ()=>greet("Sushma");

    return <button onClick={greetName}>Click Me</button>
}