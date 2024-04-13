package io.github.samwiz.spring_backend_ecommerce.exceptions;

public class ProductNotFoundException extends RuntimeException
{
      public ProductNotFoundException(String message)
      {
            super(message);
      }
}
