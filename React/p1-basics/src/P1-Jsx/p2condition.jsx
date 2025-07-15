
function Greeting({ isLoggedIn }) {
  return (
    <div>
      {isLoggedIn 
      ? <h1>Welcome back!</h1> 
      : <>
      <h1 style={{backgroundColor:'yellow', color:'red'}}>Please log in.</h1>
      <p>The current time is {new Date().toLocaleTimeString()}</p>
      </>
      }
    </div>
  );
}

export default Greeting;
