import React, { useState } from "react";
import axios from "axios";

function App() { 
  const url = "http://backend-connection/comment";

  const [data, setData] = useState({
    name: "",
    email: "",
    comment: ""
  });

  function handle(e) {
    const newData = {...data};
    newData[e.target.id] = e.target.value;
    setData(newData);
  }

  function submit(e) {
    e.preventDefault();
    axios.post(url, data);
  }

  return (
      <div className="form-container">
          <form className="register-form" onSubmit={(e) => submit(e)}>
            <input
              onChange={(e) => handle(e)}
              value={data.name}
              id="name"
              className="form-field"
              type="text"
              required="required"
              maxLength={40}
              placeholder="Name"
              name="name"
            />
            <input
              onChange={(e) => handle(e)}
              value={data.email}
              id="email"
              className="form-field"
              type="email"
              required="required"
              maxLength={40}
              placeholder="Email"
              name="email"
            />
            <textarea
              onChange={(e) => handle(e)}
              value={data.comment}
              id="comment"
              className="form-field"
              type="text"
              required="required"
              maxLength={200}
              placeholder="Comment"
              name="comment"
            />
            <button className="form-field" type="submit">
              Send
            </button>
            <button 
              className="form-field" 
              type="button"
              onClick={(e) => {
                e.preventDefault();
                window.location.href=url;
              }}
            >
                  View Comments
            </button>
          </form>
        </div>
  );
}

export default App;
