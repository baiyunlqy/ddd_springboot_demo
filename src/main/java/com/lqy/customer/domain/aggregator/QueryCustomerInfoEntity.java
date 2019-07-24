package com.lqy.customer.domain.aggregator;

import com.lqy.customer.domain.repository.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @ClassName QueryUserInfoOut
 * @Description TODO
 * @Author lqy
 * @Date 2019/7/12 16:18
 * @Version 1.0
 * @Update
 */
@Setter
@Getter
public class QueryCustomerInfoEntity extends BaseEntity<QueryCustomerInfoEntity> {
    private String name;
    private String tel;
    private String levelName;
    private long points;
    private LocalDateTime dt;
}
