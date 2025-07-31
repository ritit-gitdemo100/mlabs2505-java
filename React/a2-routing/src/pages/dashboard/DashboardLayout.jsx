import { Outlet, Link } from 'react-router-dom';

export default function DashboardLayout() {
  return (
    <div>
      <h2>Dashboard</h2>
      <nav>
        <Link to="stats">Stats</Link> 
        <Link to="profile">Profile</Link>
      </nav>
      <Outlet /> 
    </div>
  );
}
