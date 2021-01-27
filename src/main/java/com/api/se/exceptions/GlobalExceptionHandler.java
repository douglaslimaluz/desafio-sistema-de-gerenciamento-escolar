package com.api.se.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.api.se.dto.ErrorDTO;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
	@ExceptionHandler(GlobalException.class)
	public @ResponseBody ErrorDTO handleGenericException(GlobalException e) {
		e.printStackTrace();

		return new ErrorDTO(e.getMensagemErro());
	}

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public @ResponseBody ErrorDTO handleGenericException(Exception e) {
		e.printStackTrace();

		return new ErrorDTO(e.getLocalizedMessage());
	}

}