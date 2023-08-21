import React from "react";
import{Container,Row,Col,Button} from "reactstrap"
import Navbar from "./Navbar";
import LeftSidebar from "./LeftSidebar";
import AdminHome from "./WelcomeAdmin";
import { BrowserRouter, Routes, Route } from 'react-router-dom';



function AdminPage(){

    return(
        <div className="admin-page">
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