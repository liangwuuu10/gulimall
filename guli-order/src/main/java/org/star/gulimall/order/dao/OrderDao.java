package org.star.gulimall.order.dao;

import org.star.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author liangwuuu
 * @email liangwuuu@gmail.com
 * @date 2023-03-04 22:54:03
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
