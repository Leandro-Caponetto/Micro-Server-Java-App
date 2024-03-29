
package com.srpingboot.micro.exception;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class UserNotFoundAdvice {
    
    
    public Map<String, String> exceptionHandler(UserNotFoundException exception){
        
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("errorMessage", exception.getMessage());
        return errorMap;
    }
    
}
