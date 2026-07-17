// Unit testing with Enzyme
import React from 'react';
import { shallow } from 'enzyme';
import MyComponent from './MyComponent';

describe('Enzyme Testing Suite', () => {
  it('should render correct text', () => {
    const wrapper = shallow(<MyComponent />);
    expect(wrapper.find('h2').text()).toEqual('Testing enzyme');
  });
});
