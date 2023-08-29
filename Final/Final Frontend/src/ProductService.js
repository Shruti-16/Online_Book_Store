import axios from 'axios';
import { authHeader,authImageHeader } from './Service/base.service';

class ProductService{

    static addProduct(title, markedPrice, sellingPrice, stock, edition, genre, publicationDate, description,author,languageNames,config){
        var productDetails = {title, markedPrice, sellingPrice, stock, edition, genre, publicationDate, description,author,languageNames};
        var bookImage = bookImage;
        return axios.post("http://localhost:8080/admin/books/add-book",productDetails,config);

    }

    static uploadProductImage(bookImage, productId) {
        let formData = new FormData();
        formData.append('imageFile', bookImage);
        console.log('in upload img ' + formData + ' ' + productId);
        return axios
          .post(`/images/upload`, formData, {
            headers: authImageHeader(),
          })
          .then((response) => response.data);
      }

    
}

export default ProductService;