import React from 'react';
import { Navbar } from 'reactstrap';

const books = [
  {
    id: 1,
    title: 'LAST HOPE',
    href: '#',
    imageSrc: 'https://via.placeholder.com/300x400', // Placeholder image link
    imageAlt: 'Cover of "The Great Gatsby"',
    price: '₹ 499 ',
    author: 'James Lopez',
  },
  {
    id: 2,
    title: 'A Million To One',
    href: '#',
    imageSrc: 'https://via.placeholder.com/300x400', // Placeholder image link
    imageAlt: 'Cover of "To Kill a Mockingbird"',
    price: '₹ 699',
    author: 'Tony Faggioli',
  },
  {
    id: 2,
    title: 'A Million To One',
    href: '#',
    imageSrc: 'https://via.placeholder.com/300x400', // Placeholder image link
    imageAlt: 'Cover of "To Kill a Mockingbird"',
    price: '₹ 699',
    author: 'Tony Faggioli',
  },
  // More books...
];

export default function DisplayBooks() {
  return (

  
        
   
    
    <div className="bg-white">
        <Navbar/>
      <div className="mx-auto max-w-7xl px-4 py-16 sm:px-6 sm:py-24 lg:px-8">
        <h2 className="text-2xl font-bold tracking-tight text-gray-900">Books You Might Like</h2>

        <div className="mt-6 grid grid-cols-1 gap-x-6 gap-y-10 sm:grid-cols-2 md:grid-cols-4">
          {books.map((book) => (
            <div key={book.id} className="group relative">
              <div className="aspect-h-1 aspect-w-1 w-full overflow-hidden rounded-md bg-gray-200 lg:aspect-none group-hover:opacity-75 lg:h-80">
                <img
                  src={book.imageSrc}
                  alt={book.imageAlt}
                  className="h-full w-full object-cover object-center lg:h-full lg:w-full"
                />
              </div>
              <div className="mt-4 flex justify-between">
                <div>
                  <h3 className="text-sm text-gray-700">
                    <a href={book.href}>
                      <span aria-hidden="true" className="absolute inset-0" />
                      {book.title}
                    </a>
                  </h3>
                  <p className="mt-1 text-sm text-gray-500">{book.author}</p>
                </div>
                <p className="text-sm font-medium text-gray-900">{book.price}</p>
              </div>
            </div>
          ))}
        </div>
      </div>
    </div>
  );
}
