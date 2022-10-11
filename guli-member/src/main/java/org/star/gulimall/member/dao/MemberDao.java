package org.star.gulimall.member.dao;

import org.star.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author liangwuuu
 * @email liangwuuu@gmail.com
 * @date 2022-10-11 21:46:13
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
