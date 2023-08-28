import { Card, Container } from "react-bootstrap";
import { CardBody, CardHeader } from "reactstrap";
import { useNavigate } from "react-router-dom";

// const navigate = useNavigate();

function Logout(){

    const handleLogout = () =>{
        sessionStorage.removeItem('user');
       useNavigate.navigate("/")

    }

    return (

        <div>
            <div className="container-fluid" style={{marginLeft:"30rem", marginTop:"4rem"}}>
                <form onSubmit={handleLogout}>
            <Card className="m-5 rounded text-center bg-light" style={{width:"35%"}}>
                <CardHeader style={{fontSize:"1.5rem"}}>Logout</CardHeader>
                <CardBody>
                    <div>
                    <p style={{fontSize:"2rem"}}>Are you sure you want to log out?</p>
                    </div>
                    <button className="btn btn-secondary mt-3 pl-3 rounded" type="submit" style={{fontSize:"1.3rem"}}>Logout</button>
                    {/* <a href="/" className="btn btn-secondary mt-3 pl-3 rounded" style={{fontSize:"1.3rem"}}>fontSize:"1.3rem"</a> */}
                </CardBody>
            </Card>
            </form>
            </div>
        </div>
    )
}

export default Logout;