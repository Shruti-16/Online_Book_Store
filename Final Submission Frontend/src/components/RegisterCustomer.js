import { useState } from "react";
import Navbar from "./Navbar";
import LoginServiceCustomer from "../Service/authentication.service";
import { Dropdown } from "react-bootstrap";
import User from "../models/user";
import { toast } from "react-toastify";
import { useNavigate } from "react-router-dom";
import authenticationService from "../Service/authentication.service";

var ruserId;
var user;
function RegisterCustomer() {
    // const [user,setUser] = useState(new User('','','','','','','','','','','','','',''));
    // const [loading,setLoading] = useState(false);
    // const [submitted,setSubmitted] = useState(false);
    // const [errorMessage, setErrorMessage] = useState('');

    // const navigate = useNavigate();

    // const handleRegister = (e) =>{
    //     e.preventDefault();
    //     setSubmitted(true);
    //     console.log(user);

    //     setLoading(true);

    //     LoginServiceCustomer.register(user).then(_ =>{
    //         toast.success("User registered successfully..")
    //         navigate('/login-customer');
    //     }).catch(error =>{
    //         toast.success(`${error.response.data}`);
    //         console.log(error.response.data);
    //         if(error?.response?.status === 409){
    //             setErrorMessage('Email already exists!!!');
    //         }else{
    //             setErrorMessage(error.errorMessage);
    //         }
    //         setLoading(false);
    //     })
    // }

    // const handleChange = (event) =>{
    //     const {name,value} = event.target;
    //     setUser((prevState =>{
    //         return{
    //             ...prevState,[name]: value
    //         };
    //     }));
    // }
    let token = sessionStorage.getItem('user');
    const config = {
        //  headers: { Authorization: `Bearer ${token}` }
        headers: {
            'authorization': `Bearer ${token}`,
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    };

    const navigate = useNavigate();

    const [firstName, setFirstName] = useState('');
    const [lastName, setLastName] = useState('');
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [confirmPassword, setConfirmPassword] = useState('');
    const [dateOfBirth, setDateOfBirth] = useState('');
    const [addressLine1, setAddressLine1] = useState('');
    const [addressLine2, setAddressLine2] = useState('');
    const [city, SetCity] = useState('');
    const [phoneNumber, setPhoneNumber] = useState('');
    const [registeredDate, setRegisteredDate] = useState('');
    const [userImage, setUserImage] = useState([]);
    // roles.push('RO')
    const [status, setStatus] = useState('');
    const [pincode, setPincode] = useState('');
    const [country, setCountry] = useState('');
    const [userId, setUserId] = useState('');

    const handleRegister = (event) => {
        event.preventDefault();
        LoginServiceCustomer.registerUser(firstName, lastName, email, password, confirmPassword, dateOfBirth, addressLine1, addressLine2, city,pincode,country, phoneNumber, registeredDate).then((result) => {
            var msg = JSON.stringify(result.message);
            var idMessage = JSON.stringify(result.message);
            var ketos = (idMessage.slice(37, 40))
            ruserId = parseInt(ketos);
            // console.log(user);
            setStatus('Registration successful!');
            createCart(ruserId);
            navigate('/login-customer')
        }).catch((err) => {
            setStatus('Internal SERVER error...please try again after some time');
        });

    }

    const createCart = () => {
        LoginServiceCustomer.addUserCart(ruserId, config)
            .then((result) => {
                var msg = JSON.stringify(result.message);
                setStatus('Registration successful!!! Created the cart sucessfully!!!');
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
                                    <label className="form-label">Confirm Password</label>
                                    <div className="">
                                        <input className="form-control " type="password" placeholder="Confirm Password" value={confirmPassword} onChange={(event) => setConfirmPassword(event.target.value)} required></input>
                                    </div>
                                </div>

                                <div className="col-md-6 ">
                                    <label className="form-label">Date Of Birth</label>

                                    <div className="">
                                        <input className="form-control " type="date" value={dateOfBirth} onChange={(event) => setDateOfBirth(event.target.value)} required></input>
                                    </div>
                                </div>

                            </span>
                            <span className="row g-3 mb-2">
                                <div className="col-md-6">
                                    <label className="form-label">Address Line 1</label>
                                    <div className="">
                                        <input className="form-control " type="text" placeholder="Address Line 1" value={addressLine1} onChange={(event) => setAddressLine1(event.target.value)} required></input>
                                    </div>
                                </div>

                                <div className="col-md-6 ">
                                    <label className="form-label">Address Line 2
                                    </label>

                                    <div className="">
                                        <input className="form-control " type="text" placeholder="Address Line 2" value={addressLine2} onChange={(event) => setAddressLine2(event.target.value)} required></input>
                                    </div>
                                </div>

                            </span>

                            <span className="row g-3 mb-2">
                                <div className="col-md-6">
                                    <label className="form-label">Mobile No</label>
                                    <div className="">
                                        <input className="form-control " type="text" placeholder="Phone Number" value={phoneNumber} onChange={(event) => setPhoneNumber(event.target.value)} required></input>
                                    </div>
                                </div>

                                <div className="col-md-6">
                                    <label className="form-label">City</label>
                                    <input type="text" className="form-control " placeholder="City" value={city} onChange={(event) => SetCity(event.target.value)} required></input>
                                    <div className="valid-feedback">


                                    </div>
                                </div>

                            </span>
                            <span className="row g-3 mb-2">
                                <div className="col-md-6">
                                    <label className="form-label">Pincode</label>
                                    <div className="">
                                        <input className="form-control " type="text" placeholder="Pincode" value={pincode} onChange={(event) => setPincode(event.target.value)} required></input>
                                    </div>
                                </div>

                                <div className="col-md-6">
                                    <label className="form-label">Country</label>
                                    <input type="text" className="form-control " placeholder="Country" value={country} onChange={(event) => setCountry(event.target.value)} required></input>
                                    <div className="valid-feedback">


                                    </div>
                                </div>

                            </span>

                            <span className="row g-3 mb-2">
                                <div className="col-md-6">
                                    <label className="form-label">User Image</label>
                                    <div className="">
                                        <input className="form-control " type="file" placeholder="Customer Image" value={userImage} onChange={(event) => setUserImage(event.target.value)} required></input>
                                    </div>
                                </div>

                                <div className="col-md-6">
                                    <label className="form-label">Registered Date</label>
                                    <input type="date" className="form-control " value={registeredDate} onChange={(event) => setRegisteredDate(event.target.value)}></input>
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