package org.star.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 如何引入nacos作为配置中心
 * > 1. 引入依赖: <dependency>
 *                  <groupId>com.alibaba.cloud</groupId>
 *                  <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *               </dependency>
 * > 2.创建一个bootstrap.properties：
 *      spring.application.name=gulimall-coupon
 *      spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 * > 3.需要给配置中心默认添加一个叫 数据集(Data Id) gulimall-coupon.properties. 默认规则：应用名.properties
 * > 4.添加任何配置给到gulimall-coupon.properties
 * > 5.如何动态获取配置？@RefreshScope; @Value(${配置项})
 *
 * >>>>> 若配置中心和当前配置文件，有相同的配置项，优先使用配置中心的配置
 *
 * 3. 细节
 * > 命名空间: 配置隔离
 *  >> 默认: public(保留空间); 默认新增的所有配置都是在public空间
 *  >>> 利用命名空间隔离开发、测试、生产环境
 *      注意: 在bootstrap.properties里，配置上需要使用哪个命名空间的配置: spring.cloud.nacos.config.namespace=baa5640e-67a3-4414-96a4-11926551dab0
 *  >>> 每一个微服务之间互相隔离配置，每个微服务都创建自己的命名空间，各自加载各自的微服务
 * > 配置集: 所有配置的合集
 * > 配置集ID: 类似文件名
 * > 配置分组：默认所有的配置集都属于：DEFAULT_GROUP
 * >> 可以基于微服务下，划分不同的环境，新建不同的组
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GuliCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliCouponApplication.class, args);
    }

}
