import useCounter from "./p961-custom";

function P96Custom() {
  const { count, increment, decrement, reset } = useCounter(0);

  return (
    <div>
      <h2>Custom Hook: useCounter</h2>
      <p>Count: {count}</p>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
      <button onClick={reset}>Reset</button>
    </div>
  );
}

export default P96Custom;
