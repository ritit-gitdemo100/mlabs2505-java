import React, { useState, useEffect, useRef } from "react";

function P922Child() {

  // useState replaces constructor for managing local state
  const [count, setCount] = useState(0);
  console.log("render (functional component)");

  // Ref to store previous value (like getSnapshotBeforeUpdate)
  const prevCountRef = useRef();

  // useEffect with empty dependency array = componentDidMount
  useEffect(() => {
    console.log("componentDidMount");

    return () => {
      // Cleanup function = componentWillUnmount
      console.log("componentWillUnmount");
    };
  }, []);

  // useEffect that runs after every update
  useEffect(() => {
    if (prevCountRef.current !== undefined) {
      console.log("componentDidUpdate");
      console.log("Snapshot (previous count):", prevCountRef.current);
    }

    // Update the ref after update
    prevCountRef.current = count;
  }, [count]); // Runs whenever `count` changes

  return (
    <div>
      <h2>React Hooks Lifecycle Demo</h2>
      <p>Count: {count}</p>
      <button onClick={() => setCount((c) => c + 1)}>Increase</button>
      <button onClick={() => setCount(0)}>Reset Count</button>
    </div>
  );
}

export default P922Child;
