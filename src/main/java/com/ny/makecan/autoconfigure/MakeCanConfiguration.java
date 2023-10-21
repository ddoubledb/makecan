package com.ny.makecan.autoconfigure;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@ComponentScan(basePackages = "com.ny.makecan")
@EnableConfigurationProperties
public class MakeCanConfiguration implements InitializingBean, DisposableBean {
	
	@Autowired
	private MakeCanProperties properties;

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("properties=" + properties.toString());
		log.info("MakeCan application has started.");
	}

	@Override
	public void destroy() throws Exception {
		log.info("MakeCan application is stopped.");
	}


}
