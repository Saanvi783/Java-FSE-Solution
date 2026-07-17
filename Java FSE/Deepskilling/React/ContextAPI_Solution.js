// React Context API (createContext, Provider, Consumer)
import React, { createContext } from 'react';

const UserContext = createContext();

export function UserProvider({ children }) {
  return <UserContext.Provider value="Developer">{children}</UserContext.Provider>;
}

export function ContextAPI_Solution() {
  return (
    <UserContext.Consumer>
      {value => <h2>Context Value: {value}</h2>}
    </UserContext.Consumer>
  );
}
