import axios from 'axios';

class ProductService{

    static addProduct(title, markedPrice, sellingPrice, stock, edition, genre, publicationDate, description,author,languageNames,config){
        var productDetails = {title, markedPrice, sellingPrice, stock, edition, genre, publicationDate, description,author,languageNames};
        return axios.post("http://localhost:8080/admin/books/add-book",productDetails,config);

    }

    
}

export default ProductService;