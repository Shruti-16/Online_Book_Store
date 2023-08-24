import axios from 'axios';

class LoginServiceCustomer{

    static validateuser(email,password){
        var loginCredentials = {email,password};
        return axios.post("http://localhost:8080/auth/signin",loginCredentials)

    }

    static registerUser(firstName, lastName, email, password,confirmPassword,dateOfBirth,addressLine1,addressLine2,city,phoneNumber,registeredDate,userImage){
        var registerCredentials={firstName, lastName, email, password, confirmPassword,dateOfBirth,addressLine1,addressLine2,city,phoneNumber, registeredDate,userImage};
        return axios.post("http://localhost:8080/users/register-customer",registerCredentials);
    }

    static addUserCart(userId,config){
        
        return axios.post(`http://localhost:8080/cart/${userId}`,config);
    }
}

export default LoginServiceCustomer;