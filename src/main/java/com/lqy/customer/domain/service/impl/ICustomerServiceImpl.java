package com.lqy.customer.domain.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lqy.customer.application.service.ICustomerService;
import com.lqy.customer.domain.aggregator.QueryCustomerInfoEntity;
import com.lqy.customer.domain.repository.ICustomerInfoRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;


@Service
public class ICustomerServiceImpl implements ICustomerService {

    @Resource
    private ICustomerInfoRepository iCustomerInfoRepository;

    @Override
    public IPage<QueryCustomerInfoEntity> queryCustomerInfo(Page<QueryCustomerInfoEntity> page, LocalDateTime startTime,
                                                            LocalDateTime endTime,
                                                            int level,
                                                            String name) {

        return iCustomerInfoRepository.queryCustomerInfo(page, startTime,
                endTime, level, name);
    }
}
