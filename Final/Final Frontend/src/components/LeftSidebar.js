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
            <Link className="list-group-item list-group-item-action mb-3" to="/users/register-customer" tag="a" action>
                Add User
            </Link>
            <Link className="list-group-item list-group-item-action mb-3" to="/users" tag="a" action>
                Show List of Users
            </Link>

            <Link  className="list-group-item list-group-item-action mb-3" to="/books/add-book" tag="a" action>
                Add a Book
            </Link>
            </ListGroup>
            </div>
            </Row>
            </Container>
        
        </>
    );
}

export default LeftSidebar; 