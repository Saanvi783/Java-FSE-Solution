// List component and keys
import React from 'react';

function ListAndKeys_Solution() {
  const items = ['React', 'Angular', 'Vue'];
  return (
    <ul>
      {items.map((item, idx) => (
        <li key={idx}>{item}</li>
      ))}
    </ul>
  );
}

export default ListAndKeys_Solution;
