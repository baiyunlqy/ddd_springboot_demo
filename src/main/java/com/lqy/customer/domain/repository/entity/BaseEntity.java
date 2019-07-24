package com.lqy.customer.domain.repository.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Description base领域实体
 * @Cteator lqy
 * @Date 2019/7/5 15:33
 * @Updater
 * @Date
 */

@Getter
@Setter
public class BaseEntity<T extends Model<?>> extends Model<T> {


    /**
     * 记录创建时间戳
     */
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    /**
     * 备注
     */
    private String remarks;
    @Version
    private Integer version;
    //0: 正常 1:删除
    @TableLogic
    private Integer delFlag;
}
