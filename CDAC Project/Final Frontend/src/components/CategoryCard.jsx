// import React from "react";
// import{Card, CardBody, CardSubtitle, CardTitle,Button,Container,CardText,Form} from "reactstrap";
// import axios from "axios";
// import {toast} from "react-toastify";

// function CategoryCard ({category}){
//     let token=sessionStorage.getItem('user');
//      const config = {
//          headers: { Authorization: `Bearer ${token}` }
//      };
//     const deleteCategory=(id)=>{
//         axios.delete(`http://localhost:8080/categories/${id}`,config).then(
//             (response)=>{
//                 toast.success("Category deleted sucessfully!!");
//                 window.location.reload();

//             },
//             (error)=>{
//                 toast.error("This category contains products, cannot be deleted!!!");
//             }
//         )
//     }

//     return(
//         <Form>
//         <Card color="dark" className="shadow my-3 text-center">
//             <CardBody style={{color:"white"}}>
//             <CardTitle  tag="h5">
//              {category.categoryName}
//             </CardTitle>
//             <CardSubtitle
//             className="mb-2 text-primary"
//             tag="h6">
//             Category Id: {category.id}
//             </CardSubtitle>
//             <Container className="text-center">
//             <Button className="button-cool" color="danger" onClick={()=>{deleteCategory(category.id);}}>Delete</Button>
//             </Container>
//             </CardBody>
//         </Card>
//         </Form>
  
//     );

// }

// export default CategoryCard;