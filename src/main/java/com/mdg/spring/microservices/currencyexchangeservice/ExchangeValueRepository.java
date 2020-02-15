package com.mdg.spring.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdg.spring.microservices.currencyexchangeservice.beans.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	ExchangeValue findByFromAndTo(String from1, String to);
}
