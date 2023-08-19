import Navbar from "./Navbar";
import bootsrap from 'bootstrap/dist/css/bootstrap.css'
import '../stylesheets/HomePage.css'

function HomePage(){
    return (
        <div>
            <Navbar/>
            <div className="container" >
            <h1>Welcome to OnlineBookStore.com...! Here you will be able to buy all types of books sitting at your place..!</h1>
            </div>
            <div className='buttons' style={{margin:"auto"}}>
                            <a href='#' className='btn btn-outline-light'>Login
                            </a>
                            <a href='#' className='btn btn-outline-light ms-5'>Sign Up
                            </a>
                        </div>
        </div>
    )
}

export default HomePage;