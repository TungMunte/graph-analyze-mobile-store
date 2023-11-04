import { BrowserRouter, Routes, Route, Navigate } from "react-router-dom";
import Product from "./graph/Product";
import UserWithCoupon from "./graph/UserWithCoupon";
import UserWithoutCoupon from "./graph/UserWithoutCoupon";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Product />} />
        <Route path="/top5product" element={<Product />} />
        <Route path="/top5userWithCoupon" element={<UserWithCoupon />} />
        <Route path="/top5userWithoutCoupon" element={<UserWithoutCoupon />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
