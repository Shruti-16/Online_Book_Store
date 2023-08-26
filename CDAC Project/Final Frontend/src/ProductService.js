import axios from 'axios';

class ProductService{

    static addProduct(categoryId,productName,productImagePath,markedPrice,sellingPrice,quantity,status,description,config){
        var productDetails = {categoryId,productName,productImagePath,markedPrice,sellingPrice,quantity,status,description};
        return axios.post(`http://localhost:8080/products/${categoryId}`,productDetails,config);

    }

    
}

export default ProductService;