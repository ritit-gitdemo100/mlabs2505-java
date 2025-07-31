import { useState } from "react";

export default function P33State(){

    const [stud, setStud] = useState(
        {
            roll:102,
            name:'Abdul',
            mark:88.5
        }
    )

    const updateMark = () => {
        setStud( (prevStud) => (
            {
                ...prevStud,
                mark:100
            }
        ) )
    }


    return (
        <>
            <h2>Student Details</h2>
            <p>Roll : {stud.roll}</p>
            <p>Name : {stud.name}</p>
            <p>Mark : {stud.mark}</p>
            <button onClick={updateMark}>Update Mark</button>
        </>
    )
}