import axios from "axios";
import { useEffect, useState } from "react";

export default function P63Axios(){

    const [data, setData] = useState(null)
    const [error, setError] = useState(null)
    const [loading, setLoading] = useState(true)

    useEffect( () => {
        axios
        .get('https://jsonplaceholder.typicode.com/posts1')
        .then( (response) => {
            console.log(response)
            setData(response.data)
            setLoading(false)
        })
        .catch( (error) => {
            console.log(error)
            setError(error.message)
            setLoading(false)
        })
    }, [])


    if(loading){
        return <p>Loading...</p>
    }

    if(error){
        return <p>Error : {error}</p>
    }

    return (
        <div>
            <h1>Post Titles using Axios</h1>
            <ul>
                {
                    data.map( (post) => (
                        <li key={post.id}>{post.title}</li>
                    ))
                }
            </ul>
        </div>
    )

}