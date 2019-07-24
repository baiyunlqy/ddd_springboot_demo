package com.lqy.customer.interfaces.controller.customer;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lqy.customer.application.assembler.CustomerAssembler;
import com.lqy.customer.interfaces.controller.BaseController;
import com.lqy.customer.interfaces.dto.base.RequestDto;
import com.lqy.customer.interfaces.dto.base.ResponseDto;
import com.lqy.customer.interfaces.dto.customer.CostomerInfoRequestBody;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 帖子 模块对应控制器
 *
 * @author daoqidelv
 * @createdate 2017年10月15日
 */
@RestController
@RequestMapping("/customer")
@Slf4j
public class CustomerController extends BaseController {

    @Resource
    private CustomerAssembler customerAssembler;

    /**
     * @Description
     * @Param [current, size, userFileRequestBody]
     * @Return java.lang.Object
     * @Cteator lqy
     * @Date 2019/7/15 20:12
     * @Updater
     * @Date
     */
    @GetMapping(value = "/file/{current}/{size}")
    public ResponseDto get(@PathVariable("current") int current, @PathVariable("size") int size,
                           RequestDto dto, CostomerInfoRequestBody body) {

        return this.formatSuccessResponse(customerAssembler.
                queryCustomerInfoAssembler(new Page<>(current, size), body));
    }
}
