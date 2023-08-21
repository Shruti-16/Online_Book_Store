import { useState } from "react";
import LoginService from "../../LoginService";
import {Container,Button,Form, FormGroup,Row,Col} from "reactstrap"
import{toast} from "react-toastify"
import axios from "axios";
import LoginServiceCustomer from "../../Service/LoginServiceCustomer";

var ruserId;
function RegisterAdmin (){
    const[firstName, setFirstName]=useState('');
    const[lastName, setLastName]=useState('');
    const[email, setEmail]=useState('');
    const[password, setPassword]=useState('');
    const[mobileNumber, setMobileNumber]=useState('');
    const[registeredDate, setRegisteredDate]=useState(Date.now);
    const[roles, setRoles]=useState([]);
    const[status, setStatus]=useState('');
    roles.push('ROLE_ADMIN')
    let token=sessionStorage.getItem('user');
    const config = {
        //  headers: { Authorization: `Bearer ${token}` }
        headers: {
            'authorization': `Bearer ${token}`,
            'Accept' : 'application/json',
            'Content-Type': 'application/json'
        }
     };

    const handleRegister=(event)=>{
        event.preventDefault();
        LoginService.registerAdmin(firstName, lastName, email, password, mobileNumber, registeredDate, roles,config).then((result) => {
            var msg=JSON.stringify(result.message);  
            var idMessage=JSON.stringify(result.data.message);
            var ketos=(idMessage.slice(37,40));
            ruserId=parseInt(ketos);
          toast.success('Registration successful!');
          createCart(ruserId);    
        }).catch((err) => {
            console.log(config);
            toast.error('Internal SERVER error');
        });
        
      }

      
    const createCart=()=>{
        LoginService.addAdminCart(ruserId,config)
        .then((result)=>{
            var msg = JSON.stringify(result.message);
            setStatus('Cart created successful!');   
        }).catch((err) => {
            setStatus('Does not create cart');
        });
        
      }


    return(
        <div className=" shadow admin-page" style={{color:"white",backgroundColor:"#28282B"}}>
        <h2 className="text-center pt-5" style={{color:""}}>Register User</h2>
        <Container>
            <Row className="text-center justify-content-evenly align-items-center p-2 mt-3">
                <Col className="col-5">
            <Form onSubmit={handleRegister}>
            <FormGroup>
            <label  className="form-label">First Name</label>
            <input className="form-control " type="text" placeholder="First Name" value={firstName} onChange={(event)=>setFirstName(event.target.value) } required></input>
            </FormGroup>
            <FormGroup>
                <label  className="form-label">Last Name</label>
			    <input className="form-control " type="text" placeholder="Last Name" value={lastName} onChange={(event)=>setLastName(event.target.value) } required></input>
            </FormGroup>
            <FormGroup>
                <label  className="form-label">Email</label>
				<input className="form-control " type="email" placeholder="username" value={email} onChange={(event)=>setEmail(event.target.value) } required></input>	
            </FormGroup>
            <FormGroup>
                <label  className="form-label">Password</label>
                <input className="form-control " type="password" placeholder="password" value={password} onChange={(event)=>setPassword(event.target.value) } required></input>
            </FormGroup>
            <FormGroup>
                    <label  className="form-label">Mobile No</label>
					<input className="form-control " type="text" placeholder="Mobile No" value={mobileNumber} onChange={(event)=>setMobileNumber(event.target.value) } required></input>	
            </FormGroup>
            <FormGroup>
                <label for="validationServer02" className="form-label">Registered Date</label>
                <input type="date" className="form-control " id="validationServer02" value={setRegisteredDate}  disabled></input>
            </FormGroup>
            <FormGroup>
                <input className="form-check-input " type="checkbox" value="" id="invalidCheck3" aria-describedby="invalidCheck3Feedback" required></input>
                    <label className="form-check-label" for="invalidCheck3">
                        Agree to terms and conditions
                    </label>
            </FormGroup>
            <Container className="">
                <Button  className="button-cool rounded " color="success" type="submit">Register</Button>
                <Button  className="ms-2 mt-2 button-cool"color="warning" type="reset">Clear</Button>
            </Container>
        </Form>
        </Col>
        </Row>
        </Container>
        </div>
    );
}
export default RegisterAdmin;