package org.star.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.star.common.utils.PageUtils;
import org.star.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author liangwuuu
 * @email liangwuuu@gmail.com
 * @date 2022-10-09 17:58:34
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

