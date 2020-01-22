package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.RoundTable;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface RoundTableMapper {

    /**
     * 查询最新专辑
     * @return List<RoundTable>
     */
    @Select("SELECT * FROM t_round_table ORDER BY visits_count DESC LIMIT 0,4 ")
    List<RoundTable> selectRecent();

    /**
     * 查询所有专辑
     * @return List<Map>
     */
    @Select("SELECT * FROM t_round_table ")
    @Results({
            @Result(id = true,property = "id",column = "id",javaType = Integer.class),
            @Result(property = "name",column = "name",javaType = String.class),
            @Result(property = "banner",column = "banner",javaType = String.class),
            @Result(property = "urlToken",column = "url_token",javaType = String.class),
            @Result(property = "visitsCount",column = "visits_count",javaType = String.class),
            @Result(property = "includeCount",column = "include_count",javaType = String.class),
    })
    List<Map> selectAll();
}
