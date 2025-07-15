
export default function Event1() {


    const greet = (event) => {
        alert("Welcome to React Events")
        console.log('Event Properties : ', event.type, event.target);
        console.log('Event Properties : ', event);
    }

    return <button onClick={greet}>Click Me</button>
}