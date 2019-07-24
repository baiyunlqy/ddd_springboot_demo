package com.lqy.customer.interfaces.dto.customer;

import com.lqy.customer.interfaces.dto.base.ResponseBody;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @ClassName CustomerInfoResponseBody
 * @Description TODO
 * @Author lqy
 * @Date 2019/7/15 20:00
 * @Version 1.0
 * @Update
 */
@Getter
@Setter
public class CustomerInfoResponseBody extends ResponseBody {
    private static final long serialVersionUID = 1L;

    private String name;
    private String tel;
    private String levelName;
    private long points;
    private LocalDateTime createTime;
}
