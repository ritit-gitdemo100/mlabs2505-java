import { useEffect, useState } from "react";

export default function P64Async() {

    const [data, setData] = useState(null)
    const [error, setError] = useState(null)
    const [loading, setLoading] = useState(true)

    useEffect(() => {

        async function fetchData() {
            try {
                const response = await fetch('https://jsonplaceholder.typicode.com/posts')

                if (!response.ok) {
                    throw new Error("Error Fetching data")
                }

                const data = await response.json();
                console.log(data)
                setData(data)
                setLoading(false)
            }
            catch (error) {
                console.log(error)
                setError(error.message)
                setLoading(false)
            }
        }

    })


    if (loading) {
        return <p>Loading...</p>
    }

    if (error) {
        return <p>Error : {error}</p>
    }

    return (
        <div>
            <h1>Post Titles</h1>
            <ul>
                {
                    data.map((post) => (
                        <li key={post.id}>{post.title}</li>
                    ))
                }
            </ul>
        </div>
    )

}