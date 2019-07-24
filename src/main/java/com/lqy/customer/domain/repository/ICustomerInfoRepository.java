package com.lqy.customer.domain.repository;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lqy.customer.domain.aggregator.QueryCustomerInfoEntity;

import java.time.LocalDateTime;

/**
 * @ClassName ICustomerInfoRepository
 * @Description TODO
 * @Author lqy
 * @Date 2019/7/15 18:16
 * @Version 1.0
 * @Update
 */
public interface ICustomerInfoRepository {

    IPage<QueryCustomerInfoEntity> queryCustomerInfo(Page page, LocalDateTime startTime,
                                                     LocalDateTime endTime,
                                                     int level,
                                                     String name);
}
