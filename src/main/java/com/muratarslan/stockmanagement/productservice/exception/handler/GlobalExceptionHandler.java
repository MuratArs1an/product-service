package com.muratarslan.stockmanagement.productservice.exception.handler;

import com.muratarslan.stockmanagement.productservice.exception.enums.FriendlyMessageCode;
import com.muratarslan.stockmanagement.productservice.exception.exception.ProductNotCreatedException;
import com.muratarslan.stockmanagement.productservice.exception.utils.FriendlyMessageUtils;
import com.muratarslan.stockmanagement.productservice.response.FriendlyMessage;
import com.muratarslan.stockmanagement.productservice.response.InternalApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Collections;

@RestControllerAdvice //exception handlerları tek bir çatı altında birlestirir
public class GlobalExceptionHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler
    public InternalApiResponse<String> handleProductNotCreatedException(ProductNotCreatedException exception){
        return InternalApiResponse.<String>builder()
                .friendlyMessage(FriendlyMessage.builder()
                        .title(FriendlyMessageUtils.getFriendlyMessage(exception.getLanguage(), FriendlyMessageCode.ERROR))
                        .description(FriendlyMessageUtils.getFriendlyMessage(exception.getLanguage(), exception.getFriendlyMessageCode()))
                        .build())
                .httpStatus(HttpStatus.BAD_REQUEST)
                .hasError(true)
                .errorMessage(Collections.singletonList(exception.getMessage()))
                .build();
    }
}
