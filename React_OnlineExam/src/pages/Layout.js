import { Outlet, Link } from "react-router-dom";
import '../index.css'

const Layout = () => {
  return (
    <>
      <nav>
        <ul>
          <li>
            <Link to="/">Home</Link>
          </li>
          <li>
            <Link to="/About">About</Link>
          </li>
          <li>
            <Link to="/Services">Services</Link>
          </li>
          <li>
            <Link to="/contact">Contact</Link>
          </li>
          <li>
            <Link to="/OnlineTest">OnlineTest</Link>
          </li>
          <li>
            <Link to="/QuickTest">QuickTest</Link>
          </li>
          <li>
            <Link to="/ViewClass">ViewClass</Link>
          </li>
          <li>
            <Link to="/Started">Get Started</Link>
          </li>
        </ul>
      </nav>

      <Outlet />
    </>
  )
};

export default Layout;