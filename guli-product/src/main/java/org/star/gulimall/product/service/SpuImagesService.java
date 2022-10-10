package org.star.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.star.common.utils.PageUtils;
import org.star.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author liangwuuu
 * @email liangwuuu@gmail.com
 * @date 2022-10-09 17:58:34
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

