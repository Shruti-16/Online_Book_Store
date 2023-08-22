import React from "react";
import { useState } from "react";
import Product from "./Product";
import {Row,Col} from "reactstrap"

function AllBooks () {
    const [products,setProducts] = useState([
        {title:"Iphone 14 pro",description:"Dynamic Island feature. A magical new way to interact with iPhone. A vital safety feature designed to save lives. All powered by the ultimate smartphone chip.",price:"1,00,000",},
        {title:"Iphone 14 ",description:" A vital safety feature designed to save lives. An innovative 48MP camera for mind-blowing detail. All powered by the ultimate smartphone chip.",price:"70,000",},
        {title:"Oneplus 10T ",description:" A vital safety feature designed to save lives. An innovative 48MP camera for mind-blowing detail. All powered by the ultimate smartphone chip.",price:"50,000",}
    ])

    return(
        <div>
            <h2 className="ms-2">All Books </h2>
            <Row>{products.length>0?products.map((item)=> <Col sm="4"><Product product={item}/></Col>):"No Products under this category"}</Row>
        </div>
    );
}

export default AllBooks;