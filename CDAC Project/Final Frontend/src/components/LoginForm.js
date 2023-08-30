import Navbar from "./Navbar";
import "../App.css"
import { useEffect, useState } from "react";
import handleCategory from "./Category";
import { render } from "@testing-library/react";
import Category from "./Category";
import { useNavigate } from "react-router-dom";
import LoginServiceCustomer from "../Service/LoginServiceCustomer";


function LoginForm(){

    const[userId, setuserId]=useState(0);
    const navigate = useNavigate();
    const[email, setEmail]=useState('');
    const[password, setPassword] = useState('');
    const[status, setStatus] = useState('');
    const handleSubmit=(event)=>{
        event.preventDefault();
        if(email===''||password===''){
            setStatus('Enter email id and password')
        }else{
            LoginServiceCustomer.validateuser(email,password).then((result) => {  
            console.log(email); 
            var msg=JSON.stringify(result.data.message);
            console.log(msg);
            console.log(result);
            // var userId=JSON.parse(result.data.userId);
            // setStatus(msg);
            // console.log(userId);
            // console.log(msg); 
            navigate("/books/getAllBooks");
            setuserId(userId);
            sessionStorage.setItem('userId',result.data.userDTO.userId);
            sessionStorage.setItem('email',email);
            sessionStorage.setItem("user",(result.data.userDTO));
            
            }).catch((err) => {setStatus('Invalid email or password..!')});
        }
    }

    return(
        <div>
            <Navbar></Navbar>

            <div className="container-fluid login-form " >
            <form onSubmit={handleSubmit}>
			<div className="row align-items-center justify-content-evenly " style={{height:"93vh"}}>
				<div className="col-4 align-self-center p-5 rounded">
                <h1 className="log-in-in mb-5">Sign In</h1>

				
					<div className="row m-4 align-items-center justify-content-evenly">
						<div className="col-10">
							<input className="form-control form-control " type="email" placeholder="Email" value={email} onChange={(event)=>setEmail(event.target.value) } required></input>
						</div>
					</div>
					
					<div className="row m-4 align-items-center justify-content-evenly">
						<div className="col-10">
							<input className="form-control form-control " type="password" placeholder="Password" value={password} onChange={(event)=>setPassword(event.target.value) } required></input>
						</div>
					</div>
					
					<div className="row m-4 align-items-center justify-content-evenly">
						<div className="col-10">
							<button className="btn btn-success rounded" type="submit">Login</button>
                            {status?<div className='text-success'>{status}</div>:null}
						</div>
					</div>
					
					<div className="row m-4 align-items-center justify-content-evenly">
						<div className="col-10">
							<span className="lastspan" >Not Registered? <a href="/users/register-customer" className="link-primary">Create an Account</a></span>
						</div>
					</div>
			
				</div>
                
			</div>
            
            </form>
		</div>

        </div>
    )
}

export default LoginForm;
// import React, { useState } from 'react';
// import Navbar from "./Navbar";
// import { useNavigate } from "react-router-dom";
// import LoginServiceCustomer from "../Service/LoginServiceCustomer";

// function LoginForm() {
//     const [userId, setUserId] = useState(0);
//     const navigate = useNavigate();
//     const [email, setEmail] = useState('');
//     const [password, setPassword] = useState('');
//     const [status, setStatus] = useState('');

//     const handleSubmit = async (event) => {
//         event.preventDefault();
        
//         if (email === '' || password === '') {
//             setStatus('Enter email id and password');
//         } else {
//             try {
//                 const result = await LoginServiceCustomer.validateuser(email, password);
//                 console.log(email); 
//                 console.log(password);
//                 const msg = JSON.stringify(result.data.message);
//                 console.log(msg);
//                 console.log(result);
//                 // const userId = JSON.parse(result.data.userId);
//                 // setStatus(msg);
//                 // console.log(userId);
//                 // console.log(msg); 
//                 navigate("/books/getAllBooks");
//                 setUserId(userId);
//                 sessionStorage.setItem('userId', userId);
//                 sessionStorage.setItem('email', email);
//                 // sessionStorage.setItem("user", (result.data.jwt));
              
//             } catch (error) {
//                 setStatus('Invalid User Details');
//             }
//         }
//     }

//     return (
//         <div>
//             <Navbar />
//             <div className="container-fluid login-form">
//                 <form onSubmit={handleSubmit}>
//                     <div className="row align-items-center justify-content-evenly" style={{ height: "93vh" }}>
//                         <div className="col-4 align-self-center p-5 rounded">
//                             <h1 className="log-in-in mb-5">Sign In</h1>
//                             <div className="row m-4 align-items-center justify-content-evenly">
//                                 <div className="col-10">
//                                     <input className="form-control form-control" type="email" placeholder="Email" value={email} onChange={(event) => setEmail(event.target.value)} required />
//                                 </div>
//                             </div>
//                             <div className="row m-4 align-items-center justify-content-evenly">
//                                 <div className="col-10">
//                                     <input className="form-control form-control" type="password" placeholder="Password" value={password} onChange={(event) => setPassword(event.target.value)} required />
//                                 </div>
//                             </div>
//                             <div className="row m-4 align-items-center justify-content-evenly">
//                                 <div className="col-10">
//                                     <button className="btn btn-success rounded" type="submit">Login</button>
//                                 </div>
//                             </div>
//                             <div className="row m-4 align-items-center justify-content-evenly">
//                                 <div className="col-10">
//                                     <span className="lastspan">Not Registered? <a href="/users/register-customer" className="link-primary">Create an Account</a></span>
//                                 </div>
//                             </div>
//                         </div>
//                     </div>
//                 </form>
//             </div>
//         </div>
//     )
// }

// export default LoginForm;
