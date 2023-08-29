import { useState, useEffect } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";
import "./cart.css";
import LoginServiceCustomer from "../Service/LoginServiceCustomer";
import { FaShoppingCart, FaSignOutAlt } from 'react-icons/fa';
import SearchBar from "./SearchBar";

const Cart = () => {
  const [totalPrice, setTotalPrice] = useState();
  const [products, setProducts] = useState([]);
  const [cart, setCart] = useState([]);
  const [customer, setCustomer] = useState([]);
  const [name, setName] = useState("");
  const navigate = useNavigate();
  useEffect(() => {
    LoginServiceCustomer.getAllBooksInCart(sessionStorage.getItem("userId"))
      .then((result) => {
        setCart(result.data);
        console.log(JSON.stringify(result.data));
      })
      .catch((err) => {
        console.log("NO BOOKS");
      });
  }, []);
  useEffect(() => {
    const totalPriceSum = cart.reduce(
      (sum, item) => sum + item.sellingPrice,
      0
    );
    setTotalPrice(totalPriceSum);
  }, [cart]);

  const placeOrder = () => {
    LoginServiceCustomer.placeOrder(sessionStorage.getItem("userId")).then((result) => {
      console.log(result);
      navigate("/myorder");
    })
      .catch((err) => {
        console.log("Order not placed");
      });
  }
  const handleRemoveProduct = (productId) => {
    axios
      .put(`http://localhost:8080/cart/removeItem/${4}/${productId}`)
      .then((response) => {
        setProducts(response.data.items.map((item) => item.product));
        setCart(response.data);
        console.log(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  };
  return (
    <>
      <nav className="navbar navbar-expand-lg navbar-dark bg-dark" style={{ fontWeight: "bold" }}>
        <div className="container-fluid" style={{ marginLeft: "3rem" }}>
          <div className="collapse navbar-collapse" id="navbarSupportedContent">
            <ul className="navbar-nav me-auto mb-2 mb-lg-1">
              <li className="nav-item">
                <a className="nav-link" aria-current="page" href="/" style={{ fontSize: "1.3rem", marginRight: "1.3rem" }}>Home</a>
              </li>

              <li className="nav-item">
                <a className="nav-link" href="/about" style={{ fontSize: "1.3rem", marginRight: "1.3rem" }}>About Us</a>
              </li>
              <li className="nav-item">
                <a className="nav-link" href="/contact" style={{ fontSize: "1.3rem" }}>Contact Us</a>
              </li>
              <div style={{ marginLeft: "15rem" }}>

                <SearchBar />
              </div>

              <div className='buttons' style={{ marginLeft: "20rem" }}>
                <a href='/carts/getBooksInCart' className='btn btn-light ms-3'>
                  <FaShoppingCart />
                </a>
                <a href='/logout' className='btn btn-light ms-3'>
                  Logout <FaSignOutAlt />
                </a>
              </div>
            </ul>
          </div>
        </div>
      </nav>

      {/* //////////////////////////////////////////////////////////////////////////// */}

      <table>
        <thead>
          <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author Name</th>
            <th>Selling Price</th>
          </tr>
        </thead>
        <tbody>
          {cart.map((data, index) => (
            <tr key={index}>
              <td>{data.bookId}</td>
              <td>{data.title}</td>
              <td>{data.authorName}</td>
              <td>{data.sellingPrice}</td>
            </tr>
          ))}
        </tbody>
      </table>
      <div class="card">
        <h2 class="card-title">Total Price :&nbsp;{totalPrice}</h2>
        <button class="place-order-button" onClick={placeOrder}>Place Order</button>
      </div>
    </>
  );
};

export default Cart;
