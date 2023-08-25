package com.app.service;


<<<<<<< HEAD
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

=======
>>>>>>> 7abdb8a5e2adacbda91a4179810c782ecd18b224
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

<<<<<<< HEAD
import com.app.dto.BooksFromCartOrderDTO;
import com.app.entities.Book;
import com.app.entities.Cart;
import com.app.entities.User;
import com.app.repository.BookRepository;
import com.app.repository.CartRepository;
import com.app.repository.UserRepository;
=======
import com.app.dto.CartDTO;
import com.app.entities.Cart;
import com.app.repository.CartRepository;
>>>>>>> 7abdb8a5e2adacbda91a4179810c782ecd18b224

@Transactional
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;
<<<<<<< HEAD
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BookRepository bookRepository;
=======
>>>>>>> 7abdb8a5e2adacbda91a4179810c782ecd18b224

    @Autowired
    private ModelMapper modelMapper;

<<<<<<< HEAD
//    @Override
//    public CartDTO createCart(CartDTO cartDTO) {
//        Cart cart = modelMapper.map(cartDTO, Cart.class);
//        Cart savedCart = cartRepository.save(cart);
//        return modelMapper.map(savedCart, CartDTO.class);
//    }

//    @Override
//    public CartDTO updateCart(Long cartId, CartDTO cartDTO) {
//        Cart existingCart = cartRepository.findById(cartId).orElse(null);
//        
//        if (existingCart != null) {
//            existingCart.setTotalBooks(cartDTO.getTotalBooks());
//            existingCart.setTotalPrice(cartDTO.getTotalPrice());
//            existingCart.setDiscount(cartDTO.getDiscount());
//            
//            Cart updatedCart = cartRepository.save(existingCart);
//            return modelMapper.map(updatedCart, CartDTO.class);
//        } else {
//            return null; // Handle cart not found case
//        }
//    }

//    @Override
//    public CartDTO getCartById(Long cartId) {
//        Cart cart = cartRepository.findById(cartId).orElse(null);
//        
//        if (cart != null) {
//            return modelMapper.map(cart, CartDTO.class);
//        } else {
//            return null; // Handle cart not found case
//        }
//    }

//    @Override
//    public void deleteCart(Long cartId) {
//        cartRepository.deleteById(cartId);
//    }
//    
    public void addToCart(Long userId, Long bookId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        Optional<Book> optionalBook = bookRepository.findById(bookId);

        if (optionalUser.isPresent() && optionalBook.isPresent()) {
            User user = optionalUser.get();
            Book book = optionalBook.get();
            
            Cart cart = user.getCart();
            
            if (cart == null) {
                cart = new Cart(); // Create a new cart if user's cart is null
                user.setCart(cart);
            }
            
            cart.getBooks().add(book);
            cartRepository.save(cart);
        } 
    }
    
    
    public List<BooksFromCartOrderDTO> getBooksInCart(Long userId) {
    	Optional<User> optionalUser=userRepository.findById(userId);
    	if(optionalUser.isPresent()) {
//        Optional<Cart> optionalCart = cartRepository.findByUserId(userId);
         if(optionalUser.get().getCart()!=null) {
//        	 return cart.getBooks();
        	 Cart cart=optionalUser.get().getCart();
        	 return cart.getBooks().stream().map(this::mapToCartBooksDTO).collect(Collectors.toList());
         }
    	}
    	return null;
    }
    
    private BooksFromCartOrderDTO mapToCartBooksDTO(Book book) {
    	BooksFromCartOrderDTO booksFromCartOrOrderDTO = modelMapper.map(book, BooksFromCartOrderDTO.class);
		return booksFromCartOrOrderDTO;
	}

//	@Override
//	public CartDTO updateCart(Long cartId, CartDTO cartDTO) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public CartDTO getCartById(Long cartId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
=======
    @Override
    public CartDTO createCart(CartDTO cartDTO) {
        Cart cart = modelMapper.map(cartDTO, Cart.class);
        Cart savedCart = cartRepository.save(cart);
        return modelMapper.map(savedCart, CartDTO.class);
    }

    @Override
    public CartDTO updateCart(Long cartId, CartDTO cartDTO) {
        Cart existingCart = cartRepository.findById(cartId).orElse(null);
        
        if (existingCart != null) {
            existingCart.setTotalBooks(cartDTO.getTotalBooks());
            existingCart.setTotalPrice(cartDTO.getTotalPrice());
            existingCart.setDiscount(cartDTO.getDiscount());
            
            Cart updatedCart = cartRepository.save(existingCart);
            return modelMapper.map(updatedCart, CartDTO.class);
        } else {
            return null; // Handle cart not found case
        }
    }

    @Override
    public CartDTO getCartById(Long cartId) {
        Cart cart = cartRepository.findById(cartId).orElse(null);
        
        if (cart != null) {
            return modelMapper.map(cart, CartDTO.class);
        } else {
            return null; // Handle cart not found case
        }
    }

    @Override
    public void deleteCart(Long cartId) {
        cartRepository.deleteById(cartId);
    }
>>>>>>> 7abdb8a5e2adacbda91a4179810c782ecd18b224
}