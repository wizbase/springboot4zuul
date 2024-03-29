package com.hs.api.configclient.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.hs.api.configclient.service.InvalidAccountBalanceException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class ControllerExceptionHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(ControllerExceptionHandler.class);
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(InvalidAccountBalanceException.class)
	public void handleNotFound() {
	}

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // 500
	@ExceptionHandler(Exception.class)
	public void handleGeneralError(Exception ex) {
		logger.error("An error occurred procesing request", ex);
	}
}
