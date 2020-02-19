package com.soprasteria.booking.controller.impl;

import com.soprasteria.booking.model.dto.HttpErrorDTO;
import com.soprasteria.booking.model.exceptions.HandleExceptionNeedFindAll;
import com.soprasteria.booking.model.exceptions.HandleExceptionNeedFindById;
import com.soprasteria.booking.model.mapper.HttpErrorMapper;
import com.soprasteria.booking.model.messages.ErrorMessages;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;

@Slf4j
@ControllerAdvice
public class ExceptionHandlerController extends ResponseEntityExceptionHandler {

    public static HttpServletRequest getCurrentRequest() {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        Assert.state(requestAttributes != null, "Could not find current request via RequestContextHolder");
        Assert.isInstanceOf(ServletRequestAttributes.class, requestAttributes);
        HttpServletRequest servletRequest = ((ServletRequestAttributes) requestAttributes).getRequest();
        Assert.state(true, "Could not find current HttpServletRequest");
        return servletRequest;
    }

    @ExceptionHandler(HandleExceptionNeedFindAll.class)
    public ResponseEntity<HttpErrorDTO> handleExceptionNeedFindAll(Exception ex) {
        log.error(" -- ERROR SOPRA STERIA BOOKING : Needs not found {} {} {} ",getCurrentRequest().getMethod(),getCurrentRequest().getContextPath(),
                getCurrentRequest().getRequestURI());
        return HttpErrorMapper.buildHttpErrorDTO(ErrorMessages.ERROR_HANDLE_NEED_FIND_ALL.getCode(), HttpStatus.INTERNAL_SERVER_ERROR,
                getCurrentRequest().getServletPath(),ErrorMessages.ERROR_HANDLE_NEED_FIND_ALL.getMessage(),getCurrentRequest().getMethod(),
                ex.getCause(),new Timestamp(new Date().getTime()));
    }


    @ExceptionHandler(HandleExceptionNeedFindById.class)
    public ResponseEntity<HttpErrorDTO> handleExceptionNeedFindById(Exception ex) {
        log.error(" -- ERROR SOPRA STERIA BOOKING : Need not found {} {} {} ",getCurrentRequest().getMethod(),getCurrentRequest().getContextPath(),
                getCurrentRequest().getRequestURI());
        return HttpErrorMapper.buildHttpErrorDTO(ErrorMessages.ERROR_HANDLE_NEED_FIND_BYID.getCode(), HttpStatus.INTERNAL_SERVER_ERROR,
                getCurrentRequest().getServletPath(),ErrorMessages.ERROR_HANDLE_NEED_FIND_BYID.getMessage(),getCurrentRequest().getMethod(),
                ex.getCause(),new Timestamp(new Date().getTime()));
    }
}

