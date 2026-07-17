// React forms validation
import React, { useState } from 'react';

function FormsValidation_Solution() {
  const [email, setEmail] = useState('');
  const [error, setError] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    if (!email.includes('@')) {
      setError('Invalid email address');
    } else {
      setError('');
      console.log('Valid Submission');
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <input type="text" value={email} onChange={e => setEmail(e.target.value)} />
      {error && <span style={{ color: 'red' }}>{error}</span>}
      <button type="submit">Submit</button>
    </form>
  );
}

export default FormsValidation_Solution;
