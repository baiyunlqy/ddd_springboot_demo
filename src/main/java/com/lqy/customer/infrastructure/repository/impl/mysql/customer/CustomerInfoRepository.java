package com.lqy.customer.infrastructure.repository.impl.mysql.customer;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lqy.customer.domain.aggregator.QueryCustomerInfoEntity;
import com.lqy.customer.domain.repository.ICustomerInfoRepository;
import com.lqy.customer.infrastructure.persistence.mysql.mapper.customer.CustomerInfoMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * @ClassName ICustomerInfoRepository
 * @Description TODO
 * @Author lqy
 * @Date 2019/7/15 18:17
 * @Version 1.0
 * @Update
 */
@Repository
public class CustomerInfoRepository implements ICustomerInfoRepository {

    @Resource
    private CustomerInfoMapper customerInfoMapper;

    @Override
    public IPage<QueryCustomerInfoEntity> queryCustomerInfo(Page page, LocalDateTime startTime, LocalDateTime endTime,
                                                            int level, String name) {
        return customerInfoMapper.select(page, startTime, endTime, level, name);
    }
}
