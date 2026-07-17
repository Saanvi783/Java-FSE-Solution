// Function component with style properties
import React from 'react';

const scoreStyle = {
  color: 'green',
  fontSize: '20px'
};

function ScoreCalculatorApp() {
  const score = 95;
  return (
    <div style={scoreStyle}>
      <h2>Score Calculator App</h2>
      <p>Calculated Score: {score}</p>
    </div>
  );
}

export default ScoreCalculatorApp;
