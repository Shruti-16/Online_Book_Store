import React from "react";
import{Container,Row,Col,Button} from "reactstrap"
import Navbar from "./Navbar";
import LeftSidebar from "./LeftSidebar";
import AdminHome from "./WelcomeAdmin";
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { FaShoppingCart,FaSignOutAlt,FaBook } from "react-icons/fa";



function AdminPage(){

    return(
        <div className="admin-page">
            <nav className="navbar navbar-expand-lg navbar-light bg-light" style={{fontWeight:"bold"}}>
                <div className="container-fluid" style={{ marginLeft: "3rem" }}>
                <a className="navbar-brand" href="/"><FaBook height={65} width={90}></FaBook>OnlineBookStore</a>
                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"></span>
                    </button>
                    
                    <div className="collapse navbar-collapse" id="navbarSupportedContent" style={{ marginLeft: "32rem" }}>
                        <ul className="navbar-nav me-auto mb-2 mb-lg-1">
                            {/* <li className="nav-item">
                                <a className="nav-link" aria-current="page" href="/" style={{ fontSize: "1.3rem", marginRight: "1.3rem" }}>Home</a>
                            </li> */}
                            {/* <li className="nav-item">
                                <a className="nav-link active " aria-current="page" href="/category">Categories</a>
                            </li> */}

                            <li className="nav-item">
                                <a className="nav-link" href="/about" style={{ fontSize: "1.3rem", marginRight: "1.3rem" }}>About Us</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link" href="/contact" style={{ fontSize: "1.3rem" }}>Contact Us</a>
                            </li>


                            <div className='buttons' style={{ marginLeft: "35rem" }}>
                                {/* <a href='/login-customer' className='btn btn-outline-light'>
                                    <i className='text-white '>Login  &#187;</i>
                                </a> */}
                                {/* <a href='/register-customer' className='btn btn-outline-light ms-3'>
                                    <i className='text-white '>Register &#187;</i>
                                </a> */}
                                {/* <a href='/customer-cart' className='btn btn-light ms-3'>
                                    <i className='text-white '>Cart </i>
                                    <FaShoppingCart />
                                </a> */}
                                <a href='#' className='btn btn-light ms-3'>
                                    {/* <i className='text-white '>Cart </i> */}
                                    Logout <FaSignOutAlt />
                                </a>
                            </div>


                        </ul>

                    </div>
                </div>
            </nav>

        {/* <Navbar/>
        <LeftSidebar ></LeftSidebar> */}
        {/* <Navbar/> */}
         <div className="jumbotron text-center admin-home admin-page pt-5" style={{color:"white"}}>
        <h1 className="display-4">Welcome, Admin!</h1>
        <p className="lead">Manage Users and Books.</p>
        <p className="lead pt-3">
        {/* <a className="btn btn-info btn-lg button-cool" href="#" role="button">Learn more</a> */}
        </p>
        <LeftSidebar></LeftSidebar>
        </div>
        
        </div>
        

        


    );
}

export default AdminPage;