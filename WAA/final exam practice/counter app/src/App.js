import { createContext, useState } from "react";
import "./App.css";
import Body from "./Body";

export const CountContext = createContext();

function App() {
  const [count, setCount] = useState(0);

  return (
    <CountContext.Provider value={{ count, setCount }}>
      <div className="App">
        <h1>redux learning</h1>
        <Body />
      </div>
    </CountContext.Provider>
  );
}

export default App;
