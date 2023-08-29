import axios from 'axios';

class LoginService{


    static validateuser(email,password){
        var loginCredentials = {email,password};
        return axios.post("http://localhost:8080/users/admin-login",loginCredentials)

    }

    static registerUser(firstName, lastName, email, password, mobileNumber, registeredDate, roles){
        var registerCredentials={firstName, lastName, email, password, mobileNumber, registeredDate, roles};
        return axios.post("http://localhost:8080/auth/signup",registerCredentials)
    }

    static registerAdmin(firstName, lastName, email, password,confirmPassword,dateOfBirth, phoneNumber, address,city,role,config){
        var registerDetails={firstName, lastName, email, password,confirmPassword,dateOfBirth, phoneNumber, address,city,role};
        return axios.post("http://localhost:8080/users/register-admin",registerDetails,config)
    }

    static addAdminCart(userId,config){
        
        return axios.post(`http://localhost:8080/cart/${userId}`,config);
    }
}

export default LoginService;