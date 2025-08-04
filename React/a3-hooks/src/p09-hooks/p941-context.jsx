import React, { createContext, useContext } from 'react';

// 1️ Create context
const UserContext = createContext();

// 2️ Create Provider
function UserProvider({ children }) {

  const user = { name: 'Alice', age: 28 };
  
  return (
    <UserContext.Provider value={user}>
      {children}
    </UserContext.Provider>
  );
}

// 3️ Use context in any component
function Greeting() {
  const user = useContext(UserContext);
  return <p>Hello, {user.name}!</p>;
}

function Profile() {
  const user = useContext(UserContext);
  return <p>Age: {user.age}</p>;
}

// App uses the provider to wrap all components that need access
function P94Context() {
  return (
    <UserProvider>
      <h1>useContext Demo</h1>
      <Greeting />
      <Profile />
    </UserProvider>
  );
}

export default P94Context;
