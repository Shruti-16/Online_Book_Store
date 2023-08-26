import axios from 'axios';

class CategoryService{

    static addCategory(categoryName,config){
        var category = {categoryName};
        return axios.post("http://localhost:8080/categories",category,config)

    }
}

export default CategoryService;