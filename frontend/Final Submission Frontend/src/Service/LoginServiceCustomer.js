import axios from 'axios';

class LoginServiceCustomer{

    static validateuser(email,password){
        var loginCredentials = {email,password};
        return axios.post("http://localhost:8080/auth/signin",loginCredentials)

    }

    static registerUser(firstName, lastName, email, password, mobileNumber, registeredDate, roles){
        var registerCredentials={firstName, lastName, email, password, mobileNumber, registeredDate, roles};
        return axios.post("http://localhost:8080/auth/signup",registerCredentials)
    }

    static addUserCart(userId,config){
        
        return axios.post(`http://localhost:8080/cart/${userId}`,config);
    }
}

export default LoginServiceCustomer;