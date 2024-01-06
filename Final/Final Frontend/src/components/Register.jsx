import { useState } from "react";
import Navbar from "./Navbar";
import LoginService from "../LoginService";
import axios from "axios";
import LoginServiceCustomer from "../Service/LoginServiceCustomer";
import { useHistory, useLocation } from "react-router-dom";
var ruserId;
function Register() {

    const [firstName, setFirstName] = useState('');
    const [lastName, setLastName] = useState('');
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [mobileNumber, setMobileNumber] = useState('');
    const [registeredDate, setRegisteredDate] = useState(Date.now);
    const [userRoles, setUserRoles] = useState([]);
    userRoles.push('ROLE_CUSTOMER')
    const [status, setStatus] = useState('');

    const createCart = (event) => {
        event.preventDefault();
        LoginServiceCustomer.addUserCart(ruserId).then((result) => {
            var msg = JSON.stringify(result.message);
            var ruserId=msg.slice(37, );
            console.log(ruserId);
            console.log(result);
            setStatus('Cart created sucessfully!');

        }).catch((err) => {
            setStatus('Unable to create cart');
        });

    }

    const updateUser = (event) => {
        event.preventDefault();
        LoginService.registerUser(firstName, lastName, email, password, mobileNumber, registeredDate, userRoles).then((result) => {
            var msg = result.message;
            console.log(msg);
            createCart(ruserId);
            setStatus('Registration successful!');

        }).catch((err) => {
            setStatus('Invalid Data...please try again ');
        });
        console.log("before add cart method");
        
        console.log("After add cart method");
    }

    return (
        <div>

            <div className="container-fluid register-form">
                <div className="row align-items-center justify-content-evenly " style={{ height: "41.8rem" }}>
                    <div className="col-6 align-self-center p-5 ">
                        <form onSubmit={updateUser}>
                            <span className="row g-3">
                                <div className="col-md-6">
                                    <label className="form-label">First Name</label>
                                    <div className="">
                                        <input className="form-control " type="text" placeholder="First Name" value={firstName} onChange={(event) => setFirstName(event.target.value)} required></input>
                                    </div>
                                </div>


                                <div className="col-md-6">
                                    <label className="form-label">Last Name</label>
                                    <div className="">
                                        <input className="form-control " type="text" placeholder="Last Name" value={lastName} onChange={(event) => setLastName(event.target.value)} required></input>
                                    </div>
                                </div>


                            </span>
                            <span className="row g-3">
                                <div className="col-md-6">
                                    <label className="form-label">Email</label>
                                    <div className="">
                                        <input className="form-control " type="email" placeholder="username" value={email} onChange={(event) => setEmail(event.target.value)} required></input>
                                    </div>
                                </div>

                                <div className="col-md-6">
                                    <label className="form-label">Password</label>

                                    <div className="">
                                        <input className="form-control " type="password" placeholder="password" value={password} onChange={(event) => setPassword(event.target.value)} required></input>
                                    </div>
                                </div>
                                {/* <div className="col-md-6">
                    <label for="validationServerUsername" className="form-label">Email</label>
                    <div className="input-group has-validation">
                    <input type="text" className="form-control " value={setEmail} onChange={(event)=>setEmail(event.target.value) } id="validationServerUsername" aria-describedby="inputGroupPrepend3 validationServerUsernameFeedback" required></input>
                    <div id="validationServerUsernameFeedback" className="invalid-feedback">
                        
                    </div>
                    </div>
                </div>
                
                <div className="col-md-6">
                    <label for="validationServer03" className="form-label">Password</label>
                    <input type="password" className="form-control" id="validationServer03" onChange={(event)=>setPassword(event.target.value) } value={setPassword} aria-describedby="validationServer03Feedback" required></input>
                    <div id="validationServer03Feedback" className="invalid-feedback">
                    
                    </div>
                </div> */}
                            </span>

                            <span className="row g-3">
                                <div className="col-md-6">
                                    <label className="form-label">Mobile No</label>
                                    <div className="">
                                        <input className="form-control " type="text" placeholder="Mobile No" value={mobileNumber} onChange={(event) => setMobileNumber(event.target.value)} required></input>
                                    </div>
                                </div>

                                <div className="col-md-6">
                                    <label for="validationServer02" className="form-label">Registered Date</label>
                                    <input type="date" className="form-control " id="validationServer02" value={setRegisteredDate} disabled></input>
                                    <div className="valid-feedback">

                                    </div>
                                </div>
                            </span>
                            <span className="row g-3">

                                <div className="col-12">
                                    <div className="form-check">
                                        <input className="form-check-input " type="checkbox" value="" id="invalidCheck3" aria-describedby="invalidCheck3Feedback" required></input>
                                        <label className="form-check-label" for="invalidCheck3">
                                            Agree to terms and conditions
                                        </label>
                                        <div id="invalidCheck3Feedback" className="invalid-feedback">

                                        </div>
                                    </div>
                                </div>
                            </span>
                            <div className="col-12">
                                <button className="btn btn-primary " style={{ marginLeft: "19.5rem" }} onClick={createCart} type="submit">Submit form</button>
                                {status ? <div className='text-success'>{status}</div> : null}
                            </div>

                        </form>

                    </div>

                </div>
            </div>
        </div>
    )
}

export default Register;