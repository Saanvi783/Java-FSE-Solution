// Event handling, binding, and synthetic events
import React, { Component } from 'react';

class EventHandling_Solution extends Component {
  handleClick = (e) => {
    console.log("Synthetic event type:", e.type);
  }
  render() {
    return <button onClick={this.handleClick}>Click Me</button>;
  }
}

export default EventHandling_Solution;
