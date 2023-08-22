import logo from './logo.svg';
import './App.css';
import {Button} from "reactstrap";
import {ToastContainer} from "react-toastify";
import AdminPage from './components/AdminPage';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import DisplayProducts from './components/admin components/DisplayProducts';
import UsersTable from './components/admin components/UsersTable';
import RegisterAdmin from './components/admin components/RegisterAdmin';
import AdminHome from './components/WelcomeAdmin';
import AddCategory from './components/admin components/AddCategory'
import AllCategories from './components/AllCategories'
import AddProductForm from './components/admin components/AddProductForm';
import AllProducts from './components/AllProducts'
import LogIn from './components/AdminLogIn';
import WelcomeAdmin from './components/WelcomeAdmin';
import Homepage from './components/Homepage';
import Contact from './components/Contact';
import About from './components/About';
import LoginForm from './components/LoginForm';
import Category from './components/Category';
import RegisterCustomer from './components/RegisterCustomer';
import DisplayProductsForAdmin from './components/admin components/DisplayProductsForAdmin';
import Cart from './components/Cart';
import Order from './components/Order';

function App() {
  return (
    
    <BrowserRouter>
        <Routes> 
                <Route exact path="/admin" element={<WelcomeAdmin/>} />
                <Route exact path="/" element={<Homepage/>} />
                <Route exact path="/adminpage" element={<AdminPage/>} />
                <Route exact path="/register" element={<RegisterAdmin/>} />
                <Route exact path="/users" element={<UsersTable/>} />
                <Route exact path="/add-category" element={<AddCategory/>} />
                <Route exact path="/view-category" element={<AllCategories/>} />
                <Route exact path="/add-product" element={<AddProductForm/>} />
                <Route exact path="/delete-product" element={<AllProducts/>} />
                <Route exact path="/login" element={<LogIn/>} />
                <Route exact path="/login-customer" element={<LoginForm/>} />
                <Route exact path="/display-products" element={<DisplayProducts/>} />
                <Route exact path="/display-products-admin" element={<DisplayProductsForAdmin/>} />
                <Route exact path="/contact" element={<Contact/>} />
                <Route exact path="/about" element={<About/>} />
                <Route exact path="/category" element={<Category/>} />
                <Route exact path="/register-customer" element={<RegisterCustomer/>} />
                <Route exact path="/customer-cart" element={<Cart/>} />
                <Route exact path="/myorder" element={<Order/>} />


                {/* <Route exact path="/" element={<Homepage/>} />
            <Route exact path="/login" element={<LoginForm/>} />
            <Route exact path="/register" element={<Register/>} />
            
            <Route exact path="/sidebar" element={<SideBar/>} />
            <Route exact path="/cart" element={<Cart/>} />

            <Route path="*" element={<NotFound/>} /> */}
        </Routes>
        <ToastContainer 
        position="bottom-center"
        autoClose={1000}
        ></ToastContainer>
  </BrowserRouter>
  );
}

export default App;
