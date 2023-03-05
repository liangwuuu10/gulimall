package org.star.gulimall.order.dao;

import org.star.gulimall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author liangwuuu
 * @email liangwuuu@gmail.com
 * @date 2023-03-04 22:54:04
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
