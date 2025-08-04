// App.js
import React, { useState, useMemo } from 'react';

function P93Memo() {
  
  const [number, setNumber] = useState(0);
  const [darkTheme, setDarkTheme] = useState(false);

  const slowFunction = (num) => {
    console.log('Calling slow function...');
    for (let i = 0; i <= 1e8; i++) {} // simulate slow calc
    return num * 2;
  };

  // const doubleNumber = () => {
  const doubleNumber = useMemo(() => {
    return slowFunction(number);
  },[number]);
  // };

  const themeStyles = {
    backgroundColor: darkTheme ? '#333' : '#fff',
    color: darkTheme ? '#fff' : '#000',
    padding: '1rem',
    marginTop: '1rem'
  };

  return (
    <div>
      <input
        type="number"
        value={number}
        onChange={(e) => setNumber(parseInt(e.target.value))}
      />
      <button onClick={() => setDarkTheme(prev => !prev)}>
        Toggle Theme
      </button>
      {/* <div style={themeStyles}>Double: {doubleNumber()}</div> */}
      <div style={themeStyles}>Double: {doubleNumber}</div>
    </div>
  );
}

export default P93Memo;
