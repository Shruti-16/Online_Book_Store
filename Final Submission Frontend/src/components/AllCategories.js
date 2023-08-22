import React, { useEffect } from "react";
import { useState } from "react";
import Category from "./Category";
import {Row,Col} from "reactstrap";
import axios from "axios";
import {toast} from "react-toastify";
import CategoryCard from "./CategoryCard";

function AllCategories () {
    const [categories,setCategories] = useState([]);
    let token=sessionStorage.getItem('user');
     const config = {
         headers: { Authorization: `Bearer ${token}` }
     };

    useEffect(()=>{
        getAllCategories();
    },[])

    const getAllCategories= ()=>{
        axios.get("http://localhost:8080/categories",config).then((response)=>{
            setCategories(response.data);
            console.log(response.data);
        },
        (error)=>{
            toast.error("server down",{position:"bottom-center"})
        })
    }

    return(
        <div className="admin-page p-5">
            <h2 className="ms-2 text-center" style={{color:"white"}}>All Available Categories </h2>
            <Row>{categories.length>0?categories.map((item)=> <Col sm="4"><CategoryCard category={item} /></Col>):"No categories available"}</Row>
        </div>
    );
}

export default AllCategories;