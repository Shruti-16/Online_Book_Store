import "../App.css"

function Slider(){
    return(
        <div container-fluid slidess>

            <div id="carouselExampleDark" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-indicators">
                <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="1" aria-label="Slide 2"></button>
                <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="2" aria-label="Slide 3"></button>
            </div>
            <div class="carousel-inner">
                <div class="carousel-item active" data-bs-interval="5000">
                <img src="../../slides/img1.jpg" class="d-block w-100" alt="..."></img>
                <div class="carousel-caption d-none d-md-block">
                    <h2>30% - 40% off </h2>
                    <p>You can always find something you want.</p>
                </div>
                </div>
                <div class="carousel-item" data-bs-interval="5000">
                <img src="../../slides/img2.jpg" class="d-block w-100" alt="..."></img>
                <div class="carousel-caption d-none d-md-block">
                    <h2>Up to 25% off</h2>
                    <p>I like my money right where I can see it: hanging in my closet.</p>
                </div>
                </div>
                <div class="carousel-item" data-bs-interval="5000">
                <img src="../../slides/img3.jpg" class="d-block w-100" alt="..."></img>
                <div class="carousel-caption d-none d-md-block">
                    <h2>Unique Collections</h2>
                    <p>For some, shopping is an art; for others, it's a sport.</p>
                </div>
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
            </div>
        </div>
    )
}

export default Slider;