export default class User{
    constructor(firstName,lastName,email,password,confirmPassword,dateOfBirth,addressLine1,addressLine2,city,pincode,country,userImage,phoneNumber,registeredDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.dateOfBirth = dateOfBirth;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.pincode = pincode;
        this.country = country;
        this.userImage = userImage;
        this.phoneNumber = phoneNumber;
        this.registeredDate = registeredDate;
    }
}