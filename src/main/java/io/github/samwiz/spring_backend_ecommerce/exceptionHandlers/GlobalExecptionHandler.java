package io.github.samwiz.spring_backend_ecommerce.exceptionHandlers;

import io.github.samwiz.spring_backend_ecommerce.dtos.Exceptiondto;
import io.github.samwiz.spring_backend_ecommerce.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExecptionHandler
{
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Exceptiondto> handleArithematicException()
    {
        Exceptiondto dto = new Exceptiondto();
        dto.setMessage("Something went wrong");
        dto.setResolution("Arithematic Exception");
        ResponseEntity<Exceptiondto> response = new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
        return response;
    }
    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public ResponseEntity<Exceptiondto> ArrayIndexOutOfBoundsException()
    {
        Exceptiondto dto = new Exceptiondto();
        dto.setMessage("Something went wrong");
        dto.setResolution("Array Index out of bound  Exception");
        ResponseEntity<Exceptiondto> response = new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
        return response;
    }
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<Exceptiondto> handleProductNotFoundException()
    {
        Exceptiondto dto = new Exceptiondto();
        dto.setMessage("Product Id passed is incorrect ");
        dto.setResolution("Please pass the correct id");
        ResponseEntity<Exceptiondto> response = new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
        return response;
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Exceptiondto> handleGeneralException()
    {
        Exceptiondto dto = new Exceptiondto();
        dto.setMessage("Something went wrong");
        dto.setResolution(" Exception");
        ResponseEntity<Exceptiondto> response = new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
        return response;
    }
}

