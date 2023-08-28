import axios from 'axios';

class LoginServiceCustomer{

    static validateuser(email,password){
        var loginCredentials = {email,password};
        return axios.post("http://localhost:8080/users/signin",loginCredentials)

    }

    static registerUser(firstName, lastName, email, password,confirmPassword,dateOfBirth,address,city,phoneNumber,registeredDate,role){
        var registerCredentials={firstName, lastName, email, password, confirmPassword,dateOfBirth,address,city,phoneNumber,registeredDate,role};
        return axios.post("http://localhost:8080/users/register-customer",registerCredentials);
    }

    static getUser(){
        return axios.get("http://localhost:8080/users/4");
    }
    static getAllCities(){
        return  axios.get("http://localhost:8080/cities")
    }

    static addUserCart(userId,config){
        
        return axios.post(`http://localhost:8080/carts/create`);
    }
    static getAllBooks(){
        return axios.get("http://localhost:8080/books/getAllBooks");
    }
    static buyNow(userId){
        // var newItem = {
        //     productId,quantity
        //     // Other properties you might need
        //   };
        return axios.post("http://localhost:8080/carts/buyNow", userId);
    }

    static addToCart(userId,id){
        return axios.post(
            `http://localhost:8080/carts/addToCart?userId=${userId}&productId=${product.id}`);
    }
}

export default LoginServiceCustomer;