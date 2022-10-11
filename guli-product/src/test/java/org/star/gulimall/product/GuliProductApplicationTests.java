package org.star.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.star.gulimall.product.entity.BrandEntity;
import org.star.gulimall.product.service.BrandService;

import java.util.List;

@SpringBootTest
class GuliProductApplicationTests {
	@Autowired
	private BrandService brandService;

	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();

		List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
		brand_id.forEach((item) -> {
			System.out.println(item);
		});

	}

}
