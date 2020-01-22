package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.Favorite;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@SpringBootTest(classes = ZhihuApiApplication.class)
class FavoriteMapperTest {
    @Resource
    private FavoriteMapper favoriteMapper;

    @Test
    void selectRecent() {
        List<Favorite> favorites = favoriteMapper.selectRecent();
        favorites.forEach(System.out::println);
    }

    @Test
    void selectAll() {
        List<Map> favorites = favoriteMapper.selectAll();
        favorites.forEach(System.out::println);
    }
}