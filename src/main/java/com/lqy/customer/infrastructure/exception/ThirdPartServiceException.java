package com.lqy.customer.infrastructure.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName ThirdPartServiceException
 * @Description 第三方服务返回的业务异常，注意是业务异常，区别于CommunicationException在于：请求响应成功，但是业务上没能成功；比如：调用用户体系服务组件查询用户信息，用户体系服务组件返回“查无此人”；
 * @Author lqy
 * @Date 2019/7/4 19:03
 * @Version 1.0
 * @Update
 */
@Getter
@Setter
@ToString
public class ThirdPartServiceException extends BaseException {

    private static final long serialVersionUID = 1184944069954989439L;

}
