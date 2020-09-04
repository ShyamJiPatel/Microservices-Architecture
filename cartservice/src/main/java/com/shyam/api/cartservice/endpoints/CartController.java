package com.shyam.api.cartservice.endpoints;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.api.cartservice.constants.AppMessage;
import com.shyam.api.cartservice.entity.Cart;
import com.shyam.api.cartservice.service.CartService;
import com.shyam.commonlib.entity.CustomResponse;
import com.shyam.commonlib.exception.ResourceNotFoundException;

@RestController
public class CartController {

	@Autowired
	private CartService cartService;

	@GetMapping(path = "/cart/{userId}")
	public ResponseEntity<CustomResponse> getCart(@PathVariable Long userId, @PathVariable Long cartId) {
		Optional<Cart> cart = cartService.getCart(userId);

		if (cart.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(new CustomResponse(cart.get()));
		} else {
			throw new ResourceNotFoundException(AppMessage.CART_NOT_FOUND);
		}
	}

	@PostMapping(path = "/cart/{userId}/{productId}/{quantity}")
	public ResponseEntity<CustomResponse> addItemToCart(@PathVariable Long userId, @PathVariable Long productId,
			@PathVariable Integer quantity) {
		cartService.addItemToCart(userId, productId, quantity);
		return ResponseEntity.status(HttpStatus.CREATED).body(new CustomResponse());
	}

}