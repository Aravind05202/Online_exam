
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Layout from "./pages/Layout";
import Home from "./pages/Home";
import About from "./pages/About";
import Services from "./pages/Services";
import Contact from "./pages/Contact";
import OnlineTest from "./pages/OnlineTest";
import QuickTest from "./pages/QuickTest";
import Started from "./pages/Started";
import ViewClass from "./pages/Class"
import NoPage from "./pages/NoPage";


function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route index element={<Home />} />
          <Route path="About" element={<About />} />
          <Route path="Services" element={<Services />} />
          <Route path="contact" element={<Contact />} />
          <Route path="OnlineTest" element={<OnlineTest />} />
          <Route path="QuickTest" element={<QuickTest />} />
          <Route path="ViewClass" element={<ViewClass />} />
          <Route path="Started" element={<Started />} />
          <Route path="*" element={<NoPage />} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

 

export default App;
