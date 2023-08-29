// import React, { useState, useEffect } from "react";
// import axios from 'axios';
// import { Table } from 'react-bootstrap';
// import { useNavigate } from "react-router-dom";
// import { toast } from "react-toastify";
// import { FaSignOutAlt, FaBook } from 'react-icons/fa';



// function Cart() {
//     const [quantity, setQuantity] = useState(0)
//     const [totalBill, setTotalBill] = useState(0)
//     const [productId, setProductId] = useState(0)
//     const [cartData, setCartData] = useState([])
//     const [uId, setUId] = useState(0);
//     const navigate = useNavigate();

//     // setProductId={subProduct.id}
//     // setQuantity(cart.quantity)
//     // {setTotalBill(cart.totalBill)}

//     let token = sessionStorage.getItem('user');
//     const userId = sessionStorage.getItem('userId');
//     console.log(token)

//     const config = {
//         withCredentials: false,
//         headers: {
//             Authorization: `Bearer ${token}`,
//             'Accept': 'application/json',
//             'Content-Type': 'application/json'
//         }
//     };

//     const getCartItems = () => {
//         axios.get("http://localhost:8080/carts/" + userId + "/cart", config)
//             .then((response) => {

//                 setCartData(response.data)
//                 console.log(response.data)

//             },
//                 (error) => {
//                     console.log(error)
//                     console.log(token);
//                 })
//     }

//     useEffect(() => {
//         getCartItems();
//     }, []);

//     const addToCart = (product) => {
//         const newItem = {
//           productId: product.id,
//           quantity: 1
          
//         };

//     const handleDeleteItem = (productId) => {
//         axios.delete(`http://localhost:8080/carts/${productId}`, config).then(
//             (response) => {
//                 toast.success("Product deleted sucessfully!!");
//                 window.location.reload();
//             },
//             (error) => {
//                 toast.error("Server error/insufficient privileges");
//             }
//         )


//     }

    






//     const navigateOrderItems = () => {
//         //quantity,product id,userid,total bill

//         var postItemInOrderItem = { productId, quantity, totalBill, uId };
//         axios.post("http://localhost:8080/orderItems/" + userId + "/addOrderItem", postItemInOrderItem, config)
//         console.log(totalBill)
//             .then((response) => setCartData(response.data))
//             .then((error) => console.log(error));
//         navigate('/orderitems')
//     }

//     //    const updateQuantity=()=>{
//     //     axios.put("http://localhost:9092/carts/update" ,config)
//     //     .then((response)=>setCartData(response.data))
//     //     .then((error)=>console.log(error));  
//     //    } 
//     return (
//         <React.Fragment>
//             <div className="container-fluid cart">
//                 <nav className="navbar navbar-expand-lg navbar-dark bg-dark" style={{ fontWeight: "bold" }}>
//                     <div className="container-fluid" style={{ marginLeft: "3rem" }}>
//                         <a className="navbar-brand" href="/"><FaBook height={65} width={90}></FaBook>OnlineBookStore</a>
//                         <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
//                             <span className="navbar-toggler-icon"></span>
//                         </button>
//                         <div className="collapse navbar-collapse" id="navbarSupportedContent" style={{ marginLeft: "30rem" }}>
//                             <ul className="navbar-nav me-auto mb-2 mb-lg-1">
//                                 {/* <li className="nav-item">
//                         <a className="nav-link " aria-current="page" href="/">Home</a>
//                         </li> */}
//                                 {/* <li className="nav-item">
//                         <a className="nav-link active" aria-current="page" href="/category" style={{fontSize:"1.3rem",marginRight:"1.2rem"}}>Genre</a>
//                         </li> */}

//                                 <li className="nav-item">
//                                     <a className="nav-link" href="/about" style={{ fontSize: "1.3rem", marginRight: "1.2rem" }}>About Us</a>
//                                 </li>
//                                 <li className="nav-item">
//                                     <a className="nav-link" href="/contact" style={{ fontSize: "1.3rem" }}>Contact Us</a>
//                                 </li>


//                                 <div className='buttons p-2' style={{ marginLeft: "30rem" }}>
//                                     {/* <a href='/login-customer' className='btn btn-outline-light'>
//                                 <i className='text-white '>Login  &#187;</i>
//                             </a>
//                             <a href='/register-customer' className='btn btn-outline-light ms-3'>
//                                 <i className='text-white '>Register &#187;</i>
//                             </a> */}
//                                     <a href='/logout' className='btn btn-light ms-3'>
//                                         {/* <i className='text-white '>Cart &#187</i> */}
//                                         Logout <FaSignOutAlt />
//                                     </a>
//                                 </div>


//                             </ul>

//                         </div>
//                     </div>
//                 </nav>
//                 <h1 className="text-center my-4" style={{ color: "Black" }}>My Cart</h1>
//                 <table className="table table-bordered table-hover table-striped text-center">
//                     <thead>
//                         <tr>
//                             <th>Product Name</th>
//                             <th>Product Image</th>
//                             <th>Price</th>
//                             <th>Quantity</th>
//                             <th>Total Price</th>
//                             {/* <th>Buy Now</th> */}
//                             <th>Delete</th>
//                         </tr>
//                     </thead>
//                     <tbody>
//                         {cartData.map(cart => {
//                             return (

//                                 <tr>
//                                     <td><img src={""} alt='l' height={200} width={150}/></td>
//                                     <td><b>{cart.productId.productName}</b></td>
//                                     <td><img src={cart.productId.productImagePath} alt='l' height={50} width={50} /></td>

//                                     <td>&#8377; {cart.productId.sellingPrice}</td>


//                                     <td><div >
//                                         {/* <button type="button"  onClick={()=>handleDecrement(cart.id)} className="input-group-text" >-</button> */}
//                                         <input type="number" className="form-control text-center" value={cart.quantity} />
//                                         {/* <button type="button" onClick={()=>handleIncrement(cart.id)} className="input-group-text" >+</button> */}
//                                     </div></td>
//                                     <td><input type='number' id='totalPrice' className="form-control" value={cart.productId.sellingPrice * cart.quantity} ></input></td>
//                                     {/* <td><button type="button" className="btn btn-warning button-cool" ><a href="/myorder">Buy Now</a></button></td> */}
//                                     <td><button className="btn btn-danger button-cool" onClick={() => handleDeleteItem(cart.id)}>Delete</button></td>
//                                 </tr>
//                             )
//                         })}

//                     </tbody>
//                 </table>
//                 <br/>
//                 <div className="mt-4" style={{textAlign:"right"}}>
//                     <a href="/myorder" className="btn btn-success m-3 px-4" style={{fontSize:"1.3rem"}}>Order Now</a>
//                 </div>
//             </div>
//         </React.Fragment>
//     )
//                     }

// }

// export default Cart;

import { useState,useEffect } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";


const Cart = () => {
    const [products, setProducts] = useState([]);
    const [cart, setCart] = useState([]);
    const [customer, setCustomer] = useState([]);
    const [name, setName] = useState("");
    const navigate= useNavigate();  
    useEffect(() => {
      axios
      //TODO user id
        .get(`http://localhost:8080/cart/cartDetails/${4}`)
        .then((response) => {
          setProducts(response.data.items.map((item) => item.product));
          setCart(response.data);
          console.log(response.data);
        })
        .catch((error) => {
          console.log(error);
        });
    }, []);

    const handleRemoveProduct=(productId)=>{
      //TODO user id
        axios.put(`http://localhost:8080/cart/removeItem/${4}/${productId}`)
        .then((response)=>{
          setProducts(response.data.items.map((item) => item.product));
          setCart(response.data);
          console.log(response.data);
        })
        .catch((error) => {
          console.log(error);
        });
    }
    const loadScript = (src) => {
      return new Promise((resolve) => {
        const script = document.createElement("script");
        script.src = src;
  
        script.onload = () => {
          resolve(true);
        };
  
        script.onerror = () => {
          resolve(false);
        };
  
        document.body.appendChild(script);
      });
    };
  
    // Function to display the Razorpay payment form
    const displayRazorPay = async (amount) => {
     
      try{

        
        alert(amount)
        const res = await loadScript("https://checkout.razorpay.com/v1/checkout.js");
        alert(res)
        if (!res) {
          alert("Failed to load Razorpay script. Please check your internet connection.");
          return;
        }
  
      const options = {
        key: "rzp_test_hRHaEIhkpd6odG",
        currency: "INR",
        amount: amount * 100,
        name: "Dream Deal",
        description: "Congratulations",
        handler: function (response) {
          alert("Payment successful");
          // Redirect or navigate to a success page
          navigate("/address");
        },
        prefill: {
          name: "Dream Deal",
        },
      };
  
      const paymentObject = new window.Razorpay(options);
    paymentObject.open();}
      catch (error) {
        console.error("An error occurred while displaying Razorpay:", error);
        alert("An error occurred while displaying Razorpay. Please try again.");
      }
    };
  
    return (
      <>
        <div class="h-screen bg-gray-100 pt-20">
          <h1 class="mb-10 text-center text-2xl font-bold">Cart Items</h1>
          <div class="mx-auto max-w-5xl justify-center px-6 md:flex md:space-x-6 xl:px-0">
            <div class="rounded-lg md:w-2/3">
              {products.map((product) => (
                <div class="justify-between mb-6 rounded-lg bg-white p-6 shadow-md sm:flex sm:justify-start">
                  <img
                    src={`http://localhost:8080/product/getimage/${product.id}`}
                    alt="product-image"
                    class="w-full rounded-lg sm:w-40"
                  />
                  <div class="sm:ml-4 sm:flex sm:w-full sm:justify-between">
                    <div class="mt-5 sm:mt-0">
                      <h2 class="text-lg font-bold text-gray-900">
                        {product.name}
                      </h2>
                      <p class="mt-1 text-xs text-gray-700">{product.description}</p>
                    </div>
                    <div class="mt-4 flex justify-between sm:space-y-6 sm:mt-0 sm:block sm:space-x-6">
                    
                      <div class="flex items-center space-x-4">
                      
                        <p class="text-sm"><b><u>{product.price} INR</u></b> </p>
                        <button
            class="middle none center rounded-lg bg-red-500 py-3 px-6 font-sans text-xs font-bold uppercase text-white shadow-md shadow-blue-950 transition-all hover:shadow-lg hover:shadow-black focus:opacity-[0.85] focus:shadow-none active:opacity-[0.85] active:shadow-none disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none"
            data-ripple-light="true" onClick ={()=>handleRemoveProduct(product.id)}
            
        >
            Remove
        </button>
                        
                      </div>
                    </div>
                  </div>
                  <br />
                  <br />
                  
                </div>
                
              ))}
            </div>
  
            <div class="mt-6 h-full rounded-lg border bg-white p-6 shadow-md md:mt-0 md:w-1/3">
              <div class="mb-2 flex justify-between">
                <p class="text-gray-700">Subtotal</p>
                <p class="text-gray-700">{cart.totalCartPrice}</p>
              </div>
              <div class="flex justify-between">
                <p class="text-gray-700">Shipping</p>
                <p class="text-gray-700"> 100 INR</p>
              </div>
              <hr class="my-4" />
              <div class="flex justify-between">
                <p class="text-lg font-bold">Total</p>
                <div class="">
                  <p class="mb-1 text-lg font-bold">
                    {cart.totalCartPrice + 100 } INR
                  </p>
                  <p class="text-sm text-gray-700">including GST</p>
                </div>
              </div>
              <button class="mt-6 w-full rounded-md bg-blue-500 py-1.5 font-medium text-blue-50 hover:bg-blue-600"  onClick={()=>displayRazorPay(cart.totalCartPrice + 100 )}>
                Check out
              </button>
            </div>
          </div>
        </div>
      </>
    );
  };
  
  export default Cart;