import React, { useState } from "react";
import P912Child from "./p912-child";

function P91LifeCyle() {

  const [show, setShow] = useState(true);

  return (
    <div>
      <button onClick={() => setShow((prev) => !prev)}>
        {show ? "Unmount Component" : "Mount Component"}
      </button>
      {show && <P912Child />}
    </div>
  );
}

export default P91LifeCyle;
