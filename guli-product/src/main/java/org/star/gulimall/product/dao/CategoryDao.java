package org.star.gulimall.product.dao;

import org.star.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author liangwuuu
 * @email liangwuuu@gmail.com
 * @date 2022-10-09 17:58:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
