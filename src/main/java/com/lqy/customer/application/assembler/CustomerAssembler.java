package com.lqy.customer.application.assembler;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lqy.customer.application.service.ICustomerService;
import com.lqy.customer.domain.aggregator.QueryCustomerInfoEntity;
import com.lqy.customer.interfaces.dto.customer.CostomerInfoRequestBody;
import com.lqy.customer.interfaces.dto.customer.CustomerInfoResponseBody;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Post模块的组装器，完成domain model对象到dto的转换，组装职责包括：
 * 1、完成类型转换、数据格式化；如日志格式化，状态enum装换为前端认识的string；
 * 2、将多个model组合成一个dto，一并返回。
 */
@Component
public class CustomerAssembler extends Assembler {

    @Resource
    private ICustomerService iCustomerService;


    public IPage<CustomerInfoResponseBody> queryCustomerInfoAssembler(Page<QueryCustomerInfoEntity> page, CostomerInfoRequestBody body) {
        IPage<QueryCustomerInfoEntity> iPage = iCustomerService.queryCustomerInfo(page, body.getStartTime(),
                body.getEndTime(), body.getLevel(), body.getName());
        List<CustomerInfoResponseBody> bodyList = new ArrayList<>();
        iPage.getRecords().forEach(it -> bodyList
                .add(this.assembleRespBody(it, new CustomerInfoResponseBody())));
        IPage<CustomerInfoResponseBody> bodyPage = new Page<>();
        BeanUtils.copyProperties(iPage, bodyPage);
        bodyPage.setRecords(bodyList);
        return bodyPage;
    }
}
