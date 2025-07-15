import { useState } from "react"

export default function P1State() {

    const [status, setStatus] = useState("Placed")

    const dispatch = () => setStatus("Dispatched")

    return (
        <>
            <h2>Order Status : {status}</h2>
            <button onClick={dispatch}>Dispatch</button>
        </>
    )

}