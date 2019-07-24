package com.lqy.customer.domain.repository.entity.vip;

import com.lqy.customer.domain.repository.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Description VIP表的领域实体。有唯一标识，可变的业务实体对象，它有着自己的生命周期。
 * 比如社区这一业务领域中，‘帖子’就是一个业务实体，它需要有一个唯一性业务标识表征，同时他的状态和内容可以不断发生变化。
 * @Cteator lqy
 * @Date 2019/7/5 15:25
 * @Updater
 * @Date
 */
@Setter
@Getter
public class VipCustomerRelation extends BaseEntity<VipCustomerRelation> {

    private long id;
    private String userCode;
    private int level;
    private String levelName;
    private long points;
    private int changeType;
    private String operator;

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
