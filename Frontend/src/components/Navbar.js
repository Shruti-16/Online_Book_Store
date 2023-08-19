import React from "react";
import '../stylesheets/Navbar.css'
import { FaBook } from "react-icons/fa";
import { FaSearch } from "react-icons/fa";

function Navbar(){
    return (
        <div>
            <nav className="navbar navbar-expand-lg navbar-dark">
                <div className="container-fluid" style={{marginLeft:"3rem",marginRight:"3rem"}}>
                    <a className="navbar-brand" href="/login"><FaBook height={60} width={90} style={{marginRight:"0.4rem"}}></FaBook>OnlineBookStore</a>
                    <div className="collapse navbar-collapse">
                        <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                            <li className="nav-item">
                                <a className="nav-link active" aria-current="page" href="#">About</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link" aria-current="page" href="#">Shop</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link" aria-current="page" href="#">Authors</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link" aria-current="page" href="#">Contact Us</a>
                            </li>
                        </ul>
                    </div>
                    <a className="navbar-brand" aria-current="page" href="#" style={{marginRight:"0.4rem"}}>Login As Admin</a>
                    
                </div>
            </nav>
        </div>
    )
}

export default Navbar;