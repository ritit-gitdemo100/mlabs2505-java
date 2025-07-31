import { useState } from "react";

export default function P32State(){

    const [roll, setRoll] = useState(101)
    const [name, setName] = useState("Mary")
    const [mark, setMark] = useState(55.5)

    return (
        <>
            <h2>Student Details</h2>
            <p>Roll : {roll}</p>
            <p>Name : {name}</p>
            <p>Mark : {mark}</p>
        </>
    )
}