import React from "react";
import '../stylesheets/Navbar.css'
import { FaBook } from "react-icons/fa";
import { FaSearch } from "react-icons/fa";

function Navbar(){
    return (
        <div>
            <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
                <div className="container-fluid" style={{marginLeft:"3rem"}}>
                    <a className="navbar-brand" href="/login"><FaBook height={60} width={90} style={{marginRight:"0.4rem"}}></FaBook>OnlineBookStore</a>
                    <div className="collapse navbar-collapse">
                        <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                            <li className="nav-item">
                                <a className="nav-link active" aria-current="page" href="#">Home</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link" aria-current="page" href="#">Shop</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link" aria-current="page" href="#">Authors</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link" aria-current="page" href="#">Categories</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link" aria-current="page" href="#"> <FaSearch id="search_icon"></FaSearch></a>
                            </li>
                        </ul>
                    </div>
                    
                </div>
            </nav>
        </div>
    )
}

export default Navbar;