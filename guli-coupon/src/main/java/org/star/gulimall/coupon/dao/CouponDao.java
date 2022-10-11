package org.star.gulimall.coupon.dao;

import org.star.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author liangwuuu
 * @email liangwuuu@gmail.com
 * @date 2022-10-11 21:24:32
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
