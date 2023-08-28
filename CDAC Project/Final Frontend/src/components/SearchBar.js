// import React from "react";
// import { FaSearch } from "react-icons/fa";

// function SearchBar() {

//     return (
//         <div>
//             <form class="form-inline my-2 my-lg-0 rounded-pill">
//                 <input class="form-control mr-sm-2" type="search" placeholder="Search Books Here" aria-label="Search" style={{width:"25rem", display:"flex"}}></input>
//                 {/* <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button> */}
//                 {/* <a href="#"></a> */}
//                 <button><FaSearch></FaSearch></button>
//             </form>
//         </div>
//     )
// }

// export default SearchBar;
import { useState } from "react";
import { FaSearch } from "react-icons/fa";
import { Container } from "reactstrap";

export default function SearchBar() {
  const [searchTerm, setSearchTerm] = useState("");

  const handleChange = (event) => {
    setSearchTerm(event.target.value);
  };

  return (
    <div>
        <input type="search" onChange={handleChange} value={searchTerm} placeholder="Search Books Here" className="form-control"></input>
        <span><button><FaSearch/></button></span>
      {/* <TextField
        id="search"
        type="search"
        label="Search"
        value={searchTerm}
        onChange={handleChange}
        sx={{ width: 600 }}
        InputProps={{
          endAdornment: (
            <InputAdornment position="end">
              <FaSearch/>
            </InputAdornment>
          ),
        }}
      /> */}
    </div>
  );
}