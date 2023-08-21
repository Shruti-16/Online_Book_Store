import Navbar from "./Navbar";
// import Slider from "./Slider";

function Homepage(){
    return(
        <div className="homepage">
            <Navbar></Navbar>
            <div className="container m-5" style={{width:"50%",height:"50%",float:"right"}}>
                         <h2>Welcome to the OnlineBookStore...!</h2>
                         <p>“Books are mirrors: you only see in them what you already have inside you.”</p>
            </div>
            {/* <Slider></Slider> */}
        </div>
    )
}

export default Homepage;