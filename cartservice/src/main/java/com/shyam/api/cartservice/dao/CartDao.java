package com.shyam.api.cartservice.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shyam.api.cartservice.entity.Cart;

@Repository
public interface CartDao extends JpaRepository<Cart, Long> {

	@Query("SELECT c FROM Cart c WHERE c.user.id = :userId AND c.archived = false")
	public Optional<Cart> findByUserId(@Param("userId") Long userId);
}