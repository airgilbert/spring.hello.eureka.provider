package com.air.eureka.provider;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableEurekaClient

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/getUser")
	@ResponseBody
	public Map<String, Object> getUser(@RequestParam(defaultValue = "1", required = false) Integer id) {
		Map<String, Object> reMap = new HashMap<String, Object>();
		reMap.put("name", "骆志鹏");
		reMap.put("id", id);
		reMap.put("from", "provider-A");
		return reMap;
	}

}
