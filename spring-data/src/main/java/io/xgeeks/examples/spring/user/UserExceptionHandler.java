package io.xgeeks.examples.spring.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@ControllerAdvice
public class UserExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleWrongTimeException(ConstraintViolationException ex) {
        Set<ConstraintViolation<?>> constraintViolations = ex.getConstraintViolations();
        List<String> errors = constraintViolations.stream()
                .map(ConstraintViolation::getMessage)
                .collect(Collectors.toUnmodifiableList());
        ErrorResponse error = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), errors);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
