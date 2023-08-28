import React from "react";
import axios from "axios";
import { Link } from "react-router-dom";
import { Card, CardBody, CardSubtitle, CardTitle, Button } from "reactstrap";
import { toast } from "react-toastify";
import { useState } from "react";
import LoginServiceCustomer from "../Service/LoginServiceCustomer";

// const addToCart = (productId) => {
//   let user = sessionStorage.getItem("user");
//   let id = user.userId;

  // const newItem = {
  //   productId: productId,
  //   quantity:
  //   // Other properties you might need
  // };

//   LoginServiceCustomer.buyNow(id)
//     .then((response) => {
//       toast.success("Product added to cart!");
//       // // Refresh the cart items
//       // getCartItems();
//     })
//     .catch((error) => {
//       toast.error("Error adding product to cart.");
//       console.error(error);
//     });
// };

// function Product({ product, addToCart }) {
  function Product({ userId,product }) {
    const [addingToCart, setAddingToCart] = useState(false);
  
    const addToCart = async () => {
      setAddingToCart(true);
      try {
        const token = sessionStorage.getItem('user');
        const config = {
          headers: {
            Authorization: `Bearer ${token}`,
            'Accept': 'application/json',
            'Content-Type': 'application/json'
          }
        };
  
        const response = LoginServiceCustomer.addToCart(userID,product.id),
          {},
          config
        );
  
        if (response.status === 200) {
          toast.success("Product added to cart!");
        }
      } catch (error) {
        toast.error("Error adding product to cart.");
      }
      setAddingToCart(false);
    };
  

  // Generate a random seed value (you can use a library for more randomness)
  const randomSeed = Math.floor(Math.random() * 1000);

  // Set the dimensions for the image (e.g., 300x200)
  const width = 300;
  const height = 200;

  // Construct the complete image URL
  const imageUrl = `https://picsum.photos/seed/${randomSeed}/${width}/${height}`;


  return (
    <div>
      <Card
        outline
        color="dark"
        className="ms-3 shadow rounded"
        style={{
          width: "15rem",
          marginBottom: "4rem",
        }}
      >
        <img
          alt="Sample"
          src={imageUrl} // Use the dynamically generated image URL
        />
        <CardBody>
          <CardTitle tag="h5">
            <Link to={`/books/${product.id}`}>{product.title}</Link>
          </CardTitle>

          <CardSubtitle className="mb-2 text-primary" tag="h6">
            Marked Price: {product.markedPrice}
            <br />
            Selling Price: {product.sellingPrice}
            <br />
            Author: {product.authorName}
            <br />
            Publication Date: {product.publicationDate}
            <br />
            Edition: {product.edition}
            <br />
            Genre: {product.genre}
            <br />
            Stock: {product.stock}
            <br />
          </CardSubtitle>
          <Button color="warning" outline onClick={() => addToCart(product.id)}>
            Add to Cart
          </Button>
        </CardBody>
      </Card>
    </div>
  );
}


export default Product;
