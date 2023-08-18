import React from 'react';
import '@fortawesome/fontawesome-free/css/all.min.css';

const Header = () => {
  return (
    <header>
      <div className="logo">OnlineBookStore</div>
      <div className="search-bar">
        <input type="text" placeholder="Search..." />
        <button className="search-button">
          <i className="fa fa-search"></i> {/* Assuming you're using FontAwesome for the search icon */}
        </button>
      </div>
    </header>
  );
};

export default Header;