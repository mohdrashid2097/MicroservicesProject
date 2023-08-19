package com.user.service.execption;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(){
        super("Resource not found on server!");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}
