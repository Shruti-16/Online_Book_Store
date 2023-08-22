import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import {FormEvent} from 'react';
import { Container } from 'reactstrap';
import LoginService from '../LoginService';

const LogIn = () => {
    const [email,setEmail]=useState('');
    const [password,setPassword]=useState('');
    const [status,setStatus]=useState('');
    const navigate = useNavigate();
    const handleSubmit=(event)=>{

        event.preventDefault();
        if(email===''||password===''){
            setStatus('Enter email id and password')
        }else{
            LoginService.validateuser(email,password).then((result) => {   
            var msg=JSON.stringify(result.data.message);
            console.log(result);
            console.log('recieved from server');
            navigate("/admin");
            setStatus(msg); 
            sessionStorage.setItem('email',email);
             console.log(result.data.jwt);
            sessionStorage.setItem("user",result.data.jwt);
            }).catch((err) => { setStatus('Invalid User Details')});
        }
    }
  return (
    <React.Fragment>
        <div className='row admin-page align-items-center justify-content-center '>
            <div className='col-md-3'>

            </div>
            <div className='col-md-4'>
                <div className='card' >
                    <div className='card-header bg-info' style={{textAlign:'center'}}>
                        <h2>LogIn</h2>
                    </div>
                    <div className='card-body'>
                        <form onSubmit={handleSubmit}>
                            <div className='form-group' >
                                <label>EmailId:</label>
                                <input type='email' className='form-control' value={email} name='email' placeholder='Enter email Id' onChange={(event)=>setEmail(event.target.value) }/>
                            </div>
                            <div className='form-group' >
                                <label>Password:</label>
                                <input type='password' className='form-control' value={password} name='password' placeholder='Enter password' onChange={(event)=>setPassword(event.target.value) }/>
                            </div>
                            <Container className="text-center mt-3">
                            <button type='submit' className='btn btn-primary button-cool'>LogIn</button></Container>
                            {status?<div className='text-success'>{status}</div>:null}
                        </form>
                    </div>
                </div>
            </div>
            <div className='col-md-3'>

            </div>
        </div>
    </React.Fragment>
  )
}

export default LogIn;