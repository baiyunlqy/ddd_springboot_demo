package com.lqy.customer.domain.repository.entity.customer;


import com.lqy.customer.domain.repository.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CustomerChargeRelation extends BaseEntity<CustomerChargeRelation> {

    private long id;
    private double totalConsume;
    private double balance;
    private String userCode;
}
