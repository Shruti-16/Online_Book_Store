import Navbar from "./Navbar";

export default function About() {
   
    return (
      <div>
        <Navbar></Navbar>

        <div className="container-fluid about-us">
            <div className="row align-items-center justify-content-evenly">
                <div className="col-4 align-self-center p-5 rounded  ">
                    <h1 className="log-in-in mb-2">Welcome to</h1>
                    <h1 className="log-in-in mb-5">Online Shopping System</h1>
                    <p><b>Shopping</b> is an activity in which a customer browses the available goods or 
                            services presented by one or more retailers with the potential intent to purchase
                            a suitable selection of them. A typology of shopper types has been developed by
                            scholars which identifies one group of shoppers as recreational shoppers,
                            that is, those who enjoy shopping and view it as a leisure activity.</p><hr></hr>
                    <p><b>Online shopping</b> has become a major disruptor in the retail industry
                            as consumers can now search for product information and place product orders
                            across different regions. Online retailers deliver their products directly
                            to the consumers' home, offices, or wherever they want. The B2C (business to consumer)
                            process has made it easy for consumers to select any product online from
                            a retailer's website and to have it delivered relatively quickly.
                            Using online shopping methods, consumers do not need to consume energy by
                            physically visiting physical stores. This way they save time
                            and the cost of traveling. A retailer or a shop is a business that presents
                            a selection of goods and offers to trade or sell them to customers for money
                            or other goods.</p><hr></hr>
                    <p>Shoppers' shopping experiences may vary. They are based on a variety of factors including how the customer 
                            is treated, convenience, the type of goods being purchased, and mood</p><hr></hr>
                    <h3 className="log-in-in ">Thank You !</h3>
                </div>
            </div>

        </div>

      </div>
    );
  
}