export default function Order() {
    return (
        <div>
            <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
                <div className="container-fluid" style={{ marginLeft: "3rem" }}>
                    <a className="navbar-brand" href="/">SHOPPING CART</a>
                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button>
                    <div className="collapse navbar-collapse" id="navbarSupportedContent" style={{ marginLeft: "22rem" }}>
                        <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                            <li className="nav-item">
                                <a className="nav-link " aria-current="page" href="/">Home</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link active " aria-current="page" href="/category">Categories</a>
                            </li>

                            <li className="nav-item">
                                <a className="nav-link" href="/about">About Us</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link" href="/contact">Contact Us</a>
                            </li>


                            <div className='buttons' style={{ marginLeft: "20rem" }}>
                                <a href='/login-customer' className='btn btn-outline-light'>
                                    <i className='text-white '>Login  &#187;</i>
                                </a>
                                <a href='/register-customer' className='btn btn-outline-light ms-3'>
                                    <i className='text-white '>Register &#187;</i>
                                </a>
                                <a href='/customer-cart' className='btn btn-outline-light ms-3'>
                                    <i className='text-white '>Cart &#187;</i>
                                </a>
                            </div>


                        </ul>

                    </div>
                </div>
            </nav>

            <div className="container-fluid">
                <div className="row align-items-center justify-content-center p-5 "style={{height:"92vh"}}>
                        <div  >
                            <h1 className="text-center">Order placed Sucessfully!</h1>
                        </div>
                        <div class="spinner-grow text-success" role="status">
                            <span class="visually-hidden">Loading...</span>
                        </div><div class="spinner-grow text-success" role="status">
                            <span class="visually-hidden">Loading...</span>
                        </div><div class="spinner-grow text-success" role="status">
                            <span class="visually-hidden">Loading...</span>
                        </div><div class="spinner-grow text-success" role="status">
                            <span class="visually-hidden">Loading...</span>
                        </div><div class="spinner-grow text-success" role="status">
                            <span class="visually-hidden">Loading...</span>
                        </div><div class="spinner-grow text-success" role="status">
                            <span class="visually-hidden">Loading...</span>
                        </div>
                </div>
            </div>

        </div>
    )
}