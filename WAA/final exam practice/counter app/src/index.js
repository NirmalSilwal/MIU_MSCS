import React from "react";
import ReactDOM from "react-dom/client";
import "./index.css";
import App from "./App";

import { createStore } from "redux";

// STORE - globalized state

// ACTION - describes what you wanna do
// function that return an Object
const increment = () => {
  return {
    type: "INCREMENT",
  };
};

const decrement = () => {
  return {
    type: "DECREMENT",
  };
};

// REDUCER - describes how action transform the state into the next state

const counter = (state = 0, action) => {
  switch (action.type) {
    case "INCREMENT":
      return state + 1;
    case "DECREMENT":
      return state - 1;
  }
};

// creating STORE 
let store = createStore(counter);

// display in the console
store.subscribe(() => console.log(store.getState()));

// DISPATCH - dispatch this action to the reducer
store.dispatch(increment());

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);
