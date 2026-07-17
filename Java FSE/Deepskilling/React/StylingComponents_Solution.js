// Styles using CSS Module and Inline styles
import React from 'react';
import styles from './App.module.css';

function StylingComponents_Solution() {
  return (
    <div className={styles.container} style={{ padding: '20px', backgroundColor: '#f0f0f0' }}>
      <h2>Styling React Components</h2>
    </div>
  );
}

export default StylingComponents_Solution;
