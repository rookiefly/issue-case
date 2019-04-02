package com.rookiefly.issue.mybatiscase.mapper;

import com.rookiefly.issue.mybatiscase.model.Hotel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HotelMapper {

    Hotel selectByCityId(int cityId);

}