import { useState } from "react";
import Navbar from "./Navbar";

import LoginServiceCustomer from "../Service/LoginServiceCustomer";
import { Dropdown } from "react-bootstrap";

var ruserId;
var user;
function RegisterCustomer() {
    let token = sessionStorage.getItem('user');
    const config = {
        //  headers: { Authorization: `Bearer ${token}` }
        headers: {
            'authorization': `Bearer ${token}`,
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    };

    const [firstName, setFirstName] = useState('');
    const [lastName, setLastName] = useState('');
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [mobileNumber, setMobileNumber] = useState('');
    const [registeredDate, setRegisteredDate] = useState(Date.now);
    const [roles, setRoles] = useState([]);
    roles.push('ROLE_CUSTOMER')
    const [status, setStatus] = useState('');
    const [userId, setUserId] = useState('');

    const handleRegister = (event) => {
        event.preventDefault();
        LoginServiceCustomer.registerUser(firstName, lastName, email, password, mobileNumber, registeredDate, roles).then((result) => {
            var msg = JSON.stringify(result.message);
            var idMessage = JSON.stringify(result.data.message);
            var ketos = (idMessage.slice(37, 40))
            ruserId = parseInt(ketos);
            console.log(user);
            setStatus('Registration successful!');
            createCart(ruserId);
        }).catch((err) => {
            setStatus('Internal SERVER error...please try again after some time');
        });

    }

    const createCart = () => {
        LoginServiceCustomer.addUserCart(ruserId, config)
            .then((result) => {
                var msg = JSON.stringify(result.message);
                setStatus('Registration successful!');
            }).catch((err) => {
                setStatus('Does not create cart');
            });

    }


    // const handleSignUp=(event)=>{
    //     event.preventDefault();
    //     GoldenGoodsService.registeruser(firstname,lastname,email,password,mobileNumber,registeredDate,roles).then((result) => {
    //       var msg=JSON.stringify(result.message);  
    //       setStatus(msg);   
    //     }).catch((err) => {
    //         setStatus('Internal SERVER error...please try again after some time');
    //     });

    //   } 

    return (
        <div>
            <Navbar></Navbar>

            <div className="container-fluid register-form">
                <div className="row align-items-center justify-content-evenly " style={{ height: "100vh" }}>
                    <div className="col-6 align-self-center p-5  rounded" >
                        <h1 className="log-in-in mb-5">Register User</h1>

                        <form onSubmit={handleRegister}>
                            <span className="row g-3 mb-2">
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
                            <span className="row g-3 mb-2">
                                <div className="col-md-6">
                                    <label className="form-label">Email</label>
                                    <div className="">
                                        <input className="form-control " type="email" placeholder="abc@gmail.com" value={email} onChange={(event) => setEmail(event.target.value)} required></input>
                                    </div>
                                </div>

                                <div className="col-md-6 ">
                                    <label className="form-label">Password</label>

                                    <div className="">
                                        <input className="form-control " type="password" placeholder="****" value={password} onChange={(event) => setPassword(event.target.value)} required></input>
                                    </div>
                                </div>

                            </span>

                            <span className="row g-3 mb-2">
                                <div className="col-md-6">
                                    <label className="form-label">Mobile No</label>
                                    <div className="">
                                        <input className="form-control " type="text" placeholder="Mobile No" value={mobileNumber} onChange={(event) => setMobileNumber(event.target.value)} required></input>
                                    </div>
                                </div>

                                <div className="col-md-6">
                                    <label for="validationServer02" className="form-label">City</label>
                                    <input type="text" className="form-control " placeholder="City" id="validationServer02" value={setRegisteredDate}></input>
                                    <div className="valid-feedback">


                                    </div>
                                </div>

                            </span>

                            <span className="row g-3 mb-2">
                                <div className="col-md-6">
                                    <label className="form-label">Country</label>
                                    <div className="">
                                        <input className="form-control " type="text" placeholder="Country" value={mobileNumber} onChange={(event) => setMobileNumber(event.target.value)} required></input>
                                    </div>
                                </div>

                                <div className="col-md-6">
                                    <label for="validationServer02" className="form-label">Registered Date</label>
                                    <input type="date" className="form-control " id="validationServer02" value={setRegisteredDate} disabled></input>
                                    <div className="valid-feedback">

                                    </div>
                                </div>
                            </span>
                            <span className="row g-3 mb-2">

                                {/* <div className="col-12 mt-4 ">
                                    <div className="form-check">
                                        <input className="form-check-input " type="checkbox" value="" id="invalidCheck3" aria-describedby="invalidCheck3Feedback" required></input>
                                        <label className="form-check-label" for="invalidCheck3">
                                            Agree to terms and conditions
                                        </label>
                                        <div id="invalidCheck3Feedback" className="invalid-feedback">

                                        </div>
                                    </div>
                                </div> */}
                            </span>
                            <br></br>
                            <div className=" d-grid gap-2 col-6 mx-auto mb-2 ">
                                <button className="btn btn-success rounded" type="submit">Register</button>
                                {status ? <div className='text-success'>{status}</div> : null}
                            </div>

                        </form>

                    </div>

                </div>
            </div>
        </div>
    )
}

export default RegisterCustomer;