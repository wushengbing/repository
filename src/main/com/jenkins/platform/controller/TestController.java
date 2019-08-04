package com.jenkins.platform.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin
@RequestMapping("/test")
public class TestController {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

	/**
	 * test
	 */
	@RequestMapping(value = "/test", produces ="application/json;charset=UTF-8")
    public String test(@RequestParam(value = "request") String request, HttpServletRequest httpServletRequest){
		LOGGER.info("request:" + request);
        return request;
    }

}
