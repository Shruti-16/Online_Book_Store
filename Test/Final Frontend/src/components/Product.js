import React from "react";
import { Link } from "react-router-dom";
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
        <Link to={`/books/${product.id}`}>{product.title}</Link>
            {/* {product.title} */}
        </CardTitle>
        
        <CardText>
            {product.description}
        </CardText>
        <CardSubtitle
        className="mb-2 text-primary"
        tag="h6"
        >
            Marked Price :{product.Markedprice}
            <br></br>
            Selling Price: {product.Sellingprice}
        </CardSubtitle>
            <Button color="warning" outline>Add to Cart</Button>
            
    </CardBody>
    </Card>
           
            
        </div>
    );
}

export default Product;