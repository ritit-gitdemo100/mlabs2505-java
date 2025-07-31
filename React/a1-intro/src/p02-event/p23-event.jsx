
function fun1(name) {
    return alert("Welcome " + name)
}

export default function P23Event() {
    return (
        <>
            <hr />
            <button className="btn btn-warning" onClick={() => fun1('Ganesh')}>Click Me</button>
        </>
    );
}