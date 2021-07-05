package br.com.aula4.tm.ecommerce.exception;

import br.com.aula4.tm.ecommerce.dto.ExceptionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AccessExceptionHandler {

    @ExceptionHandler(AccessException.class)
    public ResponseEntity<?> accesExceptionHandler(AccessException e) {
        return ResponseEntity.badRequest().body(new ExceptionDTO(e.getMessage()));
    }
}
