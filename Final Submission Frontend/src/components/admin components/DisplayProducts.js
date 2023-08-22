import axios from "axios";
import { useEffect, useState } from "react";
import {Table} from 'react-bootstrap';
import { Navbar } from "reactstrap";

function DisplayProducts(){
    // 
    
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
        <div>   
            <Navbar/>    
                <div className="w3-sidebar w3-bar-block w3-black w3-large " style={{width:"200px"}}>
                    <a href="/display-products" className="w3-bar-item w3-button" ><i className="fa fa-bars "> </i> Categories</a> 

                        {
                            categoryList.map((category)=>(
                                    
                                 <button  className="w3-bar-item w3-button"onClick={onddlChange} key={category.id} value={category.id} > {category.categoryName}</button> //<i class="fa fa-arrow-right" >  </i>
                            ))
                        }
                </div>
                <div>           
                <div style={{marginLeft:"200px"}}>
                        
                    
                        <div className="w3-container container-fluid category-table">
                            <div className="row justify-content-evenly align-items-center m-5 ">
                        {
                                singleProduct.map((product)=>(
                            <div className="card catt" style={{width: "18rem"}}>
                            
                                <img src={product.productImagePath} height='250rem'  className="card-img-top" alt="..."></img>
                                <div className="card-body">
                                
                                    <><h5 className="card-title"><b>Name: </b>{product.productName}</h5>
                                    <p className="card-text"><b>Description: </b>{product.description}</p>
                                    <p className="" ><b>Price: &#8377;</b><s>{product.markedPrice}</s> <b>{product.sellingPrice}</b></p>
                                    <p><b>Availability: </b>{product.status} <b>{product.quantity} pcs</b></p>
                                    <a href="#" className="btn btn-primary ms-5">Add to Cart</a></>
                                
                                </div>
                                
                            </div>
                       
                            ))
                        }
                        </div>
                        </div>
                     


                </div>
                
            </div> 

                         
                           
                            
 
                                    
        </div>
    )
}

export default DisplayProducts;