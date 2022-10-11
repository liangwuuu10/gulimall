package org.star.gulimall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.star.common.utils.PageUtils;
import org.star.common.utils.Query;

import org.star.gulimall.order.dao.OmsOrderReturnReasonDao;
import org.star.gulimall.order.entity.OmsOrderReturnReasonEntity;
import org.star.gulimall.order.service.OmsOrderReturnReasonService;


@Service("omsOrderReturnReasonService")
public class OmsOrderReturnReasonServiceImpl extends ServiceImpl<OmsOrderReturnReasonDao, OmsOrderReturnReasonEntity> implements OmsOrderReturnReasonService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OmsOrderReturnReasonEntity> page = this.page(
                new Query<OmsOrderReturnReasonEntity>().getPage(params),
                new QueryWrapper<OmsOrderReturnReasonEntity>()
        );

        return new PageUtils(page);
    }

}