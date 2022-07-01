import logo from './logo.svg';
import './App.css';
import React, {useState} from 'react';
import Person from './Person';

function App() {
  // return (
  //   <div className="App">
  //     <header className="App-header">
  //       <img src={logo} className="App-logo" alt="logo" />
  //       <p>
  //         Edit <code>src/App.js</code> and save to reload.
  //       </p>
  //       <a
  //         className="App-link"
  //         href="https://reactjs.org"
  //         target="_blank"
  //         rel="noopener noreferrer"
  //       >
  //         Learn React
  //       </a>
  //     </header>
  //   </div>
  // );

  // return React.createElement('div', null, "hello world");

  const initialState = {
    persons: [
      {fname:'nirmal6', lname:"silwal4"},
      {fname:'hello3', lname:"world2"}
    ]
  }
 
  // let restult =  useState(initialState);
  // const personState = restult[0];
  // const setPersonState = restult[1];

  let[personState, setPersonState] = useState(initialState);

  // return(
  //   <div className='App'>
  //     <Person fname={personState.persons[0].fname} lname="silwal"/>     

  //     <Person fname={personState.persons[1].fname} lname="silwal"/>     
        
  //   </div>
  // )

  // return(
  //   <div className='App'>
  //     <Person fname="1nirmal1" lname="silwal"/>     
  //     <Person fname="helo" lname="world"/>  
  //     <Person fname="Test" lname="testt" />   
  //   </div>
  // )

  return(
    <div className='App'>
      {
        personState.persons.map((item)=>{
          return(
            <Person fname={item.fname} lname={item.lname} />
          )
        })
      }
    </div>
  )
}

export default App;