import { useState } from "react"

export default function P3State() {

    const [stud, setStud] = useState({
        roll:102,
        name:"Rishi",
        mark:96.5
    })
 
    const update = () => {
        setStud(
            ...stud,
            mark = 100
        )
    }

    return (
        <>
            <h2>Trainee Details</h2>
            <p>Roll : {stud.roll}</p>
            <p>Name : {stud.name}</p>
            <p>Mark : {stud.mark}</p>

            <button onClick={update}>Update Student</button>
        </>
    )

}