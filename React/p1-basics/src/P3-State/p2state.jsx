import { useState } from "react"

export default function P2State() {

    const [roll, setRoll] = useState(101)
    const [name, setName] = useState("Durga")
    const [mark, setMark] = useState(89.5)

    const update = () => {
        setName("Mani Durga")
        setMark(100)
    }

    return (
        <>
            <h2>Trainee Details</h2>
            <p>Roll : {roll}</p>
            <p>Name : {name}</p>
            <p>Mark : {mark}</p>

            <button onClick={update}>Update Student</button>
        </>
    )

}