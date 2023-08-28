import Navbar from "./Navbar";

export default function About() {

  return (
    <div>
      <Navbar></Navbar>

      <div className="container-fluid about-us">
        <div className="row align-items-center justify-content-evenly">
          <div className="col-4 align-self-center p-5 rounded  ">
            <h1 className="log-in-in mb-2">Welcome to</h1>
            <h1 className="log-in-in mb-5" >Online Book Store</h1>
            <p style={{fontSize:"1.2rem"}}>An online book store is a virtual platform that allows users to browse, purchase, and access a wide variety of books via the internet. It provides a convenient and efficient way for people to discover, buy, and enjoy reading materials without the need to visit a physical brick-and-mortar store. Online book stores have gained immense popularity due to their accessibility, vast selection, and user-friendly interfaces.</p><hr></hr>
            {/* <p><b>Online shopping</b> has become a major disruptor in the retail industry
              as consumers can now search for product information and place product orders
              across different regions. Online retailers deliver their products directly
              to the consumers' home, offices, or wherever they want. The B2C (business to consumer)
              process has made it easy for consumers to select any product online from
              a retailer's website and to have it delivered relatively quickly.
              Using online shopping methods, consumers do not need to consume energy by
              physically visiting physical stores. This way they save time
              and the cost of traveling. A retailer or a shop is a business that presents
              a selection of goods and offers to trade or sell them to customers for money
              or other goods.</p><hr></hr> */}
            <p style={{fontSize:"1.2rem"}}>Shoppers' shopping experiences may vary. They are based on a variety of factors including how the customer
              is treated, convenience, the type of goods being purchased, and mood</p><hr></hr>
            <h3 className="log-in-in ">Thank You !</h3>
          </div>
        </div>

      </div>

    </div>
  );

}