import { useState } from 'react';

export default function useAuth() {
  const [user, setUser] = useState(null);

  const login = (username) => setUser({ name: username });
  const logout = () => setUser(null);

  return { user, login, logout };
}
