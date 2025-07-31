import { useEffect, useState } from "react";

export default function P62Fetch(){

    const [data, setData] = useState(null)
    const [error, setError] = useState(null)
    const [loading, setLoading] = useState(true)

    useEffect( () => {
        fetch('https://jsonplaceholder.typicode.com/posts')
        .then( (response) => {
            console.log(response)
            if(!response.ok){
                throw new Error("Error Fetching data")
            }
            return response.json();
        })
        .then( (data) => {
            setData(data)
            setLoading(false)
        })
        .catch( (error) => {
            console.log(error)
            setError(error.message)
            setLoading(false)
        })
    })


    if(loading){
        return <p>Loading...</p>
    }

    if(error){
        return <p>Error : {error}</p>
    }

    return (
        <div>
            <h1>Post Titles</h1>
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