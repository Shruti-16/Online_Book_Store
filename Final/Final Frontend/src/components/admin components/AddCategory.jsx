// import React from "react";
// import { useState } from "react";
// import {Form,Button,Container,FormGroup,Row,Col} from "reactstrap";
// import CategoryService from "../../CategoryService";
// import {toast} from "react-toastify";

// function AddCategory(){
//  const[categoryName, setCategoryName]=useState('');
//  let token=sessionStorage.getItem('user');
//     const config = {
//         headers: {
//             'authorization': `Bearer ${token}`,
//             'Accept' : 'application/json',
//             'Content-Type': 'application/json'
//         }
//      };

//  const handleadd=(event)=>{
//     event.preventDefault();
//     CategoryService.addCategory(categoryName,config).then((result) => {
//         var msg=JSON.stringify(result.message);  
//         toast.success('Registration successful!');   
//       }).catch((err) => {
//           toast.error('Internal SERVER error...please try again after some time');
//       });

//  }

//     return(
//         <div className="border border-dark rounded shadow p-2 admin-page" style={{color:"white",backgroundColor:"#28282B"}}>
//         <h2 className="text-center pt-5 ">Add category</h2>
//         <Container>
//             <Row className="text-center justify-content-center align-items-center mt-5">
//                 <Col className="col-3 shadow">
//         <Form onSubmit={handleadd}>
//             <FormGroup>
//             <label  className="form-label">Category Name:</label>
//             <input className="form-control " type="text" placeholder="First Name" value={categoryName} onChange={(event)=>setCategoryName(event.target.value) } required></input>
//             </FormGroup>
//             <Container className="text-center">
//                 <Button className="button-cool" color="info" type="submit">Add</Button>
//             </Container>
//         </Form>
//         </Col>
//         </Row>
//         </Container>
//         </div>
//     );
// }

// export default AddCategory;