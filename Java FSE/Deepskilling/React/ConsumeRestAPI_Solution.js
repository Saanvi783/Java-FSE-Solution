// Consume REST APIs in React applications
import React, { useEffect, useState } from 'react';

function ConsumeRestAPI_Solution() {
  const [users, setUsers] = useState([]);
  useEffect(() => {
    fetch('https://jsonplaceholder.typicode.com/users')
      .then(res => res.json())
      .then(data => setUsers(data));
  }, []);

  return (
    <div>
      {users.map(u => <p key={u.id}>{u.name}</p>)}
    </div>
  );
}

export default ConsumeRestAPI_Solution;
