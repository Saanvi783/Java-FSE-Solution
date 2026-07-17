// React forms and controlled components
import React, { useState } from 'react';

function ReactForms_Solution() {
  const [name, setName] = useState('');
  const handleSubmit = (e) => {
    e.preventDefault();
    console.log("Submitted name:", name);
  };
  return (
    <form onSubmit={handleSubmit}>
      <input type="text" value={name} onChange={e => setName(e.target.value)} />
      <button type="submit">Submit</button>
    </form>
  );
}

export default ReactForms_Solution;
