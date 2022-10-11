package org.star.gulimall.order.dao;

import org.star.gulimall.order.entity.OmsOrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author liangwuuu
 * @email liangwuuu@gmail.com
 * @date 2022-10-11 22:14:12
 */
@Mapper
public interface OmsOrderDao extends BaseMapper<OmsOrderEntity> {
	
}
