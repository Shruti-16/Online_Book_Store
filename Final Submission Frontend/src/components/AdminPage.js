import React from "react";
import{Container,Row,Col,Button} from "reactstrap"
import Navbar from "./Navbar";
import LeftSidebar from "./LeftSidebar";
import AdminHome from "./WelcomeAdmin";
import { BrowserRouter, Routes, Route } from 'react-router-dom';



function AdminPage(){

    return(
        <div className="admin-page">
        <Navbar/>
        <LeftSidebar ></LeftSidebar>
        
        </div>
        

        


    );
}

export default AdminPage;