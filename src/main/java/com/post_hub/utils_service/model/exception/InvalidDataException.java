package com.post_hub.utils_service.model.exception;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class InvalidDataException extends RuntimeException {

    public InvalidDataException(String message) {
        super(message);
    }

}
