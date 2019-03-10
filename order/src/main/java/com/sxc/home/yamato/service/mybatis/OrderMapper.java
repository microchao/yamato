package com.sxc.home.yamato.service.mybatis;

import com.sxc.home.yamato.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by shenxiaochao on 2019/3/10.
 */
@Mapper
public interface OrderMapper {

    @Select("SELECT * FROM Order WHERE id = #{id}")
    Order findOrder(@Param("id") int id);

}