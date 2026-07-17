// ES6 map method, arrow functions, destructuring
import React from 'react';

function ES6Features_Solution() {
  const users = [{ id: 1, name: 'Alice' }, { id: 2, name: 'Bob' }];
  return (
    <div>
      <h2>ES6 Features Demo</h2>
      {users.map(({ id, name }) => (
        <p key={id}>User ID: {id}, Name: {name}</p>
      ))}
    </div>
  );
}

export default ES6Features_Solution;
