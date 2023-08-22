import LoginForm from "./LoginForm";
import React, { useState } from "react";

function Navbar(){

    return(
        <div>
            <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
                <div className="container-fluid" style={{marginLeft:"3rem"}}>
                    <a className="navbar-brand" href="/login"><img src="Goods.png" alt='l' height={65} width={90}/></a>
                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"></span>
                    </button>
                    <div className="collapse navbar-collapse" id="navbarSupportedContent" style={{marginLeft:"22rem"}}>
                    <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                        <li className="nav-item">
                        <a className="nav-link active" aria-current="page" href="/">Home</a>
                        </li>
                        <li className="nav-item">
                        <a className="nav-link " aria-current="page" href="/category">Categories</a>
                        </li>

                        <li className="nav-item">
                        <a className="nav-link" href="/about">About Us</a>
                        </li>
                        <li className="nav-item">
                        <a className="nav-link" href="/contact">Contact Us</a>
                        </li>
                        

                        <div className='buttons' style={{marginLeft:"20rem"}}>
                            <a href='/login-customer' className='btn btn-outline-light'>
                                <i className='text-white '>Login  &#187;</i>
                            </a>
                            <a href='/register-customer' className='btn btn-outline-light ms-3'>
                                <i className='text-white '>Register &#187;</i>
                            </a>
                        </div>
                        
                    </ul>
                    
                    </div>
                </div>
            </nav>
        </div>
    )
}

export default Navbar;