import axios from 'axios';

class LoginServiceCustomer{

    static validateuser(email,password){
        var loginCredentials = {email,password};
        return axios.post("http://localhost:8080/users/signin",loginCredentials)

    }

    static registerUser(firstName, lastName, email, password,confirmPassword,dateOfBirth,address,city,phoneNumber,registeredDate,userImage,role){
        var registerCredentials={firstName, lastName, email, password, confirmPassword,dateOfBirth,address,city,phoneNumber, registeredDate,userImage,role};
        return axios.post("http://localhost:8080/users/register-customer",registerCredentials);
    }

    static getUser(){
        return axios.get("http://localhost:8080/users/4");
    }

    static addUserCart(userId,config){
        
        return axios.post(`http://localhost:8080/carts/create`);
    }
}

export default LoginServiceCustomer;