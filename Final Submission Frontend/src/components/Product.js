import React from "react";
import{Card, CardBody, CardSubtitle, CardTitle,Button,Container,CardText} from "reactstrap";

function Product({product}){
    return (
        <div >
    <Card outline  color="dark" className="ms-3 shadow rounded "
  style={{
    width: '15rem'
  }}
>
    <img classname=""
    alt="Sample"
    src="https://picsum.photos/300/200"
    />
    <CardBody>
        <CardTitle tag="h5">
            {product.title}
        </CardTitle>
        
        <CardText>
            {product.description}
        </CardText>
        <CardSubtitle
        className="mb-2 text-primary"
        tag="h6"
        >
            Selling Price: {product.price}
        </CardSubtitle>
            <Button color="warning" outline>Add to Cart</Button>
            <Button className="mx-2" color="danger" outline> Delete </Button>
    </CardBody>
    </Card>
           
            
        </div>
    );
}

export default Product;