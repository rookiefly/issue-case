package com.rookiefly.issue.mybatiscase.mapper;

import com.rookiefly.issue.mybatiscase.model.Gorder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GorderMapper {

    @Select("SELECT g.gorderId, g.userId, g.amount, o.orderId, o.amount as oamount FROM gorder as g JOIN `order` as o ON g.gorderId = o.gorderId WHERE g.userId = #{userId}")
    @Results({
            @Result(column = "orderId", property = "order.orderId"),
            @Result(column = "oamount", property = "order.amount")
    })
    List<Gorder> gorderList(@Param("userId") String userId);

    @Select("SELECT g.gorderId, g.userId, g.amount, o.orderId, o.amount FROM gorder as g JOIN `order` as o ON g.gorderId = o.gorderId WHERE g.userId = #{userId}")
    @ResultMap("com.rookiefly.issue.mybatiscase.mapper.GorderMapper.GorderResult")
    List<Gorder> gorderListNested(@Param("userId") String userId);

}