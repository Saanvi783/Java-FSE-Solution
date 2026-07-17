// Implement componentDidMount and componentDidCatch hooks
import React, { Component } from 'react';

class LifeCycleHooks_Solution extends Component {
  componentDidMount() {
    console.log("Component mounted successfully.");
  }
  componentDidCatch(error, info) {
    console.error("ErrorBoundary caught:", error, info);
  }
  render() {
    return <h2>Life Cycle hooks active.</h2>;
  }
}

export default LifeCycleHooks_Solution;
