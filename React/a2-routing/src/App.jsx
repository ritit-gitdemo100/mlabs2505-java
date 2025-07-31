import { Link, NavLink, Route, Routes } from 'react-router-dom'
import './App.css'
import About from './pages/about'
import Contact from './pages/contact'
import Home from './pages/home'
import Services from './pages/services'
import User from './pages/user'
import UserPost from './pages/post'
import DashboardLayout from './pages/dashboard/DashboardLayout'
import Stats from './pages/dashboard/Stats'
import Profile from './pages/dashboard/Profile'
import MainLayout from './layouts/MainLayout'
import { useState } from 'react'
import ProtectedRoute from './components/ProtectedRoute'
import Login from './pages/login'

function App() {
  const [user, setUser] = useState(null);

  const login = (username) => setUser({ name: username });
  const logout = () => setUser(null);

  return (
    <div>
      <h1>Routing Application</h1>
      <nav>
        <Link to="/">Home</Link>
        <Link to="/about">About</Link>
        <Link to="/contact">Contact</Link>
        <NavLink to="/services" style={({ isActive }) => ({
          color: isActive ? 'red' : 'blue',
        })}>Services</NavLink>

        <Link to="/dashboard">Dashboard</Link>

      </nav>

      <Routes>
        <Route path="/login" element={<Login login={login} />} />

        <Route element={<MainLayout />} >
          <Route path="/" element={<Home />} />
          <Route path="/about" element={<About />} />
          <Route path="/contact" element={<Contact />} />
          <Route path="/services" element={<Services />} />
          <Route path="/user" element={<User />} />
          <Route path="/user/:userId" element={<User />} />
          <Route path="/user/:userId/post/:postId" element={<UserPost />} />
        </Route>

        <Route path="/dashboard" element={
          <ProtectedRoute user={user}>
            <DashboardLayout />
          </ProtectedRoute>
        }>
          <Route path="stats" element={<Stats />} />
          <Route path="profile" element={<Profile />} />
        </Route>

        <Route path="*" element={<p> Page Not Found </p>} />
      </Routes>

    </div>
  )
}

export default App
