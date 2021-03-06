package com.tqdev.crudapi.data.record;

import com.tqdev.crudapi.data.ErrorCode;

public class ErrorDocument {

	private final int code;

	private final String message;

	public ErrorDocument(ErrorCode error, String argument) {
		this.code = error.value();
		this.message = error.getMessage(argument);
	}

	/**
	 * Return the code of this error.
	 */
	public int getCode() {
		return code;
	}

	/**
	 * Return the message of this error.
	 */
	public String getMessage() {
		return message;
	}

}
