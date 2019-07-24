package com.lqy.customer.application.assembler;

import com.lqy.customer.domain.repository.entity.BaseEntity;
import com.lqy.customer.interfaces.dto.base.ResponseBody;
import org.springframework.beans.BeanUtils;

/**
 * @ClassName Assembler
 * @Description TODO
 * @Author lqy
 * @Date 2019/7/17 14:14
 * @Version 1.0
 * @Update
 */
public class Assembler {
    protected <T extends BaseEntity, V extends ResponseBody> V assembleRespBody(T entity, V responseBody) {
        if (null == entity) {
            return null;
        }
        BeanUtils.copyProperties(entity, responseBody);
        return responseBody;
    }
}
