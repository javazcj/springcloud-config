package com.zcj.study.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>Title: ConfigServerApplication.java</p>
 * <p>Description: springboot 配置中心的启动入口</p>
 * <p>Copyright: Copyright (c) 2017 ****信息技术有限公司</p>
 * <p>Company: ****信息技术有限公司</p>
 * <p>Author:我不痛，棍子痛</p>
 * <p>CreateTime:2019年8月11日下午8:42:27
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class})
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerApplication {

	public static void main( String[] args ) {
		SpringApplication.run(ConfigServerApplication.class, args);
		System.out.println("================ConfigServerApplication has started!!!==============");
	}

}
