package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Favorite;

import java.util.List;
import java.util.Map;

public interface FavoriteService {
    /**
     * 查询最新收藏
     * @return List<Favorite>
     */
    List<Favorite> selectRecent();

    /**
     * 查询所有收藏
     * @return List<Map>
     */
    List<Map> selectAll();
}

