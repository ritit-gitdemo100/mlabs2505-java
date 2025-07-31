
function fun1() {
    return alert("Welcome to React Events")
}

export default function P21Event(){
    return (
        <button className="btn btn-success" onClick={fun1}> Click Me</button>
    )
}