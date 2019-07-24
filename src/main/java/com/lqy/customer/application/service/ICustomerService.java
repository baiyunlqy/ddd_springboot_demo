package com.lqy.customer.application.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lqy.customer.domain.aggregator.QueryCustomerInfoEntity;

import java.time.LocalDateTime;

/**
 * @ClassName IUserService application层的service与domain层service的区别在于，
 * 这一层的service处理与domain无关的操作
 * @Description TODO
 * @Author lqy
 * @Date 2019/7/8 14:54
 * @Version 1.0
 * @Update
 */
public interface ICustomerService {

    IPage<QueryCustomerInfoEntity> queryCustomerInfo(Page<QueryCustomerInfoEntity> page, LocalDateTime startTime,
                                                 LocalDateTime endTime,
                                                 int level,
                                                 String name);

}
