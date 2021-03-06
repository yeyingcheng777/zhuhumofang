package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.RoundTable;

import java.util.List;
import java.util.Map;

public interface RoundTableService {
    /**
     * 查询所有圆桌
     * @return List<Map>
     */
    List<Map> selectAll();

    /**
     * 查询最新圆桌
     * @return List<RoundTable>
     */
    List<RoundTable> selectRecent();
}