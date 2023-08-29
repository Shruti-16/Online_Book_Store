import { useState } from "react";
import LoginService from "../../LoginService";
import { toast } from "react-toastify"
import { useNavigate } from "react-router-dom";

var userId;
function RegisterAdmin() {
    const [firstName, setFirstName] = useState('');
    const [lastName, setLastName] = useState('');
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [confirmPassword, setConfirmPassword] = useState('');
    const [phoneNumber, setPhoneNumber] = useState('');
    const [city, setCity] = useState('');
    const [country, setCountry] = useState('');
    const [role, setRole] = useState('ADMIN');
    const [status, setStatus] = useState('');
    const [address, setAddress] = useState('');
    const [dateOfBirth, setDateOfBirth] = useState('');
    // roles.push('ROLE_ADMIN')
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

    const handleRegister = (event) => {
        event.preventDefault();
        LoginService.registerAdmin(firstName, lastName, email, password,confirmPassword,dateOfBirth, phoneNumber, address,city,role, config).then((result) => {
            var msg = JSON.stringify(result.message);
            // var idMessage = JSON.stringify(result.data.message);
            // var ketos = (idMessage.slice(37, 40));
            // ruserId = parseInt(ketos);
            toast.success('Registration successful!');
            createCart(userId);
            navigate("/users/admin-login")
        }).catch((err) => {
            console.log(config);
            toast.error('Internal SERVER error');
        });

    }


    const createCart = () => {
        LoginService.addAdminCart(userId, config)
            .then((result) => {
                var msg = JSON.stringify(result.message);
                setStatus('Cart created successful!');
            }).catch((err) => {
                setStatus('Does not create cart');
            });

    }


    return (
        <div className=" shadow admin-page pt-5" style={{ color: "white", backgroundColor: "#28282B" }}>
            <h1 className="text-center pt-5 mb-5" style={{ color: "" }}>Admin Registration</h1>
            <div className="row align-items-center justify-content-evenly">
                <div className="col-6 align-self-center">
                    <form onSubmit={handleRegister}>
                        <span className="row g-3 mb-2">

                            <div className="col-md-6">
                                <label className="form-label">First Name</label>
                                <div className="">
                                    <input className="form-control" type="text" placeholder="First Name" value={firstName} onChange={(event) => setFirstName(event.target.value)} required></input>
                                </div>
                            </div>

                            <div className="col-md-6">
                                <label className="form-label">Last Name</label>
                                <div className="">
                                    <input className="form-control" type="text" placeholder="Last Name" value={lastName} onChange={(event) => setLastName(event.target.value)} required></input>
                                </div>
                            </div>
                        </span>

                        <span className="row g-3 mb-2">

                            <div className="col-md-6">
                                <label className="form-label">Email</label>
                                <div className="">
                                    <input className="form-control" type="text" placeholder="Email" value={email} onChange={(event) => setEmail(event.target.value)} required></input>
                                </div>
                            </div>

                            <div className="col-md-6">
                                <label className="form-label">Password</label>
                                <div className="">
                                    <input className="form-control" type="password" placeholder="*******" value={password} onChange={(event) => setPassword(event.target.value)} required></input>
                                </div>
                            </div>
                        </span>

                        <span className="row g-3 mb-2">

                            <div className="col-md-6">
                                <label className="form-label">Confirm Password</label>
                                <div className="">
                                    <input className="form-control" type="password" placeholder="*****" value={confirmPassword} onChange={(event) => setConfirmPassword(event.target.value)} required></input>
                                </div>
                            </div>
                            <div className="col-md-6">
                                <label className="form-label">Date Of Birth</label>
                                <div className="">
                                    <input className="form-control" type="date" value={dateOfBirth} onChange={(event) => setDateOfBirth(event.target.value)} required></input>
                                </div>
                            </div>

                            
                            </span>
                        <span className="row g-3 mb-2">
                        <div className="col-md-6">
                                <label className="form-label">Mobile No</label>
                                <div className="">
                                    <input className="form-control" type="text" placeholder="Mobile Number" value={phoneNumber} onChange={(event) => setPhoneNumber(event.target.value)} required></input>
                                </div>
                            </div>
                        

                            <div className="col-md-6">
                                <label className="form-label">Address</label>
                                <div className="">
                                    {/* <input className="form-control" type="text" placeholder="City" value={city} onChange={(event) => setCity(event.target.value)} required></input> */}
                                    <textarea className="form-control" placeholder="Address" value={address} onChange={(event) => setAddress(event.target.value)} required></textarea>
                                </div>
                            </div>

                           
                        </span>
                        <span className="row g-3 mb-2">
                        <div className="col-md-6">
                                <label className="form-label">City</label>
                                <div className="">
                                    <input className="form-control" type="text" placeholder="City" value={city} onChange={(event) => setCity(event.target.value)} required></input>
                                </div>
                            </div>

                            {/* <div className="col-md-6">
                                <label className="form-label">Country</label>
                                <div className="">
                                    <input className="form-control" type="text" placeholder="Country" value={country} onChange={(event) => setCountry(event.target.value)} required></input>
                                </div>
                            </div> */}
                            <div className="col-md-6">
                                <label className="form-label">Role</label>
                                <div className="">
                                    <input className="form-control" type="text" value={role} onChange={(event) => setRole(event.target.value)} disabled></input>
                                </div>
                            </div>
                            </span>

                            {/* <span className="row g-3 mb-2">
                            
                        </span> */}

                        <span className="row g-3 mb-2">

                            <div className="col-md-6">
                                <div style={{ textAlign: "right" }}>
                                    <button className="btn btn-primary rounded" type="submit">Register</button>
                                </div>
                            </div>

                            <div className="col-md-6">
                                <div className="">
                                    <button className="btn btn-secondary rounded" type="reset">Clear</button>
                                </div>
                            </div>
                        </span>
                    </form>
                </div>
            </div>
        </div>
    );
}
export default RegisterAdmin;