import React, { useState } from 'react';

function SimpleForm() {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');

  const handleNameChange = (event) => {
    setName(event.target.value);
    console.log(name)
  };

  const handleEmailChange = (event) => {
    setEmail(event.target.value);
    console.log(email)
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    console.log(name+" : "+email)
    alert(`Name: ${name}, Email: ${email}`);
  };

  return (
    <div>
      <h1>React Form</h1>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Name: </label>
          <input
            type="text"
            value={name}
            onChange={handleNameChange}
          />
        </div>
        <div>
          <label>Email: </label>
          <input
            type="email"
            value={email}
            onChange={handleEmailChange}
          />
        </div>
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default SimpleForm;
