import React, { useEffect, useState } from "react";
import Header from "./Header";

function Body() {
  const [posts, setPosts] = useState([]);

  useEffect(() => {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((response) => {
        return response.json();
      })
      .then((postLists) => {
        setPosts(postLists);
      });
  }, []);

  console.log(posts);

  return (
    <div>
      <h1>body</h1>
      {posts.map((p) => {
        return (
          <div>
            <h1>{p.title}</h1>
            <p>{p.body}</p>
          </div>
        );
      })}
      {/* <Header /> */}
    </div>
  );
}

export default Body;
