package com.lqy.customer.domain.repository.entity.customer;


import com.lqy.customer.domain.repository.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class CustomerInfoBase extends BaseEntity<CustomerInfoBase> {

    private long id;
    private String userCode;
    private String idCard;
    private String tel;
    private String email;
    private String name;
    private LocalDateTime dt;
    private String operator;
    private int status;
}
