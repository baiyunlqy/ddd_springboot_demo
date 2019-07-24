package com.lqy.customer.interfaces.dto.customer;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @ClassName UserFileRequestBody
 * @Description TODO
 * @Author lqy
 * @Date 2019/7/15 19:31
 * @Version 1.0
 * @Update
 */
@Getter
@Setter
public class CostomerInfoRequestBody {

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int level;
    private String name;
}
