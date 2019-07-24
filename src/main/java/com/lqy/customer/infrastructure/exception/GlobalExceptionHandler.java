package com.lqy.customer.infrastructure.exception;

import com.lqy.customer.infrastructure.common.Constants;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ClassName GlobalExceptionHandler
 * @Description 全局异常处理: 使用 @RestControllerAdvice + @ExceptionHandler 注解方式实现全
 * 局异常处理
 * @Author lqy
 * @Date 2019/7/4 18:25
 * @Version 1.0
 * @Update
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    @ExceptionHandler({BusinessException.class})
    public ErrorResponse businessException(BusinessException e) {
        log.error(e.getMessage(), e);
        return new ErrorResponse(!String.valueOf(e.getCode()).isBlank() ? e.getCode() : Constants.BUSINESS_EXCEPTION_CODE,
                !e.getMessage().isBlank() ? e.getMessage() : Constants.BUSINESS_EXCEPTION_MSG);
    }

    @ExceptionHandler({CommunicationException.class})
    public ErrorResponse communicatinException(CommunicationException e) {
        log.error(e.getMessage(), e);
        return new ErrorResponse(!String.valueOf(e.getCode()).isBlank() ? e.getCode() : Constants.COMMUNICATION_EXCEPTION_CODE,
                !e.getMessage().isBlank() ? e.getMessage() : Constants.COMMUNICATION_EXCEPTION_MSG);
    }

    @ExceptionHandler({DataAccessException.class})
    public ErrorResponse dataAccessException(DataAccessException e) {
        log.error(e.getMessage(), e);
        return new ErrorResponse(!String.valueOf(e.getCode()).isBlank() ? e.getCode() : Constants.DATA_ACCESS_EXCEPTION_CODE,
                !e.getMessage().isBlank() ? e.getMessage() : Constants.DATA_ACCESS_EXCEPTION_MSG);
    }

    @ExceptionHandler({ThirdPartServiceException.class})
    public ErrorResponse thirdPartServiceException(ThirdPartServiceException e) {
        log.error(e.getMessage(), e);
        return new ErrorResponse(!String.valueOf(e.getCode()).isBlank() ? e.getCode() : Constants.THIRD_PART_SERVICE_EXCEPTION_CODE,
                !e.getMessage().isBlank() ? e.getMessage() : Constants.THIRD_PART_SERVICE_EXCEPTION_MSG);
    }

    @ExceptionHandler({Exception.class})    //申明捕获那个异常类
    public ErrorResponse globalExceptionHandler(Exception e) {
        log.error(e.getMessage(), e);
        return new ErrorResponse(Constants.UNCATCHED_SYS_EXCEPTION_CODE, Constants.UNCATCHED_SYS_EXCEPTION_MSG);
    }

    @ExceptionHandler({SystemException.class})
    public ErrorResponse systemException(SystemException e) {
        log.error(e.getMessage(), e);
        return new ErrorResponse(!String.valueOf(e.getCode()).isBlank() ? e.getCode() : Constants.SYS_EXCEPTION_CODE,
                !e.getMessage().isBlank() ? e.getMessage() : Constants.SYS_EXCEPTION_MSG);
    }

    @Setter
    @Getter
    @ToString
    @AllArgsConstructor
    private class ErrorResponse {
        private static final long serialVersionUID = 1184944069954089439L;
        private int code;
        private String message;
    }
}
