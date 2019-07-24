package com.lqy.customer.infrastructure.persistence.mysql.mapper.customer;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lqy.customer.domain.aggregator.QueryCustomerInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;

/**
 * @ClassName CustomerInfoMapper
 * @Description TODO
 * @Author lqy
 * @Date 2019/7/15 18:20
 * @Version 1.0
 * @Update
 */
@Mapper
@DS("slave0")
public interface CustomerInfoMapper {

    IPage<QueryCustomerInfoEntity> select(Page page, @Param("startTime") LocalDateTime startTime,
                                                           @Param("endTime") LocalDateTime endTime,
                                                           @Param("level") int level,
                                                           @Param("name") String name);
}
