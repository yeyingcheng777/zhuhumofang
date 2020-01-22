package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.RoundTable;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = ZhihuApiApplication.class)
class RoundTableServiceTest {
    @Resource
    private RoundTableService roundTableService;
    @Test
    void selectRecent() {
        List<RoundTable> roundTableList = roundTableService.selectRecent();
        roundTableList.forEach(System.out::print);
    }
}