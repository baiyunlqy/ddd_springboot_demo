package com.lqy.customer.infrastructure.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName BaseException
 * @Description TODO
 * @Author lqy
 * @Date 2019/7/8 15:33
 * @Version 1.0
 * @Update
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
public class BaseException extends Exception {

    private static final long serialVersionUID = 1184944069954989436L;

    /**
     * exception对应的错误码
     */
    private int code;

    public BaseException(String message, int code) {
        super(message);
        this.code = code;
    }
}
