import React from "react";
import Navbar from "./Navbar";

function SignupForm(){

    return(
        <div>
           <Navbar></Navbar>

<div className="container-fluid register-form bg-secondary">
<div className="align-items-center justify-content-evenly "  style={{height:"100vh"}}>
<div className="col-6 align-self-center p-5  rounded" >
     <h1 className="log-in-in mb-5">Sign Up</h1>

    <form>
    {/* <span className="g-3 mb-2"> */}
    <div className="col-md-6">
    <label  className="form-label">First Name</label>
            <div className="">
                <input className="form-control " type="text" placeholder="First Name"  required></input>
            </div>
    </div>
    
    
    <div className="col-md-6">
    <label  className="form-label">Last Name</label>
            <div className="">
                <input className="form-control " type="text" placeholder="Last Name" required></input>
            </div>
    </div>

    
    {/* </span> */}
    {/* <span className="g-3 mb-2"> */}
    <div className="col-md-6">
    <label  className="form-label">Email</label>
            <div className="">
                <input className="form-control " type="email" placeholder="abc@gmail.com" required></input>
            </div>
    </div>
        
    <div className="col-md-6 ">
    <label  className="form-label">Password</label>

            <div className="">
                <input className="form-control " type="password" placeholder="*****" required></input>
            </div>
    </div>
    
    {/* </span> */}
     
     {/* <span className="g-3 mb-2"> */}
     <div className="col-md-6">
    <label  className="form-label">Mobile No</label>
            <div className="">
                <input className="form-control " type="text" placeholder="Mobile No" required></input>
            </div>
    </div>
    

    {/* </span>
    <span className="row g-3 mb-2"> */}

    <div className="col-md-6 mt-2">
        <div className="form-check">
        <input className="form-check-input " type="checkbox" value="" id="invalidCheck3" aria-describedby="invalidCheck3Feedback" required></input>
        <label className="form-check-label" for="invalidCheck3">
            Agree to terms and conditions
        </label>
        <div id="invalidCheck3Feedback" className="invalid-feedback">
            
        </div>
        </div>
    </div>
    {/* </span> */}
    <div className=" d-grid col-6 mb-2 ">
        <button className="btn btn-success rounded"   type="submit">Sign Up</button>
    </div>
    
    </form>
    
</div>

</div>
</div>  
        </div>
    )

}

export default SignupForm;