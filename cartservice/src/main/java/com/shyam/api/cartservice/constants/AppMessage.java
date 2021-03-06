package com.shyam.api.cartservice.constants;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AppMessage {

	public static String RESOURCE_NOT_FOUND;
	public static String USER_NOT_FOUND;
	public static String USER_NOT_ACTIVATED;
	public static String PRODUCT_NOT_FOUND;
	public static String PRODUCT_NOT_FOUND_IN_CART;
	public static String CART_NOT_FOUND;

	@Value("${app.message.resource-not-found}")
	public void setResoureNotFound(String message) {
		AppMessage.RESOURCE_NOT_FOUND = message;
	}

	@Value("${app.message.user-not-found}")
	public void setUserNotFound(String message) {
		AppMessage.USER_NOT_FOUND = message;
	}

	@Value("${app.message.user-not-activated}")
	public void setUserNotActivated(String message) {
		AppMessage.USER_NOT_ACTIVATED = message;
	}

	@Value("${app.message.product-not-found-in-cart}")
	public void setProductNotFoundInCart(String message) {
		AppMessage.PRODUCT_NOT_FOUND_IN_CART = message;
	}

	@Value("${app.message.product-not-found}")
	public void setProductNotFound(String message) {
		AppMessage.PRODUCT_NOT_FOUND = message;
	}

	@Value("${app.message.cart-not-found}")
	public void setCartNotFound(String message) {
		AppMessage.CART_NOT_FOUND = message;
	}

	@PostConstruct
	public void print() {
		log.info("RESOURCE_NOT_FOUND: " + RESOURCE_NOT_FOUND);
		log.info("USER_NOT_FOUND: " + USER_NOT_FOUND);
		log.info("USER_NOT_ACTIVATED: " + USER_NOT_ACTIVATED);
		log.info("PRODUCT_NOT_FOUND: " + PRODUCT_NOT_FOUND);
		log.info("PRODUCT_NOT_FOUND_IN_CART: " + PRODUCT_NOT_FOUND_IN_CART);
	}
}
