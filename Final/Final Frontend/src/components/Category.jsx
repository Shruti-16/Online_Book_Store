// import axios from "axios";
// import { useEffect, useState } from "react";
// import Navbar from "./Navbar";
// import {Table} from 'react-bootstrap';
// import {Button} from 'reactstrap';
// import {toast} from 'react-toastify';
// import CartItemService from "../Service/CartItemService";
// function Category(){
//     //const [cartId,setCartId]=useState('');
//     //const [productId,setProductId]=useState(1);
//     const [quantity,setQuantity]= useState(1);
//     var productId;
//     var cartId;
//     let uId = sessionStorage.getItem('userId')
//     //setCartId(uId);
//     let token=sessionStorage.getItem('user');
//      const config = {
//         //  headers: { Authorization: `Bearer ${token}` }
//         headers: {
//             'authorization': `Bearer ${token}`,
//             'Accept' : 'application/json',
//             'Content-Type': 'application/json'
//         }
//      };
 

    
//     const [categoryList,setCategoryList]=useState([]);
//     const [singleProduct,setSingleProduct]=useState([]);
//     useEffect(function(){
//         axios.get("http://localhost:8080/categories")
//         .then((response)=>setCategoryList(response.data))
//         .then((error)=>console.log(error));
//     },[]);

//     const onddlChange=(e)=>{
//         //(e.target.value); 
//         //console.log(e);
//         axios.get("http://localhost:8080/categories/"+e.target.value)
//         .then((response)=>setSingleProduct(response.data))
//         .then((error)=>console.log(error));
//     }

//     const logOutUser=()=>{
//         if(sessionStorage.getItem('email')!=null){
//           alert('Thank you, shop again!!');
//           sessionStorage.removeItem('email');
//           sessionStorage.removeItem('user');
//           sessionStorage.removeItem('userId');
//         }else{
//           alert('Please signIn...');
//         }
        
        
        
//       }

//     const handleAddToCart=(productId)=>{let uId = sessionStorage.getItem('userId')
//         //event.preventDefault();
//         console.log(uId);
//         CartItemService.addCartItem(uId,productId,quantity,config)
//         .then((result) => {  

//           toast('Product added to cart!');
//           console.log(result);   
//         }).catch((err) => {
//             toast.error('Internal Server error');
//         });
        
//       }

    
    
//     return(
//         <div>
//             <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
//                 <div className="container-fluid" style={{marginLeft:"3rem"}}>
//                     <a className="navbar-brand" href="/">SHOPPING CART</a>
//                     <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
//                     <span className="navbar-toggler-icon"></span>
//                     </button>
//                     <div className="collapse navbar-collapse" id="navbarSupportedContent" style={{marginLeft:"22rem"}}>
//                     <ul className="navbar-nav me-auto mb-2 mb-lg-0">
//                         <li className="nav-item">
//                         <a className="nav-link " aria-current="page" href="/">Home</a>
//                         </li>
//                         <li className="nav-item">
//                         <a className="nav-link active " aria-current="page" href="/category">Categories</a>
//                         </li>

//                         <li className="nav-item">
//                         <a className="nav-link" href="/about">About Us</a>
//                         </li>
//                         <li className="nav-item">
//                         <a className="nav-link" href="/contact">Contact Us</a>
//                         </li>
                        

//                         <div className='buttons' style={{marginLeft:"20rem"}}>
//                             <a href='/login-customer' className='btn btn-outline-light'>
//                                 <i className='text-white '>Login  &#187;</i>
//                             </a>
//                             <a href='/register-customer' className='btn btn-outline-light ms-3'>
//                                 <i className='text-white '>Register &#187;</i>
//                             </a>
//                             <a href='/customer-cart' className='btn btn-outline-light ms-3'>
//                                 <i className='text-white '>Cart &#187;</i>
//                             </a>
//                             <a href='/login-customer' className='btn btn-outline-light ms-3'>
//                                 <i className='text-white ' onClick={logOutUser}>LogOut  &#187;</i>
//                             </a>
//                         </div>
                        
                        
//                     </ul>
                    
//                     </div>
//                 </div>
//             </nav>
                
                
//                 <div className="w3-sidebar w3-bar-block w3-black w3-large " style={{width:"200px"}}>
//                     <a href="/category" className="w3-bar-item w3-button" ><i className="fa fa-bars "> </i> Categories</a> 

//                         {
//                             categoryList.map((category)=>(
                                    
//                                  <button  className="w3-bar-item w3-button"onClick={onddlChange} key={category.id} value={category.id} > {category.categoryName}</button> //<i class="fa fa-arrow-right" >  </i>
//                             ))
//                         }
//                 </div>
//                 <div>           
//                 <div style={{marginLeft:"200px"}}>
                        
                    
//                         <div className="w3-container container-fluid category-table">
//                             <div className="row justify-content-evenly align-items-center m-5 ">
//                         {
//                                 singleProduct.map((product)=>(
//                             <div className="card catt" style={{width: "18rem"}}>
                            
//                             <img src={product.productImagePath} height='250rem'  className="card-img-top" alt="..."></img>
//                                 <div className="card-body"> {productId=product.id}{cartId=uId}
                                
//                                     <><h5 className="card-title"><b>Name : </b>{product.productName}</h5>
//                                     <p className="card-text"><b>Description: </b>{product.description}</p>
//                                     <p className="" ><b>Price: &#8377;</b><s>{product.markedPrice}</s> <b>{product.sellingPrice}</b></p>
//                                     <p><b>Availability: </b>{product.status} <b>{product.quantity} pcs</b></p>
//                                     <Button  className="btn btn-primary ms-5" onClick={()=>handleAddToCart(product.id)}>Add to Cart</Button></>
                                
//                                 </div>
                                
//                             </div>
                       
//                             ))
//                         }
//                         </div>
//                         </div>
                     


//                 </div>
                
//             </div> 

                         
                           
                            
 
                                    
//         </div>
//     )
// }

// export default Category;