package com.heriparid.lab.zuulwithsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulwithsecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulwithsecurityApplication.class, args);
	}

}
