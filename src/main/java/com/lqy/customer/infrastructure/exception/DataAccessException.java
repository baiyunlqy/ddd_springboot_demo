package com.lqy.customer.infrastructure.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName DataAccessException
 * @Description 持久层返回的数据存取相关的异常，可能是程序bug或者系统故障，需要做友好提示
 * @Author lqy
 * @Date 2019/7/4 19:02
 * @Version 1.0
 * @Update
 */
@Setter
@Getter
public class DataAccessException extends BaseException {

    private static final long serialVersionUID = 1184944069954989435L;

}
