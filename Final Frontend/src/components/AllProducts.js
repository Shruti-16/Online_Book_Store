import React, { useState } from "react";
import { Row, Col, Navbar } from "reactstrap";
import Product from "./Product";

function AllBooks() {
  const [products] = useState([
    {
      title: "Book 1",
      description: "Description for Book 1",
      price: "19.99",
    },
    {
      title: "Book 2",
      description: "Description for Book 2",
      price: "24.99",
    },
    {
      title: "Book 3",
      description: "Description for Book 3",
      price: "29.99",
    },
    {
      title: "Book 4",
      description: "Description for Book 4",
      price: "14.99",
    },
    {
      title: "Book 5",
      description: "Description for Book 5",
      price: "9.99",
    },
    {
        title: "Book 6",
        description: "Description for Book 3",
        price: "29.99",
      },
      {
        title: "Book 7",
        description: "Description for Book 4",
        price: "14.99",
      },
      {
        title: "Book 8",
        description: "Description for Book 5",
        price: "9.99",
      },

      
      
  ]);

  return (
    <div>
      <h2 className="ms-2">All Books</h2>
      <Navbar/>
      <Row>
        {products.length > 0 ? (
          products.map((item) => (
            <Col sm="3" key={item.title}>
              <Product product={item} />
            </Col>
            
          ))
        ) : (
          <p>No Products under this category</p>
        )}
      </Row>

    </div>
  );
}

export default AllBooks;
