package org.star.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.star.common.utils.PageUtils;
import org.star.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author liangwuuu
 * @email liangwuuu@gmail.com
 * @date 2022-10-09 17:58:34
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

