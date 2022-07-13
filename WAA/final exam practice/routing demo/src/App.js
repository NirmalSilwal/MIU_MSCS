import About from "./About";
import "./App.css";
import Nav from "./Nav";
import Shop from "./Shop";
import { BrowserRouter, Switch, Route, Routes } from "react-router-dom";

function App() {
  return (
    <BrowserRouter>
      <div className="app">
        <Nav />
        <Routes>
          <Route path="/about" element={<About />} />
          <Route path="/shop" element={<Shop />} />
        </Routes>
      </div>
    </BrowserRouter>
  );
}

export default App;
