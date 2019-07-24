package com.lqy.customer.interfaces.dto.base;

import com.lqy.customer.infrastructure.common.Constants;
import lombok.*;

/**
 * 响应dto
 *
 * @author daoqidelv
 * @createdate 2017年10月15日
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ResponseDto implements Dto {
    /**
     * 状态码
     */
    private int resCode;

    /**
     * 提示信息
     */
    private String resMsg;

    /**
     * 各个接口返回的数据
     */
    private Object body;

    public ResponseDto(Object body) {
        this.resCode = Constants.SUCCESS;
        this.resMsg = Constants.SUCCESS_MSG;
        this.body = body;
    }

}
