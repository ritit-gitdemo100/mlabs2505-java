import { useNavigate } from "react-router-dom";

export default function Services() {
    const navigate = useNavigate();

    const handleSubmit = () => {
        // Do something then redirect
        navigate('/about');
    };


    return (
        <>
            <h1>Services Page</h1>
            <button onClick={handleSubmit}>Go Home</button>
        </>
    )
}
