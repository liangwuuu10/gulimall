package org.star.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.star.gulimall.product.entity.BrandEntity;
import org.star.gulimall.product.service.BrandService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GuliProductApplicationTests {
	@Autowired
	private BrandService brandService;

	@Test
	public void contextLoads() {
//		BrandEntity brandEntity = new BrandEntity();

		List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
		brand_id.forEach(System.out::println);
//		brandEntity.setName("华为");
//		brandService.save(brandEntity);
//		System.out.println("保存成功");

	}

}
