// Element variables and conditional rendering patterns
import React from 'react';

function ConditionalRendering_Solution({ isLoggedIn }) {
  const content = isLoggedIn ? <h2>Welcome Back!</h2> : <h2>Please Log In</h2>;
  return <div>{content}</div>;
}

export default ConditionalRendering_Solution;
