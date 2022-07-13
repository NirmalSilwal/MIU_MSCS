import React, { useContext, useEffect, useState } from "react";
import { CountContext } from "./App";

function Header() {
  const { count, setCount } = useContext(CountContext); // consumer
  const [value, setValue] = useState(count);

  useEffect(() => {
    setCount(count + 1);
  }, [value]);

  return (
    <div>
      {count}
      <button
        onClick={() => {
          setValue(value + 1);
        }}
      >
        Click{" "}
      </button>
    </div>
  );
}

export default Header;
