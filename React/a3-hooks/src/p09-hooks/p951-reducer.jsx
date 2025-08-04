import React, { useReducer } from 'react';

// 1️ Define reducer function
function counterReducer(state, action) {
  switch (action.type) {
    case 'increment':
      return { count: state.count + 1 };
    case 'reset':
      return { count: 0 };
    default:
      return state;
  }
}

// 2️ useReducer in your component
function P95Reducer() {
  const [state, dispatch] = useReducer(counterReducer, { count: 0 });

  return (
    <div style={{ padding: '2rem' }}>
      <h1>useReducer Demo</h1>
      <h2>Count: {state.count}</h2>

      {/* 3️ Dispatch actions */}
      <button onClick={() => dispatch({ type: 'increment' })}> Increment </button>
      <button onClick={() => dispatch({ type: 'reset' })} style={{ marginLeft: '1rem' }}>
        Reset
      </button>
    </div>
  );
}

export default P95Reducer;
