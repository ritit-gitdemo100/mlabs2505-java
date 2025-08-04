import React, { useState } from "react";
import P922Child from "./p922-child";

function P92Hooks() {

  const [show, setShow] = useState(true);

  return (
    <div>
      <button onClick={() => setShow((prev) => !prev)}>
        {show ? "Unmount Component" : "Mount Component"}
      </button>
      {show && <P922Child />}
    </div>
  );
}

export default P92Hooks;
