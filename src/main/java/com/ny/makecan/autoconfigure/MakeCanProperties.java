package com.ny.makecan.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(value = "ny.makecan")
public class MakeCanProperties implements Cloneable {
	
	private String ipAddress;
	
	private Integer port;

}
