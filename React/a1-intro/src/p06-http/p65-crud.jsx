import React, { useState, useEffect } from 'react';
import axios from 'axios';

export default function P65Crud() {
  const [data, setData] = useState(null);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);
  const [newPost, setNewPost] = useState({
    title: '',
    body: ''
  });

  useEffect(() => {
    // Fetching data (GET request)
    axios
      .get('https://jsonplaceholder.typicode.com/posts')
      .then((response) => {
        setData(response.data);
        setLoading(false);
      })
      .catch((error) => {
        handleError(error);
      });
  }, []);

  // Handle errors
  const handleError = (error) => {
    if (error.response) {
      setError(`Server responded with status: ${error.response.status}`);
    } else if (error.request) {
      setError('Network error: No response from the server');
    } else {
      setError(`Error: ${error.message}`);
    }
    setLoading(false);
  };

  // Handle POST request
  const handlePost = () => {
    setLoading(true);
    axios
      .post('https://jsonplaceholder.typicode.com/posts', {
        title: newPost.title,
        body: newPost.body,
      })
      .then((response) => {
        setData((prevData) => [...prevData, response.data]);
        setLoading(false);
        setNewPost({ title: '', body: '' }); // Reset form after post
      })
      .catch((error) => handleError(error));
  };

  // Handle PUT request
  const handlePut = (postId) => {
    setLoading(true);
    axios
      .put(`https://jsonplaceholder.typicode.com/posts/${postId}`, {
        title: 'Updated Title', // Example title
        body: 'Updated Body', // Example body
      })
      .then((response) => {
        const updatedData = data.map((post) =>
          post.id === postId ? { ...post, ...response.data } : post
        );
        setData(updatedData);
        setLoading(false);
      })
      .catch((error) => handleError(error));
  };

  // Handle DELETE request
  const handleDelete = (postId) => {
    setLoading(true);
    axios
      .delete(`https://jsonplaceholder.typicode.com/posts/${postId}`)
      .then(() => {
        const filteredData = data.filter((post) => post.id !== postId);
        setData(filteredData);
        setLoading(false);
      })
      .catch((error) => handleError(error));
  };

  if (loading) {
    return <p>Loading...</p>;
  }

  if (error) {
    return <p>Error: {error}</p>;
  }

  return (
    <div>
      

      <h2>Create a new post</h2>
      <form
        onSubmit={(e) => {
          e.preventDefault();
          handlePost();
        }}
      >
        <input
          type="text"
          placeholder="Title"
          value={newPost.title}
          onChange={(e) => setNewPost({ ...newPost, title: e.target.value })}
        /> <br />
        <textarea
          placeholder="Body"
          value={newPost.body}
          onChange={(e) => setNewPost({ ...newPost, body: e.target.value })}
        /> <br />
        <button type="submit">Submit</button>
      </form>

      <h1>Posts</h1>
      <ul>
        {data.map((post) => (
          <li key={post.id}>
            {post.title} 
            <button onClick={() => handlePut(post.id)}>Update</button>
            <button onClick={() => handleDelete(post.id)}>Delete</button>
          </li>
        ))}
      </ul>
    </div>
  );
}

