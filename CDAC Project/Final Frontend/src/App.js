import './App.css';
import { ToastContainer } from "react-toastify";
import AdminPage from './components/AdminPage';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import DisplayProducts from './components/admin components/DisplayProducts';
import UsersTable from './components/admin components/UsersTable';
import RegisterAdmin from './components/admin components/RegisterAdmin';
import AdminHome from './components/AdminHome';
import AddCategory from './components/admin components/AddCategory'
import AllCategories from './components/AllCategories'
import AllProducts from './components/AllProducts'
import Homepage from './components/Homepage';
import Contact from './components/Contact';
import About from './components/About';
import LoginForm from './components/LoginForm';
import Category from './components/Category';
import RegisterCustomer from './components/RegisterCustomer';
import DisplayProductsForAdmin from './components/admin components/DisplayProductsForAdmin';
import Cart from './components/Cart';
import Order from './components/Order';
// import AdminLogin from './components/AdminLogin';
import AddBookForm from './components/admin components/AddBookForm';
import AllBooks from './components/AllProducts';
import Logout from './components/Logout';
import NotFound from './components/NotFound';
import UpdateUser from './components/admin components/UpdateUser';

function App() {
  return (

    <BrowserRouter>
      <Routes>
        <Route exact path="/" element={<Homepage />} />
        <Route exact path="/register-admin" element={<RegisterAdmin />} />
        {/* <Route exact path="/admin-login" element={<AdminLogin />} /> */}
        <Route exact path="/admin" element={<AdminPage />} />
        <Route exact path="/users" element={<UsersTable />} />
        <Route exact path="/add-book" element={<AddBookForm />} />
        {/* <Route exact path="/delete-book" element={<AllBooks />} />  Pending */}
        <Route exact path="/login-customer" element={<LoginForm />} />
        {/* <Route exact path="/add-category" element={<AddCategory/>} /> */}
        {/* <Route exact path="/view-category" element={<AllCategories/>} /> */}
        {/* <Route exact path="/display-products" element={<DisplayProducts />} /> Pending */}
        <Route exact path="/display-products-admin" element={<DisplayProductsForAdmin />} />
        <Route exact path="/contact" element={<Contact />} />
        <Route exact path="/about" element={<About />} />
        {/* <Route exact path="/category" element={<Category />} /> */}
        <Route exact path="/users/register-customer" element={<RegisterCustomer />} />
        <Route exact path="/customer-cart" element={<Cart />} />
        <Route exact path="/myorder" element={<Order />} />
        <Route exact path="/logout" element={<Logout />} />
        <Route exact path="*" element={<NotFound />} />
        <Route exact path="/AllBooks" element={<AllBooks />} />
        <Route exact path="/UpdateUser" element={<UpdateUser />} />

      </Routes>
      <ToastContainer
        position="bottom-center"
        autoClose={1000}
      ></ToastContainer>
    </BrowserRouter>
  );
}

export default App;
