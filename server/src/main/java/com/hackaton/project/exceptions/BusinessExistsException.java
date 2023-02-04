package com.hackaton.project.exceptions;

public class BusinessExistsException extends RuntimeException{
    public BusinessExistsException(String field) {
        super(
                String.format("Business with the same %s already exists", field)
        );
    }
}
