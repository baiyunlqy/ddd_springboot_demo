package com.lqy.customer.infrastructure.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 业务类异常，初始化时使用returnCode 作为message内容传入，具体的message异常参数放在auguments中传入
 *
 * @Author lqy
 * @Date 2019/7/4 19:01
 * @Version 1.0
 * @Update
 */
@Getter
@Setter
@ToString
public class BusinessException extends BaseException {

    private static final long serialVersionUID = 1184944069954989439L;
}
