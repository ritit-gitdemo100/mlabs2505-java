import { Outlet, Link } from 'react-router-dom';

export default function MainLayout() {
  return (
    <>
      <header style={{ background: '#ddd', padding: '1rem' }}>
        <nav>
          <Link to="/">Home</Link> 
          <Link to="/about">About</Link> 
          <Link to="/contact">Contact</Link>
        </nav>
      </header>

      <main style={{ padding: '1rem' }}>
        <Outlet />
      </main>

      <footer style={{ background: '#eee', padding: '1rem', marginTop: '1rem' }}>
        <p>&copy; 2025 My App</p>
      </footer>
    </>
  );
}
