import React from "react";

class P912Child extends React.Component {

  // Constructor is called **first** when the component is created.
  // Use this to initialize state and bind methods.
  constructor(props) {
    super(props);
    this.state = {
      count: 0,
    };
    console.log("constructor");
  }

  // Called **before every render**, both on mount and update.
  // Use this to update state based on changed props (rarely needed).
  static getDerivedStateFromProps(props, state) {
    console.log("getDerivedStateFromProps");
    return null; // returning null means no change to state
  }

  // Called **once only after the first render** (component mounted).
  // Good for API calls, subscriptions, or timers.
  componentDidMount() {
    console.log("componentDidMount");
  }

  // Called **before every re-render** due to props/state change.
  // Used to decide whether to re-render or not.
  shouldComponentUpdate(nextProps, nextState) {
    console.log("shouldComponentUpdate");
    return true; // return false to skip rendering
  }

  // Called **just before DOM updates**, after render but before changes are flushed.
  // You can capture information (like scroll position) before it's updated.
  getSnapshotBeforeUpdate(prevProps, prevState) {
    console.log("getSnapshotBeforeUpdate");
    return `Previous count was ${prevState.count}`; // returned value is passed to componentDidUpdate
  }

  // Called **after updates** are flushed to the DOM.
  // Good for responding to DOM changes, making API calls based on previous state/props.
  componentDidUpdate(prevProps, prevState, snapshot) {
    console.log("componentDidUpdate");
    console.log("Snapshot from before update:", snapshot);
  }

  // Called **right before the component is removed** from the DOM.
  // Use this to clean up (remove timers, event listeners, etc.).
  componentWillUnmount() {
    console.log("componentWillUnmount");
  }

  // The only required method in a class component.
  // Called during mounting and updating to describe what to render.
  render() {
    console.log("render");
    return (
      <div>
        <h2>React Lifecycle Demo</h2>
        <p>Count: {this.state.count}</p>
        <button onClick={() => this.setState({ count: this.state.count + 1 })}>
          Increase Count
        </button>
        <button onClick={() => this.setState({ count: 0 })}>
          Reset Count
        </button>
      </div>
    );
  }
}

export default P912Child;
