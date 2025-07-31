function fun2(event) {
    console.log("Target : ")
    console.log(event.target)
    console.log("Type : ")
    console.log(event.type)
    console.log("Event : ")
    console.log(event)

    return <p>Check Console</p>

}

export default function P22Event(){
    return (
        <>
            <hr />
            <button className="btn btn-danger" onClick={fun2}>Event Details</button>
        </>
    );
}