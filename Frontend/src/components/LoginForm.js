import Navbar from "./Navbar"

function LoginForm() {

    return (
        <div>
            <Navbar></Navbar>

            <div className="container-fluid login-form">
                <form>
                    <div className="row m-4 justify-content-evenly" style={{height:"50vh"}}>
                        <div className="col-4 align-self-center p-5 rounded bg-secondary" style={{border:"black 2px solid", borderRadius:"20px"}}>
                        <h1 className="log-in-in mb-5">Sign In</h1>
                    <div class="form-group mb-3">
                        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email"></input>
                        <small id="email" class="form-text text-muted">We'll never share your email with anyone else.</small>
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" id="password" placeholder="Password"></input>
                    </div>
                    <div className="mt-3">
                    <button type="submit" class="btn btn-info">Login</button>
                    </div>
                    </div>
                    </div>
                </form>
            </div>
        </div>
    )
}

export default LoginForm;