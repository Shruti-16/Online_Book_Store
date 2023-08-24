import { Container, Button, Form, FormGroup } from "reactstrap";
import { toast } from "react-toastify";
import React from "react";
import { useState } from "react";
import ProductService from "../../ProductService";
import axios from "axios";

function AddBookForm() {
    const [categoryId, setCategoryId] = useState("");
    const [productName, setProductName] = useState("");
    const [productImagePath, setProductImagePath] = useState("");
    const [markedPrice, setMarkedPrice] = useState("");
    const [sellingPrice, setSellingPrice] = useState("");
    const [quantity, setQuantity] = useState(0);
    const [status, setStatus] = useState("AVAILABLE");
    const [description, setDescription] = useState("");
    let token = sessionStorage.getItem('user');
    const config = {
        //  headers: { Authorization: `Bearer ${token}` }
        headers: {
            'authorization': `Bearer ${token}`,
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    };


    const handleAddProduct = (event) => {
        event.preventDefault();
        ProductService.addProduct(categoryId, productName, productImagePath, markedPrice, sellingPrice, quantity, status, description, config)
            .then((result) => {

                toast.success('Product added Sucessfully!');
                console.log(result);
            }).catch((err) => {
                toast.error('Internal Server error');
            });

    }


    return (
        <div className=" shadow p-2   admin-page" style={{ color: "white", backgroundColor: "#28282B", width: "100vw" }}>
            <h1 className="text-center m-5 pb-3" >Add A Book</h1>

            <div className="row align-items-center justify-content-evenly">
                <div className="col-6 align-self-center">
                    <form onSubmit={handleAddProduct} style={{ color: "white" }}>

                        <span className="row g-3 mb-3">
                            <div className="col-md-6">
                                <label className="form-label">Book Name</label>
                                <div>
                                    <input className="form-control" type="text" placeholder="Book Name" value={productName} onChange={(event) => setProductName(event.target.value)} required></input>
                                </div>
                            </div>
                            <div className="col-md-6">
                                <label className="form-label">Marked Price</label>
                                <div>
                                    <input className="form-control" type="text" placeholder="Marked Price" value={markedPrice} onChange={(event) => setProductName(event.target.value)} required></input>
                                </div>
                            </div>
                        </span>
                        <span className="row g-3 mb-3">
                            <div className="col-md-6">
                                <label className="form-label">Selling Price</label>
                                <div>
                                    <input className="form-control" type="text" placeholder="Selling Price" value={sellingPrice} onChange={(event) => setProductName(event.target.value)} required></input>
                                </div>
                            </div>
                            <div className="col-md-6">
                                <label className="form-label">Quantity</label>
                                <div>
                                    <input className="form-control" type="number" placeholder="Quantity" value={quantity} onChange={(event) => setProductName(event.target.value)} required></input>
                                </div>
                            </div>
                        </span>
                        <span className="row g-3 mb-3">
                            <div className="col-md-6">
                                <label className="form-label">Status</label>
                                <div>
                                    <input className="form-control" type="text" placeholder="Selling Price" value={sellingPrice} onChange={(event) => setProductName(event.target.value)} required></input>
                                </div>
                            </div>
                            <div className="col-md-6">
                                <label className="form-label">Description</label>
                                <div>
                                    <textarea className="form-control" placeholder="Description" value={description} onChange={(event) => setDescription(event.target.value)}></textarea>

                                </div>
                            </div>
                        </span>
                        <span className="row  g-3 mb-3">
                            <div className="col-md-6">
                                <label className="form-label">Author</label>
                                <div>
                                    <input className="form-control" type="text" placeholder="Author" value={sellingPrice} onChange={(event) => setProductName(event.target.value)} required></input>
                                </div>
                            </div>
                            <div className="col-md-6">
                                <label className="form-label">Book Image</label>
                                <input className="form-control" type="file" placeholder="Book Image" value={productImagePath} onChange={(event) => setProductImagePath(event.target.value)}></input>
                            </div>
                            <div className="row g-3 mt-2">
                                <button className="btn btn-primary rounded">Add Book</button>
                            </div>
                        </span>
                    </form>
                </div>
            </div>
        </div>
    );
}

export default AddBookForm;
