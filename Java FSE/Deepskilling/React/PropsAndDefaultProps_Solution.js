// Props, Default Props, and render function
import React from 'react';
import PropTypes from 'prop-types';

function PropsAndDefaultProps_Solution({ title, year }) {
  return (
    <div>
      <h2>{title}</h2>
      <p>Year: {year}</p>
    </div>
  );
}

PropsAndDefaultProps_Solution.defaultProps = {
  title: "Shopping App",
  year: 2026
};

PropsAndDefaultProps_Solution.propTypes = {
  title: PropTypes.string,
  year: PropTypes.number
};

export default PropsAndDefaultProps_Solution;
