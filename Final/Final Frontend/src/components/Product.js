import React from "react";
import { Link } from "react-router-dom";
import{Card, CardBody, CardSubtitle, CardTitle,Button,Container,CardText} from "reactstrap";

function Product({product}){
    return (
        <div >
    <Card outline  color="dark" className="ms-3 shadow rounded "
  style={{
    width: '15rem',
    marginBottom:"4rem"
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
            <br></br>
            Author: {product.authorName}
            <br></br>
            Date: {product.publicationDate}
            <br></br>
            Edition: {product.edition}
            <br></br>
            Genre: {product.genre}
            <br></br>
            Stock: {product.stock}
            <br></br>
            Languages: {product.languages}
        </CardSubtitle>
            <Button color="warning" outline>Add to Cart</Button>
            
    </CardBody>
    </Card>
           
            
        </div>
    );
}

export default Product;