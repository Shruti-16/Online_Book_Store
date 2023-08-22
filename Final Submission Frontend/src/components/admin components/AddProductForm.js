import {Container,Button,Form, FormGroup} from "reactstrap";
import{toast} from "react-toastify";
import React from "react";
import { useState } from "react";
import ProductService from "../../ProductService";
import axios from "axios";

function AddBookForm(){
    const [categoryId,setCategoryId]=useState("");
    const [productName,setProductName]=useState("");
    const [productImagePath,setProductImagePath]=useState("");
    const [markedPrice,setMarkedPrice]=useState("");
    const [sellingPrice,setSellingPrice]=useState("");
    const [quantity,setQuantity]=useState(0);
    const [status,setStatus]=useState("AVAILABLE");
    const [description,setDescription]=useState("");
    let token=sessionStorage.getItem('user');
     const config = {
        //  headers: { Authorization: `Bearer ${token}` }
        headers: {
            'authorization': `Bearer ${token}`,
            'Accept' : 'application/json',
            'Content-Type': 'application/json'
        }
     };
 

    const handleAddProduct = (event) => {
        event.preventDefault();
        ProductService.addProduct(categoryId,productName,productImagePath,markedPrice,sellingPrice,quantity,status,description,config)
        .then((result) => {  

          toast.success('Product added Sucessfully!');
          console.log(result);   
        }).catch((err) => {
            toast.error('Internal Server error');
        });
        
      }


    return(
        <div className=" shadow p-2   admin-page" style={{color:"white",backgroundColor:"#28282B",width:"100vw"}}>
        <h2 className="text-center mb-4 pb-3" >Add A Book</h2>
        <Form onSubmit={handleAddProduct} style={{color:"white"}}>
        <FormGroup>
                    <label  className="form-label ">Category Id</label>
                    <input className="form-control" type="text" placeholder="Id" value={categoryId} onChange={(event)=>setCategoryId(event.target.value) } required></input>
                    </FormGroup>

            <center><table className="" >
                <tr >
                    <td colSpan={2}><FormGroup>
                    <label  className="form-label ">Category Id</label>
                    <input className="form-control" type="text" placeholder="Id" value={categoryId} onChange={(event)=>setCategoryId(event.target.value) } required></input>
                    </FormGroup>
                    </td>
                    </tr>
                    <tr>
                    <td colSpan={2}>
                    <FormGroup>
                    <label  className="form-label">Book Name</label>
			        <input className="form-control " type="text" placeholder="Name" value={productName} onChange={(event)=>setProductName(event.target.value) } required></input>
                    </FormGroup>
                    </td>
                </tr>
                <tr>
                    <td colSpan={2}>  
                        <FormGroup>
                        <label  className="form-label">Book Image</label>
				        <input className="form-control " type="text" placeholder="image" value={productImagePath} onChange={(event)=>setProductImagePath(event.target.value) } required></input>	
                        </FormGroup>
                    </td>
                    <td colSpan={2}><FormGroup>
                        <label  className="form-label">Marked Price</label>
                        <input className="form-control " type="text" placeholder="mp" value={markedPrice} onChange={(event)=>setMarkedPrice(event.target.value) } required></input>
                        </FormGroup>
                    </td>
                </tr>
                <tr>
                     <td colSpan={2}><FormGroup>
                        <label  className="form-label">Selling Price</label>
					    <input className="form-control " type="text" placeholder="sp" value={sellingPrice} onChange={(event)=>setSellingPrice(event.target.value) } required></input>	
                        </FormGroup>
                    </td>  
                     <td colSpan={2}><FormGroup>
                        <label  className="form-label">Quantity</label>
                        <input type="number" className="form-control "  value={quantity}  onChange={(event)=>setQuantity(event.target.value) } required></input>
                        </FormGroup>
                    </td>
                </tr>
                <tr><td colspan="2">     
                        <FormGroup className="">
                        <label  className="form-label">Status</label>
                        <input type="text" className="form-control "  value={status}  onChange={(event)=>setStatus(event.target.value) } disabled></input>
                         </FormGroup>
                    </td>
                </tr> 
                <tr><td colspan="2">  
                        <FormGroup >
                         Description: <textarea className="form-control "  value={description}  onChange={(event)=>setDescription(event.target.value) } required></textarea>
                        </FormGroup></td>
                </tr>
            
                 <tr> 
                    <td colspan="2">   
                            <Container className="text-center">
                            <Button className="button-cool" color="info" type="submit">Add Product</Button>
                           
                            </Container>
                    </td> 
                </tr>
            </table></center>
        </Form>
        </div>
    );
}

export default AddBookForm;
