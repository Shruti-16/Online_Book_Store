package com.app.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.OrderDTO;
import com.app.dto.OrderRespDto;
import com.app.entities.Book;
import com.app.entities.Cart;
import com.app.entities.Order;
import com.app.entities.User;
import com.app.entity.projection.OrderBook;
import com.app.repository.BookRepository;
import com.app.repository.CartRepository;
import com.app.repository.OrderRepository;
import com.app.repository.UserRepository;

@Service
@org.springframework.transaction.annotation.Transactional
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepo;
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private BookRepository bookRepo;
	@Autowired
	private ModelMapper mapper;
	@Autowired
	private CartRepository cartRepo;

	public Order getOrder(OrderDTO orderDTO) {
		Order order = new Order();

		// Retrieve cart by ID using Optional
		Optional<Cart> cartOptional = cartRepo.findById(orderDTO.getCartId());
		if (cartOptional.isPresent()) {
			Cart cart = cartOptional.get();

			order.setQuantity(cart.getTotalBooks());
			order.setCart(cart);
			List<Book> cartBooks = cart.getBooks();

		} else
			throw new RuntimeException("Cart not found");

		// Retrieve user by ID using Optional
		Optional<User> userOptional = userRepo.findById(orderDTO.getUserId());
		if (userOptional.isPresent()) {

			User user = userOptional.get();

		} else {
			throw new RuntimeException("User not found");
		}
		return order;

	}

	@Override
	public OrderRespDto placeOrder(OrderDTO orderDTO) {

		Order order1 = this.getOrder(orderDTO);

		Order order = new Order();
		order.setOrderDate(orderDTO.getOrderDate());
		order.setBooks(order1.getBooks());

		// Assuming getBooks() gets a list of Book entities based on the cart items

		// Set other fields as needed

		Order savedOrder = orderRepo.save(order);
		OrderRespDto response = mapper.map(savedOrder, OrderRespDto.class);
		return response;
	}
	
	
	
    public List<OrderRespDto> displayAllPurchasedBooksForUser(Long userId) {
        User user = userRepo.findById(userId).orElse(null);
        if (user == null) {
            // Handle user not found
            return null;
        }

        List<Order> orders = orderRepo.findAllByUserUserId(userId);

        return orders.stream()
            .map(order -> convertOrderToDto(order))
            .collect(Collectors.toList());
    }

//    private OrderRespDto convertOrderToDto(Order order) {
//        OrderRespDto orderRespDto = new OrderRespDto();
//        orderRespDto.setId(order.getOrderId());
//        orderRespDto.setPrice(order.getTotalPrice());
//        orderRespDto.setOrderDate(order.getOrderDate());
//        return orderRespDto;
//    }
    
    public OrderRespDto convertOrderToDto(Order order) {
        OrderRespDto orderRespDto = mapper.map(order, OrderRespDto.class);
        orderRespDto.setBooks(order.getBooks());
        
        return orderRespDto;
    }
}

//
//	@Override
//	public List<OrderBook> findPurchaseBooksOfUser(String email) {
//		return orderRepo.findAllPurchaseBooksByUserEmail(email);
//	}

