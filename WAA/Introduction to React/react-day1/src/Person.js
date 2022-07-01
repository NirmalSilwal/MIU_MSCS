import React  from "react";

// creating Component
function Person(props) {
    return(
    <div>
       <h1>{props.fname}</h1>
       <h3>{props.lname}</h3>
</div>
    )
}

export default Person;