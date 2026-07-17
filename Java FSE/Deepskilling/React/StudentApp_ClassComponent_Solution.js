// Student Management Portal App using class component
import React, { Component } from 'react';

class StudentApp extends Component {
  constructor(props) {
    super(props);
    this.state = { name: "Saanvi", role: "Developer" };
  }
  render() {
    return (
      <div>
        <h2>Student Management Portal</h2>
        <p>Name: {this.state.name}</p>
        <p>Role: {this.state.role}</p>
      </div>
    );
  }
}

export default StudentApp;
