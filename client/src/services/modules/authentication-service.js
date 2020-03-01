import axios from 'axios';

export default {
  async login(username, password) {
    return axios.post('/auth/login', {
      username,
      password,
    });
  },
  async logout() {
    return axios.post('/auth/logout');
  },
  async user() {
    return axios.get('/auth/user');
  },
};
