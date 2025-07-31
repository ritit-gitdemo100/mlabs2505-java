import { useState } from "react";

export default function P31State(){

    const [status, setStatus] = useState("Placed")

    return (
        <>
            <p> Order : {status} </p>
            <button onClick={ ()=>setStatus("Dispatched")}>Dispatched</button>
        </>
    )
}