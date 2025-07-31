
function Home(){
    return (
        <p>Welcome to Home Page</p>
    );
}

function Invalid(){
    return (
        <p>You have to Login</p>
    );
}

export default function P15Args( {isAuth}){
    return (
        isAuth  ? <Home />  : <Invalid/>
    );
}