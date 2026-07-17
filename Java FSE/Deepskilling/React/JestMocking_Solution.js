// Isolation testing and mocking with Jest
import axios from 'axios';
import { fetchUsers } from './userService';

jest.mock('axios');

describe('Jest Mocking', () => {
  it('should mock API call', async () => {
    axios.get.mockResolvedValue({ data: [{ name: 'Test User' }] });
    const users = await fetchUsers();
    expect(users[0].name).toEqual('Test User');
  });
});
