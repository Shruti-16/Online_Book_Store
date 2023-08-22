import React from "react";
import { Link } from "react-router-dom";
import{ListGroup,ListGroupItem,Container,Row} from "reactstrap";
import axios from "axios";
import { useEffect, useState } from "react";
import {Table} from 'react-bootstrap';

function LeftSidebar(){
    const [categoryList,setCategoryList]=useState([]);
    const [singleProduct,setSingleProduct]=useState([]);
    useEffect(function(){
        axios.get("http://localhost:8080/categories")
        .then((response)=>setCategoryList(response.data))
        .then((error)=>console.log(error));
    },[]);

    const onddlChange=(e)=>{
        //(e.target.value);
        //console.log(e);
        axios.get("http://localhost:8080/categories/"+e.target.value)
        .then((response)=>setSingleProduct(response.data))
        .then((error)=>console.log(error));
    }
    return(
        <>
        <Container >
            <Row className="text-center justify-content-evenly align-items-center">
        <div className="mt-3 col-4 pt-5">
        <ListGroup color="dark">
             {/* <Link className="list-group-item list-group-item-action" to="/admin" tag="a" action>
                Welcome
            </Link> */}
            <Link className="list-group-item list-group-item-action" to="/register" tag="a" action>
                Add User
            </Link>
            <Link className="list-group-item list-group-item-action" to="/users" tag="a" action>
                Show List of Users
            </Link>
        
            <Link className="list-group-item list-group-item-action" to="/add-category" tag="a" action>
                Add a Category
            </Link>
            <Link className="list-group-item list-group-item-action" to="/view-category" tag="a" action>
                View all Categories
            </Link>

            <Link  className="list-group-item list-group-item-action" to="/add-product" tag="a" action>
                Add a product
            </Link>
            {/* <Link  className="list-group-item list-group-item-action" to="/login" tag="a" action>
                Login
            </Link> */}
            <Link  className="list-group-item list-group-item-action" to="/display-products-admin" tag="a" action>
                Manage Products by categories
            </Link>
            </ListGroup>
            </div>
            </Row>
            </Container>
        
        </>
    );
}

export default LeftSidebar; 