import { brown } from '@mui/material/colors';
import React, { useState, useEffect } from 'react';

    export default function Order() {
        const [orderData, setOrderData] = useState({
            orderId: '',
            customerId: '',
            orderData:'',
            paymentStatus: '',
            customerName: '',
            customerAddress: '',
            orderStatus: ''
        });
    
        useEffect(() => {
            // Simulate fetching data from the backend
            // Replace this with your actual API call
            const fetchData = async () => {
                try {
                    const response = await fetch('your_backend_api_url');
                    const data = await response.json();
    
                    // Assuming the response data structure matches the expected properties
                    setOrderData({
                        orderId: data.orderId,
                        customerId: data.customerId,
                        orderData: data.orderData,
                        paymentStatus: data.paymentStatus,
                        customerName: data.customerName,
                        customerAddress: data.customerAddress,
                        orderStatus: data.orderStatus
                    });
                } catch (error) {
                    console.error('Error fetching data:', error);
                }
            };
    
            fetchData();
        }, []);
    
    return (
        <div>
            <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
                <div className="container-fluid" style={{ marginLeft: "3rem" }}>
                    <a className="navbar-brand" href="/">ORDER DETAILS</a>
                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button>
                    <div className="collapse navbar-collapse" id="navbarSupportedContent" style={{ marginLeft: "22rem" }}>
                        <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                            <li className="nav-item">
                                <a className="nav-link " aria-current="page" href="/">Home</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link active " aria-current="page" href="/category">Categories</a>
                            </li>

                            <li className="nav-item">
                                <a className="nav-link" href="/about">About Us</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link" href="/contact">Contact Us</a>
                            </li>


                            <div className='buttons' style={{ marginLeft: "20rem" }}>
  
                                <a href='/customer-cart' className='btn btn-outline-light ms-3'>
                                    <i className='text-white '>Cart &#187;</i>
                                </a>
                            </div>


                        </ul>

                    </div>
                </div>
            </nav>

            <div className="container-fluid">
                <div className="row align-items-center justify-content-center "style={{height:"92vh"}}>
                        <div  >
                        <h3 className="text-center" style={{ color: 'green' }}>Order placed Successfully!</h3>
                        <br></br>
                        <br></br>
                        <br></br>
                        <br></br>
                        <table className="table table-bordered " style={{ borderColor :'darkblue' ,margin: "0 auto", width: "60%"  }}>
                            <tbody>
                                <tr>
                                    <th style={{ width: "50%", textAlign: "center" }}>Order ID:</th>
                                    <td>{orderData.orderId}</td>
                                </tr>
                                <tr>
                                    <th style={{ width: "50%", textAlign: "center" }}>Customer ID:</th>
                                    <td>{orderData.customerId}</td>
                                </tr>
                                <tr>
                                    <th style={{ width: "50%", textAlign: "center" }}>Ordered Date:</th>
                                    <td>{orderData.orderData}</td>
                                </tr>
                                <tr>
                                    <th style={{ width: "50%", textAlign: "center" }}>Payment Status:</th>
                                    <td>{orderData.paymentStatus}</td>
                                </tr>
                                <tr>
                                    <th style={{ width: "50%", textAlign: "center" }}>Customer Name:</th>
                                    <td>{orderData.customerName}</td>
                                </tr>
                                <tr>
                                    <th style={{ width: "50%", textAlign: "center" }}>Customer Address:</th>
                                    <td>{orderData.customerAddress}</td>
                                </tr>
                                <tr>
                                    <th style={{ width: "50%", textAlign: "center" }}>Order Status:</th>
                                    <td>{orderData.orderStatus}</td>
                                </tr>
                            </tbody>
                        </table>
                        </div>
                        <div class="spinner-grow text-success" role="status">
                            <span class="visually-hidden">Loading...</span>
                        </div><div class="spinner-grow text-success" role="status">
                            <span class="visually-hidden">Loading...</span>
                        </div><div class="spinner-grow text-success" role="status">
                            <span class="visually-hidden">Loading...</span>
                        </div><div class="spinner-grow text-success" role="status">
                            <span class="visually-hidden">Loading...</span>
                        </div><div class="spinner-grow text-success" role="status">
                            <span class="visually-hidden">Loading...</span>
                        </div><div class="spinner-grow text-success" role="status">
                            <span class="visually-hidden">Loading...</span>
                        </div>
                </div>
            </div>

        </div>
    )
}