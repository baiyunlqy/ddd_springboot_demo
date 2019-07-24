package com.lqy.customer;

import com.alibaba.fastjson.JSON;
import com.lqy.customer.interfaces.dto.base.ResponseDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = {"management.port=0"})
public class CustomerApplicationTests {


    @Resource
    private TestRestTemplate restTemplate;

    @Test
    public void test() {
        ResponseEntity<ResponseDto> responseEntity = restTemplate.
                getForEntity("http://localhost:8084/customer/file/1/10?channel=1&requestId=2&startTime=2019-07-15 00:00:00&endTime=2019-07-15 23:59:59&level=1", ResponseDto.class);
        System.out.println(JSON.toJSONString(responseEntity.getBody()));
    }

}
