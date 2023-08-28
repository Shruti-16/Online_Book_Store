import React, { useState,useEffect } from "react";
import { Row, Col } from "reactstrap";
import Product from "./Product";
import { FaShoppingCart, FaSignOutAlt } from 'react-icons/fa';
import Navbar from "./Navbar";
import SearchBar from "./SearchBar"


// function AllBooks() {
//   const [products] = useState([
//     {
//       title: "Book 1",
//       description: "Description for Book 1",
//       price: "19.99",
//     },
//     {
//       title: "Book 2",
//       description: "Description for Book 2",
//       price: "24.99",
//     },
//     {
//       title: "Book 3",
//       description: "Description for Book 3",
//       price: "29.99",
//     },
//     {
//       title: "Book 4",
//       description: "Description for Book 4",
//       price: "14.99",
//     },
//     {
//       title: "Book 5",
//       description: "Description for Book 5",
//       price: "9.99",
//     },
//     {
//         title: "Book 6",
//         description: "Description for Book 3",
//         price: "29.99",
//       },
//       {
//         title: "Book 7",
//         description: "Description for Book 4",
//         price: "14.99",
//       },
//       {
//         title: "Book 8",
//         description: "Description for Book 5",
//         price: "9.99",
//       },

      
      
//   ]);
function AllBooks() {
  const [products, setProducts] = useState([]);

  useEffect(() => {
    // Fetch the book details from the backend
    fetch("/books/getAllBooks")
      .then(response => response.json())
      .then(data => setProducts(data))
      .catch(error => console.error("Error fetching books:", error));
  }, []);

  let token = sessionStorage.getItem('user');
  console.log(token)

  return (
    <div>
       <nav className="navbar navbar-expand-lg navbar-dark bg-dark" style={{fontWeight:"bold"}}>
                <div className="container-fluid" style={{ marginLeft: "3rem" }}>
                    {/* <a className="navbar-brand" href="/">My Order</a>
                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button> */}
                    <div className="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul className="navbar-nav me-auto mb-2 mb-lg-1">
                            <li className="nav-item">
                                <a className="nav-link" aria-current="page" href="/" style={{ fontSize: "1.3rem", marginRight: "1.3rem" }}>Home</a>
                            </li>
                            {/* <li className="nav-item">
                                <a className="nav-link active " aria-current="page" href="/category">Categories</a>
                            </li> */}

                            <li className="nav-item">
                                <a className="nav-link" href="/about" style={{ fontSize: "1.3rem", marginRight: "1.3rem" }}>About Us</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link" href="/contact" style={{ fontSize: "1.3rem" }}>Contact Us</a>
                            </li>
                            <div style={{marginLeft:"15rem"}}>

                            <SearchBar/>
                            </div>

                            <div className='buttons' style={{ marginLeft: "20rem" }}>
                                {/* <a href='/login-customer' className='btn btn-outline-light'>
                                    <i className='text-white '>Login  &#187;</i>
                                </a> */}
                                {/* <a href='/register-customer' className='btn btn-outline-light ms-3'>
                                    <i className='text-white '>Register &#187;</i>
                                </a> */}
                                <a href='/customer-cart' className='btn btn-light ms-3'>
                                    {/* <i className='text-white '>Cart </i> */}
                                    <FaShoppingCart />
                                </a>
                                <a href='/logout' className='btn btn-light ms-3'>
                                    {/* <i className='text-white '>Cart </i> */}
                                    Logout <FaSignOutAlt />
                                </a>
                            </div>


                        </ul>

                    </div>
                </div>
            </nav>

      <h2 className="ms-2 my-3">Trending Books</h2>
     
      <Row>
        {products.length > 0 ? (
          products.map((item) => (
            <Col sm="3" key={item.title}>
              <Product product={item} />
            </Col>
            
          ))
        ) : (
          <p>No Products under this category</p>
        )}
      </Row>
<p></p>
    </div>
  );
}

export default AllBooks;
