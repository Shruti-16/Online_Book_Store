import axios from 'axios';

class ProductService {

    static addProduct(formData) {
        return axios.post("http://localhost:8080/admin/books/addNewBook", formData, {
            headers: {
                'Content-Type': 'multipart/form-data'
            }
        });
    }
}

export default ProductService;