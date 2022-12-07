package com.boot.jenkins.docker.rest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/docker/jenkins")
public class DockerJenkinsController {

	@GetMapping("/details")
	public Map<String, Object> getDetails() {

		Map<String, Object> hashMap = new LinkedHashMap<String, Object>();
		hashMap.put("name", "Ratna Srinivasa Rao Karicherla");
		hashMap.put("subject", "Docker Jenkins");
		hashMap.put("goal", "Mastering Jenkins CI/CD with docker ....");
		return hashMap;
	}
}
