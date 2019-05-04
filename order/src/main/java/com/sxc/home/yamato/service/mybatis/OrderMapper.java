package com.sxc.home.yamato.service.mybatis;

import com.sxc.home.yamato.model.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * Created by shenxiaochao on 2019/3/10.
 */
@Mapper
@Component
public interface OrderMapper {

    @Select("SELECT * FROM `order` where id= #{id}")
    Order findOrder(@Param("id") int id);


    @Insert("INSERT INTO `order`(name,city) VALUES(#{name},#{city})")
    void saveOrder(@Param("name") String name,@Param("city") String city);
}
