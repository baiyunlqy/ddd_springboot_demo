package com.lqy.customer.interfaces.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lqy.customer.interfaces.dto.base.ResponseBody;
import com.lqy.customer.interfaces.dto.base.ResponseDto;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

/**
 * 基础控制器类，提供通用的方法处理
 *
 * @author daoqidelv
 * @createdate 2017年10月15日
 */
public class BaseController {

    private static Logger logger = LogManager.getLogger(BaseController.class);

    /**
     * format成功的response
     *
     * @param responseBody
     * @return ResponseDto
     */
    protected <T extends ResponseBody> ResponseDto formatSuccessResponse(T responseBody) {
        return new ResponseDto(responseBody);
    }

    /**
     * format成功的response
     *
     * @param responseBodyList
     * @return ResponseDto
     */
    protected <T extends ResponseBody> ResponseDto formatSuccessResponse(List<T> responseBodyList) {
        return new ResponseDto(responseBodyList);
    }

    /**
     * format成功的response
     *
     * @param responseBodyList
     * @return ResponseDto
     */
    protected <T extends ResponseBody> ResponseDto formatSuccessResponse(IPage<T> responseBodyList) {
        return new ResponseDto(responseBodyList);
    }
}
