package com.rookiefly.issue.mybatiscase.mapper;

import com.rookiefly.issue.mybatiscase.model.Gorder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface GorderMapper {

    @Select("SELECT * FROM gorder WHERE user_id = #{userId}")
    Gorder orderList(@Param("userId") String userId);

}