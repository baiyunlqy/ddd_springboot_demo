package com.lqy.customer.infrastructure.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName CommunicationException
 * @Description 通讯相关异常，出现此异常，表明系统出现了故障，需要做友好提示；往往是和第三方服务交互时，第三方服务不可用或者响应超时；
 * @Author lqy
 * @Date 2019/7/4 19:01
 * @Version 1.0
 * @Update
 */
@Getter
@Setter
@ToString
public class CommunicationException extends BaseException {

    private static final long serialVersionUID = 1184944069954989430L;
}
