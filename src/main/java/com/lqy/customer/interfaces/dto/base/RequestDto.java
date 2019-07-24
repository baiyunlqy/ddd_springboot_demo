package com.lqy.customer.interfaces.dto.base;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;

/**
 * 请求dto
 *
 * @param <T>
 * @author daoqidelv
 * @createdate 2017年10月15日
 */
@Setter
@Getter
@ToString
public class RequestDto<T> implements Dto {

    /**
     * 请求渠道
     */
    private String channel;

    /**
     * 请求id
     */
    private String requestId;

    /**
     * 对body使用validation
     */
    @Valid
    private T body;

}
