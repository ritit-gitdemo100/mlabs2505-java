import { useLocation, useNavigate } from 'react-router-dom';

export default function Login({ login }) {
  const navigate = useNavigate();
  const location = useLocation();
  const from = location.state?.from?.pathname;

  const handleLogin = () => {
    login('john'); // Simulate login
    navigate(from, { replace: true });
  };

  return (
    <div>
      <h1>Login Page</h1>
      <button onClick={handleLogin}>Login</button>
    </div>
  );
}
